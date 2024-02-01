// package lec4;
// import java.util.*;

// public class Exercise {
	 
// 	    int size;
// 	    int top;
// 	    char[] a;
	 
// 	    boolean isEmpty()
// 	    { return (top < 0); }
	 
// 	    public void Stack(int n)
// 	    {
// 	        top = -1;
// 	        size = n;
// 	        a = new char[size];
// 	    }
	 
// 	    boolean push(char x)
// 	    {
// 	        if (top >= size) {
// 	            System.out.println("");
// 	            return false;
// 	        }
// 	        else {
// 	            a[++top] = x;
// 	            return true;
// 	        }
// 	    }
	  
// 	    char pop()
// 	    {
// 	        if (top < 0) {
// 	            System.out.println("");
// 	            return 0;
// 	        }
// 	        else {
// 	            char x = a[top--];
// 	            return x;
// 	        }
// 	    }
	
	 
// 	    public static void reverse(StringBuffer str)
// 	    {
	       
// 	        int n = str.length();
// 	        Stack obj = new Stack();
	 
	 
// 	        int i;
// 	        for (i = 0; i < n; i++)
// 	            obj.push(str.charAt(i));
	 
	
// 	        for (i = 0; i < n; i++) {
// 	            Object ch = obj.pop();
// 	            str.setCharAt(i, (char) ch);
// 	        }
// 	    }
	
// 	}


