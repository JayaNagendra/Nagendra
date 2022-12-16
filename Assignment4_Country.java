import java.util.HashSet;
import java.util.Iterator;
public class Assignment4_Country{
public static void main(String[] args){
HashSet<String> h1=new HashSet<String>();

h1.add("India");
h1.add("USA");
h1.add("German");
h1.add("China");
h1.add("Srilanka");


//System.out.println(h1);


Iterator i=h1.iterator();
while(i.hasNext()){
	System.out.println(i.next());

}
System.out.println(h1.contains("USSR"));  // output = false....
}
}

