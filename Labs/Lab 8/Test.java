package lec8;

public class Test {

 public static void main(String[] args) {
	
	
	DoublyLinkedList d = new DoublyLinkedList();
	d.addFirst("Kurosaki Ichigo");
	d.addFirst("Zaraki Kenpachi");
	d.addFirst("Sosuke Aizen");
	d.addFirst("Abatai Renji");
	
	d.removeLast();
	d.removeFirst();
	
	for (int i =0; i <d.n ; i++) {
		System.out.println(d.getNode(i).data);
	}
//		
//		DoublyLinkedList d = new DoublyLinkedList();
//		d.add(0, "Kurosaki Ichigo");
//		d.add(0, "Uryuu Ichida");
//		d.add(0, "Kuchiki Rukia");
//		d.add(2, "Abarai Renji");
//		
//		for(int i = 0; i <4; i++) {
//			System.out.println(d.get(i));
//		}
//
}
	

}
