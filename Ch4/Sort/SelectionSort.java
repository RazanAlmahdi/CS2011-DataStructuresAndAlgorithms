public class SelectionSort
{
	public static void main(String args[])
	{
		int arr[] = {1, 9, 3, 8, -1, 100, 0, 2, 3, 8, 10};
		String arr1[] = {"E", "A", "C", "a", "B", "D", "B"};
		
		selectionSort1(arr); // nondecreasing
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		
		System.out.println('\n');
		
		selectionSort2(arr); // non-increasing
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		
		System.out.println('\n');
		
		selectionSort(arr1); // nondecreasing strings
		for (int i=0; i<arr1.length; i++)
			System.out.print(arr1[i] + " ");
	}
	
	//selection sort both best and worst case: O(n^2)
	
	public static void selectionSort1(int a[]) // nondecreasing
	{
		for (int i=0; i<a.length-1; i++)
		{
			int minIndex = i;
			
			for (int j=i+1; j<a.length; j++)
				if (a[j] < a[minIndex])
					minIndex = j;
			
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
	}
	
	public static void selectionSort2(int a[]) // non-increasing
	{
		for (int i=0; i<a.length-1; i++)
		{
			int maxIndex = i;
			
			for (int j=i+1; j<a.length; j++)
				if (a[j] > a[maxIndex])
					maxIndex = j;
			
			int temp = a[i];
			a[i] = a[maxIndex];
			a[maxIndex] = temp;
		}
	}
	
	public static void selectionSort(String a[]) // nondecreasing for strings
	{
		for (int i=0; i<a.length-1; i++)
		{
			int minIndex = i;
			for (int j=i+1; j<a.length; j++)
				if (a[j].compareTo(a[minIndex]) < 0) //< 0 if the string is lexicographically less than the other string
					minIndex = j;
			
			String temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
	}
}

