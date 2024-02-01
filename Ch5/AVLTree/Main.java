public class Main                                                                                                                                                       
{                                                                                                                                                                       
	public static void main(String[] args)                                                                                                                              
	{                                                                                                                                                                   
                                                                                                                                                                        
		AVLTree t = new AVLTree();                                                                                                                                      
		                                                                                                                                                                
		for(int i=1; i<=1000000; i++)                                                                                                                                   
			t.insert(i);                                                                                                                                                
		t.search(1000000); //to show that it's O(log n)                                                                                                                 
	}                                                                                                                                                                   
}                                                                                                                                                                       
