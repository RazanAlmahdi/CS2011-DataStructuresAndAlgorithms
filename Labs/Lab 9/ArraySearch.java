// package lec9;

// public class ArraySearch {

// 	public static int linearSearch(int arr[], int x)
//     {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == x)
//                 return i;
//         }
//         return -1;}
	
// 	public static int binarySearchRecursive(int arr[], int l, int r, int x)
//     {
//         if (r >= l) {
//             int mid = l + (r - l) / 2;

//             if (arr[mid] == x)
//                 return mid;
 
//             if (arr[mid] > x)
//                 return binarySearchRecursive(arr, l, mid - 1, x);

//             return binarySearchRecursive(arr, mid + 1, r, x);
//         }
 
//         return -1;
//     }
        
// 	public static int binarySearchIterative(int arr[], int x)
// 	    {
// 	        int l = 0, r = arr.length - 1;
// 	        while (l <= r) {
// 	            int m = l + (r - l) / 2;
	 
	          
// 	            if (arr[m] == x)
// 	                return m;
	 
	          
// 	            if (arr[m] < x)
// 	                l = m + 1;
	 
// 	            else
// 	                r = m - 1;
// 	        }
	 
// 	        return -1;
// 	    }
        
 

// 	 public static void main(String args[])
// 	    {
		 
// 		 int arr[] = { 1, 6 , 8, 11, 56, 99, 107 };
// 	        int x = 99;
	 
// 	        System.out.print("Linear search: \n");
// 	        int result = linearSearch(arr, x);
// 	        if (result == -1)
// 	            System.out.print("Element is not in array");
// 	        else
// 	            System.out.print("Element is at index " + result + "\n");
	
// 	 //------------------------------------------------
	        
// 	        System.out.print("\nBinary search (Iterative):\n");
	        
// 	        ArraySearch ob = new ArraySearch();
// 	        int arr1[] = { 1, 6, 8, 11, 56, 99, 107};
// 	        int n = arr1.length;
// 	        int x1 = 10;
// 	        int result1 = ob.binarySearchIterative(arr1, x1);
// 	        if (result1 == -1)
// 	            System.out.println("Element is not in array");
// 	        else
// 	            System.out.println("Element is at index " + result1);
	        
// 	 //-------------------------------------------------
	        
// 	        System.out.print("\nBinary search (Recursion):\n");
	        
// 	        ArraySearch ob2 = new ArraySearch();
// 	        int arr2[] = {1, 6, 8, 11, 56, 99, 107};
// 	        int n1 = arr2.length;
// 	        int x2 = 11;
// 	        int result2 = ob2.binarySearchRecursive(arr2, 0, n1 - 1, x2);
// 	        if (result2 == -1)
// 	            System.out.println("Element is not in array");
// 	        else
// 	            System.out.println("Element is at index " + result2);
// }}
