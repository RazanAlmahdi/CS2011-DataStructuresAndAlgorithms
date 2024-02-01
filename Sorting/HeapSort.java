public class HeapSort //O(nlogn)
{
	public void sort(int[] arr)
	{
		int n = arr.length;
		buildHeap(arr, n);
		for (int i=n-1; i>0; i--)
		{
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, i, 0);
		}
	}
	public void heapify(int []arr, int n, int i)
	{
		int l = 2*i + 1;
		int r = 2*i + 2;
		int max = i; //max is the root
		if (l<n && arr[l] > arr[max])
			max = l;
		if (r<n && arr[r] > arr[max])
			max = r;
		if (max != i)
		{
			int temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;
			heapify(arr, n, max);
		}
	}
	public void buildHeap(int []arr, int n)
	{
		for (int i=n/2-1; i>=0; i--)
			heapify(arr, n, i);
	}
}
