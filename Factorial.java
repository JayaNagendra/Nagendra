public class Factorial{
public static void main (String[]args){
int num = 5;
int factorial = 1;
/*for(int i=1;i<=num;i++){ // Assending order
factorial = factorial*i;
System.out.println("factorial of num is :" +factorial);*/

for(int i=num;i>=1;i--){  // Decending order
factorial = factorial*i;
System.out.println("factorial of num is :" +factorial);
}
}
}
