package lec4;

import java.util.Scanner;
import java.util.Stack;

public class Test {

	public static void main(String[] args) {

		
	 try(Scanner sc = new Scanner(System.in)){
		 
		  System.out.println("Enter string: ");
		  String str = sc.nextLine();
		  
		  Stack<Object> s = new Stack<>();
	  
	for( int i = 0; i < str.length(); i++) {
		s.push(str.charAt(i));
	}
	
	System.out.println("Reversed string: ");
	
	while (!s.empty()) {
		System.out.print(s.pop());
	}
  }
 }
}
