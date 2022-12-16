import java.util.ArrayList;
import java.util.Collections;

public class Collections_Array_List {
		@SuppressWarnings("unchecked")
		public static void main(String[] args){
		ArrayList al=new ArrayList();
		al.add("welcome");
		al.add("Nagendra");
		al.add("Developer");
		al.add("Dream");
		
		Collections.sort(al);
		System.out.println(al);

		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
		Collections.shuffle(al);
		System.out.println(al);
		}
		}
