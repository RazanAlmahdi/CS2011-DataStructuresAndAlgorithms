public class QuickSort //O(nlogn)
{
	public void sort(int[] arr, int l, int r)
	{
		if (l<r)
		{
			int piv = partition(arr, l, r);
			sort(arr, l, piv-1);
			sort(arr, piv+1, r);
		}
	}
	public int partition(int []arr, int l, int r)
	{
		int i = l;
		int j = r;
		int pivLoc = i;
		while (true)
		{
			while (arr[pivLoc] <= arr[j] && pivLoc !=j)
			{
				j--;
			}
			if (pivLoc == j)
				break;
			else if (arr[pivLoc] > arr[j])
			{
				int temp = arr[j];
				arr[j] = arr[pivLoc];
				arr[pivLoc] = temp;
				pivLoc = j;
			}
			while (arr[pivLoc] >= arr[i] && pivLoc != i)
				i++;
			if (pivLoc == i)
				break;
			else if (arr[pivLoc] < arr[i])
			{
				int temp = arr[i];
				arr[i] = arr[pivLoc];
				arr[pivLoc] = temp;
				pivLoc = i;
			}
		}
		return pivLoc;
	}
}
