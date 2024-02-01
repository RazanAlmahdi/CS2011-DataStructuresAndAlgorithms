package ArrayBasedList1;

public class Test {

public static void main(String[] args) {
	
ArrayBasedList l = new ArrayBasedList();

System.out.println( "The initial size of array is  " + l.size());
l.add(0,"Leonardo");
l.add(1,"Raphael");
l.add(2,"Michelangelo");
l.add(2,"Donatello");
l.add(1,"Shredder");

System.out.println( "The current size of array is  " + l.size());
System.out.println("-----------------");
System.out.println("Before removal: ");
for(int i=0; i<l.size();i++)
{
    System.out.print(l.get(i)+" "); }

l.remove(1);

System.out.println("\n-----------------");
System.out.println("After removal: ");
for(int i=0; i<l.size();i++)
{
    System.out.print(l.get(i)+" "); }
	}}
