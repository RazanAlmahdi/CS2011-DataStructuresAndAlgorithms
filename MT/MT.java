/*
 Given a sorted array [0...n-1], it contains all integers from 0 to n except one missing integer
 write two methods that find the missing integer
 a) a method similar to the linear search
 b) a method similar to the binary search
 find the time complexity for the best, worst, and average cases
 */
public class MT
{
	public static void main(String[] args)
	{
		int a[] = {0, 1, 2, 4, 5, 6, 7, 8, 9};
		System.out.println(findMissingInt(a));
		System.out.println(findMissingInt2(a));
	}	
		
	public static int findMissingInt(int []a) //O(n)
	{
		for (int i=0; i<a.length-1; i++)
			if (a[i]+1 != a[i+1] )
				return a[i]+1;
		return -1;
	}
	
	
	public static int findMissingInt2(int []a) //O(log n)
	{
		int low = 0;
		int high = a.length-1;
		int mid;
		
		while (high-low > 1)
		{
			mid = (low+high)/2;
			if (a[low]-low != a[mid]-mid)
				high = mid;
			else if (a[high]-high != a[mid]-mid)
				low = mid;
		}
		return a[low]+1;
	}
}

