package ArrayBasedList1;

public class ArrayBasedList{
    
    Object a[];
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
    	
        if( s+1 > a.length){
            System.out.println("List is full");
        }
        
        for( int j = s; j>i; j--){
            a[j] = a[j-1];
        }
        a[i] = x;
        s++;
        
    }
    
    public Object remove(int i){
        Object x = a[i];
        for( int j = i; j < s; j++ ){
            a[j] = a[j+1];
        }
        s--;
        return x;
        
    }
}
