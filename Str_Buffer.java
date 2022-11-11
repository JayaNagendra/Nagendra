public class Str_Buffer{
public static void main(String[] args){
StringBuffer sb= new StringBuffer("Nagendra");
//String s= "Nagendra";
System.out.println(sb);
System.out.println("Length:" +sb.length());
System.out.println("Add:" +sb.append(" Jaya"));
System.out.println("Delete:" +sb.delete(0,1));
System.out.println("Delete s:" +sb.deleteCharAt(0));
//System.out.println("reverse:" +sb.reverse());
System.out.println("Sub string:" +sb.substring(1,5));
System.out.println("ss:" +sb.substring(1));
System.out.println("insert:" +sb.insert(0," nag "));
System.out.println("replace:" +sb.replace(0,4,"IPS"));
}
}