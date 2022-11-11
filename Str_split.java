import java.util.Arrays;
public class Str_split{
public static void main(String[] args){
String s1 = "Hello world how are you";
String s2 = " Nagendra";
System.out.println(Arrays.toString(s1.split(" ")));//for this purpose import line must
System.out.println(s1.repeat(3)+" ");// this is used to repeat our print statement 
System.out.println(s1.concat(s2));// For adding two strings
}
}