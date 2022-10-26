import java.util.Scanner;

public class Febonacci {

	public static void main(String[] args) {   //this is useed for to enter in put manually.
	
		int a=0,b=1;
		int c;
		/* System.out.println("Enter number: ");
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt(); */
		c=0;
		System.out.println("1 1");
		while (c<25) {
			c=a+b;
			System.out.println(c+ " ");
			a=b;
			b=c;
					
			
		}
	}

}
