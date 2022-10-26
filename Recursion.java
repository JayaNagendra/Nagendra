public class Recursion{
int fact(int n ){
if (n==0)
return 1;
int x=n*fact(n-1);
return x;
}
public static void main (String[]args){
Recursion r= new Recursion();
int result = r.fact(5);
System.out.println(result);
}
}

