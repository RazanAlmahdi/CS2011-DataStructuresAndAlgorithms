package lec8;

public class DoublyLinkedList {


	int n;
	Node dummy;
	
	public DoublyLinkedList() {
		n=0;
		dummy = new Node();
		dummy.next = dummy;
		dummy.previous = dummy;
	}
	
	public int size() {
		return n;
	}
	
	public Node getNode(int i ) {
		Node m;
		
		if (i <n/2) {
			m = dummy.next;
			for(int j=0; j<i; j++)
			{
				m = m.next;
			}
		}
		else {
			m = dummy.previous;
			for(int j =n-1; j > i; j--)
			{
				m = m.previous;
			}
		}
		return m;
	}
	
	public Object get(int i) {
		Node m = getNode(i);
		return m.data;
		
	}
	
	public void set(int i, Object x) {
		Node m =getNode(i);
		m.data = x;
	}
	
	public void addBefore(Node w, Object x) {
		Node m = new Node();
		m.data = x;
		
		m.next = w;
		m.previous = w.previous;
		w.previous = m;
		m.previous.next = m;
		
		n++;
	}
	
	public void add(int i, Object x) {
		Node m = getNode(i);
		addBefore(m,x);
		
	}
	
	public void removeNode(Node m) {
		m.previous.next = m.next;
		m.next.previous = m.previous;
		n--;
	}
	
	public Object remove(int i) {
		Node m = getNode(i);
		removeNode(m);
		return m.data;
	}
	
	public void addFirst(String x) {
		add(0,x);
	}
	
	public void addLast( String x) {
		Node m = dummy;
		addBefore(m,x);
	}
	
	public void removeFirst() {
		remove(0);
	}
	
	public void removeLast() {
		remove(n-1);
	}
}
