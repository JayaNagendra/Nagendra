public class Exception_Handling{
public static void main(String[] args){
int a = 5;
int b = 0;
int r=0;
try{
	 r = a/b;
}
catch (ArithmeticException ae){
	System.out.println(ae.toString());
	throw ae;               // from hear the exception handling controll will given to java.
}
finally {
	System.out.println("final block");   // what ever it may be the final block will print
}
System.out.println(r);   // After giving throw block this will not print....
}
}