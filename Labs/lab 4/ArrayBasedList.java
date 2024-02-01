package lec4;

public class ArrayBasedList{
    
    Object [] a;
    int s;

    public ArrayBasedList(){
    	
    	s = 0;
        a = new Object[10];
 
    }

    public int size(){
    	
        return s;
    }

    public void set(int i, Object x){
    	
        a[i] = x;
    }

    public Object get(int i){
    	
        return a[i];
    }
    
    public void add(int i, Object x){
    	
        if( s+1 > a.length) 	
        	expand();
     
        	for( int j = s; j>i; j--){
                 a[j] = a[j-1];
             a[i] = x;
             s++;}
          	
    }
    
    public Object remove(int i){
    	
    
        Object x = a[i];
        for( int j = i; j < s-1; j++ ){
            a[j] = a[j+1];
        }
        s--;
        
        if (s < a.length/3) {
        	shrink(); 
        }
        return x;      
    }
    
    public void expand() {
    	Object[] b=  new Object [s*2];
    	for ( int i = 0; i<s; i++)
    	{
    		b[i] = a[i];
    	}
    	a = b; //a points to b now, so b becomes the new full array, and a goes to garbage 
    }          
    
	public void shrink() {
		Object [] b = new Object[2*s];
		
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		a = b;
}
	}
