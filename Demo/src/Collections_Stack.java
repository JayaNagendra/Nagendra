import java.util.Stack;

public class Collections_Stack {

	public static void main(String[] args) {
    Stack s=new Stack();
    s.add(5);
    s.add(3);
    s.add(4);
    s.add(1);
    s.add(2);
    System.out.println(s);
    s.remove(0);
    System.out.println(s);
    
    s.pop();
    System.out.println(s);
    
    System.out.println(s.search(3));
    

	}

}
