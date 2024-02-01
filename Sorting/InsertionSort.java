public class InsertionSort
{
	//O(n^2)
	public void sort(int []arr)
	{
		for (int i=0; i<arr.length-1; i++)
		{
			int j = i;
			int key = arr[i+1];
			
			while (j>=0 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
}
