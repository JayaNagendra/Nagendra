public class reverse{
public static void main(String[]args){
int n = 786564234;
int rever = 0;
int r;
while (n>0){
r=  n%10;
rever = rever*10+r;
n = n/10;
}
System.out.println(rever);
}
}
