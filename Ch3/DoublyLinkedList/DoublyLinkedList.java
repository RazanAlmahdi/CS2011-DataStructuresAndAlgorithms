public class DoublyLinkedList
{
	Node dummy;
	int n;
	public DoublyLinkedList()
	{
		dummy = new Node();
		dummy.next = dummy;
		dummy.previous = dummy;
		n = 0;
	}
	public Node getNode(int i) //O(min(i, n-i))
	{
		Node node;
		if (i<(n/2))
		{
			node = dummy.next;
			for(int j=0; j<i; j++)
				node = node.next;
		}
		else //i>n/2
		{
			node = dummy.previous;
			for (int j=n-1; j>i; j--)
				node = node.previous;
		}
		return node;
	}
	public Object get(int i) //O(min(i, n-i))
	{
		return getNode(i).data;
	}
	public void set(int i, Object o)
	{
		getNode(i).data = o;
	}
	public void addBefore(Node w, Object o) //O(1)
	{
		Node node = new Node();
		node.data = o;
		node.next = w;
		node.previous = w.previous;
		w.previous = node;
		node.previous.next = node;
		/*
		w.previous.next = node; //node.previous.next
		w.previous = node; //node.next.previous
		*/
		n++;
	}
	public void add(int i, Object o) //O(min(i, n-i))
	{
		addBefore(getNode(i), o);
	}
	public void remove(Node w) //O(1)
	{
		w.previous.next = w.next;
		w.next.previous = w.previous;
		n--;
	}
	public Object remove(int i) //O(min(i, n-i))
	{
		Node n = getNode(i);
		remove(n);
		return n.data;
	}

	//Use the doubly linked list as a Deque
	public void addFirst(Object o) //O(min(i, n-i))
	{
		add(0, o);
	}
	public void addLast(Object o) //O(min(i, n-i))
	{
		Node d = dummy;
		addBefore(d, o);
	}
	public Object removeFirst() //O(min(i, n-i))
	{
		return remove(0);
	}
	public Object removeLast() //O(min(i, n-i))
	{
		return remove(n-1);
	}

}
