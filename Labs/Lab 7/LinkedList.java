package lec7;

public class LinkedList {

	Node head;
	Node tail;
	int n;
	
	public void push(Object x) {
		Node a = new Node();
		a.data =x;
		a.next = head;
		head = a;
		if (n==0)
			tail =a;
		n++;
	}
	
	public Object pop() {
		if(n ==0)
		return null;
		
		Object a = head.data;
		head = head.next;
		n--;
		
		if (n==0)
			tail = null;
		return a;
	}
	
	public void add(Object x) {
		Node a = new Node();
		a.data =x;
		
		if(n==0) {
			tail =a;
			head = a;
		}
		
		tail.next =a;
		tail=a;
		n++;
	}
	

	public Object remove() {
		if(n ==0)
		return null;
		
		Object a = head.data;
		head = head.next;
		n--;
		
		if (n==0)
			tail = null;
		return a;
	}

	public Object top() {
		return head.data;
	}
}
