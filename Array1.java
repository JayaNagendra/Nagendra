public class Array1{   // passing array to a method
static void m(int arr[]){
int m=arr[0];
for(int i=1;i<arr.length;i++)
if(m>arr[i])
m=arr[i];
System.out.println(m);
}

public static void main(String[] args){
int a[]={33,5,4,6,7,55,6,7,8,7,5,6,66,8,2,6,8,9,76,89,};
m(a);
}
}
