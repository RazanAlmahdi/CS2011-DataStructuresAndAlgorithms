public class Test
{
	public static void main(String args[])
	{
		int arr[] = {1, 9, 3, 8, -1, 100, 0, 2, 8, 10};
		int l = 0;
		int r = arr.length-1;
		
		System.out.println("selection sort");
		//selection sort
		SelectionSort selection = new SelectionSort();
		selection.sort(arr);
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
    
		System.out.println("\n\ninsertion sort");
		//insertion sort
		InsertionSort insertion = new InsertionSort();
		insertion.sort(arr);
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		
		System.out.println("\n\nmerge sort");
		//merge sort
		MergeSort merge = new MergeSort();
		merge.sort(arr, l, r);
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		
		System.out.println("\n\nquick sort");
		//quick sort
		QuickSort quick = new QuickSort();
		quick.sort(arr, l, r);
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
				
		System.out.println("\n\nheap sort");
		//heap sort
		HeapSort heap = new HeapSort();
		heap.sort(arr);
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");	
			
		System.out.println('\n');	
		
	}
}
