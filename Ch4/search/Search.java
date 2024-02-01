public class Search
{
	public static void main(String[] args)
	{
		int a[] = new int[10000];
		for (int i=0; i<a.length; i++)
			a[i] = i+1;
		
		//linear search
		long startingTime = System.nanoTime();
		System.out.println("linear search output: " + linearSearch(a, 504));
		long endingTime = System.nanoTime();
		System.out.println("linear search in seconds: " + (endingTime - startingTime) / 1000); //running time in micro seconds
		
		//binary search
		// iterations
		startingTime = System.nanoTime();
		System.out.println("\niterative binary search output: " + binarySearch(a, 504));
		endingTime = System.nanoTime();
		System.out.println("iterative binary search running time in micro seconds: " + (endingTime - startingTime) / 1000);
		
		// recursion
		startingTime = System.nanoTime();
		System.out.println("\nrecursive binary search output: " + binarySearch(a, 504, 0, a.length-1));
		endingTime = System.nanoTime();
		System.out.println("recursive binary search running time in micro seconds: " + (endingTime - startingTime) / 1000);
	}
	public static int linearSearch(int []a, int x) //O(n)
	{
		for (int i=0; i<a.length; i++)
			if (a[i] == x)
				return i;
		return -1;
	}
	
	//using iterations
	public static int binarySearch(int []a, int x) //O(log n) but the array has to be sorted
	{
		int low = 0;
		int high = a.length-1;
		int mid;
		while (low <= high)
		{
			mid = (low+high)/2;
			if (x == a[mid])
				return mid;
			else if (x > a[mid])
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}
	
	//using recursion
	public static int binarySearch(int []a, int x, int low, int high) //O(log n) but the array has to be sorted
	{
		int mid;
		if (low > high)
			return -1;
		else 
			mid = (low+high)/2;
		
		if (x == a[mid])
			return mid;
		else if (x > a[mid])
			return binarySearch(a, x, mid+1, high);
		else
			return binarySearch(a, x, low, mid-1);
	}
}
