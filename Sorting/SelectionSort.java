public class SelectionSort
{
	//selection sort both best and worst case: O(n^2)
	public void sort(int a[]) // nondecreasing
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
}
