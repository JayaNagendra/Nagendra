public class palindrome{
public static void main(String[]args){

	int n=787;
	int r;
	int reverse=0;
	int temp=n;
	while(n>0){   // this is for reverse number
		r=n%10;// remairder ,2 
		reverse=reverse*10+r;//0*10+2=2
		n=n/10;
	}
	System.out.println(reverse);
	if(temp==reverse)
	{
		System.out.println("Palindraom");
	}else
	{
		System.out.println("Not");
	
	}
}
}