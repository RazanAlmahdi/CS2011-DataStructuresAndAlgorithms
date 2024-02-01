package lec10;

public class Q1 {
	
	public static void selectionSort(int[] a)
	{
		for (int i =0; i <a.length; i++) {
			
		int minIndex = i;
		for(int j=i+1; j <a.length; j++)
		{
			if(a[j] < a[minIndex])
				minIndex = j;
		}
		int temp = a[i];
		a[i] = a[minIndex];
		a[minIndex] = temp;
	}
	}
	
	static void selectionSortString(String arr[],int n)
	{
	    // One by one move boundary of unsorted subarray
	    for(int i = 0; i < n - 1; i++)
	    {
	     
	        // Find the minimum element in unsorted array
	        int min_index = i;
	        String minStr = arr[i];
	        for(int j = i + 1; j < n; j++)
	        {
	             
	            /*compareTo() will return a -ve value,
	            if string1 (arr[j]) is smaller than string2 (minStr)*/
	            // If arr[j] is smaller than minStr
	         
	            if(arr[j].compareTo(minStr) < 0)
	            {
	                // Make arr[j] as minStr and update min_idx
	                minStr = arr[j];
	                min_index = j;
	            }
	        }
	 
	    // Swapping the minimum element
	    // found with the first element.
	    if(min_index != i)
	    {
	        String temp = arr[min_index];
	        arr[min_index] = arr[i];
	        arr[i] = temp;
	    }
	    }}
	    
	public static void selectionSortNI(int [] a)  {
		
		for (int i = 0; i <a.length; i++) {
			int maxIndex = i;
			for ( int j = i+1; j <a.length; j++)
			{
				if (a [j] > a[maxIndex])
					maxIndex = j;
			}
			int temp = a[i];
			a [i] = a[maxIndex];
			a[maxIndex] = temp;
		}
	
	}

	 public static void main(String args[])
	    {int [] arr = {2,-5,10,5,3,2,6};
	    selectionSort(arr);
	    
	    System.out.print("\n------------------"
	    		+ "--------------\n");
	    System.out.print("Selection sort:\n\n");
	    for (int i =0; i <arr.length; i++) {
	    	System.out.print( arr[i] + " ");
	    }
	    
	    System.out.print("\n------------------"
	    		+ "--------------\n");
	    System.out.print("\nExercise 1:\n\n");
	    
	    int arr2 [] = {1,10,5,17, 88, 6};
	    selectionSortNI(arr2);
	
	    for (int i =0; i < arr2.length; i++) {
	    	System.out.print( arr2[i] + " ");
	    }
	    
	    System.out.print("\n------------------"
	    		+ "--------------\n");
	    System.out.print("Exercise 2:\n");
	    
	    String arr1[] = {"Lawleit", "Starstorm", "Kento", "Toshiro", "Gintoki", "Kento", "Toshiro"};
              
int n = arr1.length;
    System.out.println("\nArray pre-sort:\n");
      

for(int i = 0; i < n; i++)
{
    System.out.print(arr1[i] + " ");
}
System.out.println();

selectionSortString(arr1, n);

System.out.println("\nArray after-sort: \n");
 

for(int i = 0; i < n; i++)
{
    System.out.print(arr1[i]+ " ");
}
}
	    }


