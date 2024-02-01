public class BubbleSort
{
  //Best case: O(n)
  //Worst case: O(n^2)
	public static void sort(int[] arr)
	{
		boolean flag = true;
		for (int i = 0; i<arr.length-1; i++)
		{
			for (int j=0; j<arr.length-1-i; j++)
				if (arr[j] > arr[j+1])
				{
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					flag = false;
				}
			//after the first pass, check if anything was swapped or not (break if flag was still true)
			if (flag)
				break;
		}
	}
	
	public static void main(String args[])
	{
		int arr[] = {1, 9, 3, 8, -1, 100, 0, 2, 8, 10};
		
		sort(arr); // nondecreasing
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
