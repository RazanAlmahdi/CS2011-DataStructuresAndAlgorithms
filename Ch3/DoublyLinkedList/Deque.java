public class Deque
{
	public static void main(String[] args)
	{
		DoublyLinkedList d = new DoublyLinkedList();
		
		d.add(0, 'e');
		d.add(1, 'e');
		d.add(2, 'm');
		d.addLast('S');
		d.addFirst('R');
		
		System.out.println(d.removeFirst() + " " + d.removeLast());
		
	}
}
