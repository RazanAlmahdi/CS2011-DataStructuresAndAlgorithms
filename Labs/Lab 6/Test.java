package lec6;

public class Test {

	public static void main(String[] args) {
		
		Object [] o = {"Leonardo", "Raphael", "Donatello", "Michelangelo"};
		
		System.out.println("Queue pre-rotation: ");
		
		for (int i =0; i< o.length; i++) {
			System.out.print(o[i]+ " ");
		}
		
		System.out.println("\n-------------");
		rotate(o,3);
		System.out.println("Queue post-roation: ");
		
		for (int i = 0 ; i < o.length; i++) {
			System.out.print(o[i] + " ");
		}
	}

	private static void rotate(Object[] o, int t) {
	
			Object [] x = new Object[o.length];
				
				for (int i = 0; i < o.length; i++) {
					x[i] = o[i];
				}
				
				for (int i = 0; i < x.length; i++) {
					o[(t+i)%o.length] = x[i];
				}			
	}	

}
