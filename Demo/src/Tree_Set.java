import java.util.Iterator;
import java.util.TreeSet;

public class Tree_Set {

	public static void main(String[] args) {
		
     TreeSet ts=new TreeSet();
     ts.add(4);
     ts.add(42);
     ts.add(3);
     ts.add(444);
     System.out.println(ts);
     
     Iterator i=ts.descendingIterator();
     while(i.hasNext()) {
    	 System.out.println(i.next());
    	 
     }
     
    	 
	}

}
