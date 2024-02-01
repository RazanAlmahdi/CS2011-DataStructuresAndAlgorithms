public class MergeSort // O(nlogn)
{
	public void sort(int[] arr, int l, int r)
	{
		if (l<r) //elements are > 1
		{
			int mid = (l + r) / 2;
			sort(arr, l, mid);
			sort(arr, mid+1, r);
			merge(arr, l, mid, r);
		}
	}
	public void merge(int[] arr, int l, int mid, int r)
	{
		//temp array
		int sorted[] = new int[r-l+1];

        int i = l;
        int j = mid+1;
        int k = 0;
        
        while (k<sorted.length)
        {
        	if(j<=r && arr[i] > arr[j])
        	{
        		sorted[k] = arr[j];
        		j++;
        		k++;
        	}
        	else if(i<=mid)
        	{
        		sorted[k] = arr[i];
        		i++;
        		k++;
        	}
        	else
        	{
        		sorted[k] = arr[j];
        		j++;
        		k++;
        	}
        }
		for (i=l, j=0; i<=r; i++,j++)
			arr[i] = sorted[j];
	}
}
