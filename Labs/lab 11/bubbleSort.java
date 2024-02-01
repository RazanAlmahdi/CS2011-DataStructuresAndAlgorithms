public class bubbleSort {
    static int comparison = 0;
    public static void bubbleSort_inc(int [] a)
    {
    	for (int i = 0; i<a.length -1; i++) 
    	{
        for(int j = 0; j <a.length-1-i; j++)
        {
            if(a[j]> a[j+1])
            {
            	comparison++;
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
        }
    	}
    	System.out.println(" \n-------------------------\n ");
    	System.out.println("non decreasing order: \n ");
    	
    	System.out.println("comparisons count : " + comparison);
    }

    public static void bubbleSort_dec(int [] a)
    {
    	for (int i = 0; i<a.length; i++) 
    	{
    		int maxIndex = i;
        for(int j = i+1; j <a.length; j++)
        {
            if(a[j]> a[maxIndex])
            {
            	maxIndex = j;}
            
                int temp = a[maxIndex];
                a[maxIndex] = a[i];
                a[i] = temp;
            }
        comparison++;
        }
    	System.out.println(" \n-------------------------\n ");
    	System.out.println("non increasing order: \n ");
    	System.out.println("comparisons count : " + comparison);
    	} 	


    public static void selectionSort(int [] a)
    {
    	
    	for (int i = 0; i<a.length; i++)
    	{
    		int minIndex = i;
    		for (int j=i+1; j<a.length; j++)
    		{
    			if(a[j] < a[minIndex])
    				minIndex = j;
    		}
    		int temp = a[i];
    		a[i] = a[minIndex];
    		a[minIndex] = temp;
    	}
    	
    }
    public static void main(String[] args){
        int [] arr ={2,-5,10,5,3,2,6};
        
        
        System.out.println(" \n-------------------------\n ");
    	System.out.println("unsorted array: \n ");
    	
    	for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    	bubbleSort_inc(arr);
    	
    	for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    	
        bubbleSort_dec(arr);
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
