// package lec6;

// public class ArrayBasedQueue {
	
// 	int n;
// 	Object[] a;
// 	int j =0;
	
	
// 	public ArrayBasedQueue() {
// 		n=0;
// 		a = new Object[10];
// 		j= 0;
// 	}

// 	public void add(Object x) {
		
// 		if (n==a.length) {
// 			resize();
// 		}
// 		a[(j+n)%a.length]=x;
// 		n++;
// 	}
	
// 	public Object remove() {
// 		Object o = a[j];
// 		n--;
// 		j = (j+1)%a.length;
		
// 		if (n <=a.length/3)
// 			resize();
		
// 		return 0;
		
// 	}
	
// 	public void resize() {
// 		Object[] b = new Object [2*n];
		
// 		for( int i = 0; i <n; i++)
// 		{
// 			b[i]= a[(j+i)%a.length];
// 		}
// 		a = b;
// 		j = 0;
// 	}
	
// 	public void rotate(Object [] a, int r) {
// 		Object [] o = new Object[a.length];
		
// 		for (int i = 0; i < a.length; i++) {
// 			o[i] = a[i];
// 		}
		
// 		for (int i = 0; i < a.length; i++) {
// 			a[(r+i)%a.length] = o[i];
// 		}
// 	}
// }
