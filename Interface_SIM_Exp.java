interface Sim{
void calling();
void message();
void internet();
}
class VI implements Sim{
public void calling(){
System.out.println("VI Calling");
}
public void message(){
System.out.println("VI message");
}
public void internet(){
System.out.println("VI Internet");
}
}
class Airtel implements Sim{
public void calling(){
System.out.println("Airtel Calling");
}
public void message(){
System.out.println("Airtel message");
}
public void internet(){
System.out.println("Airtel internet");
}
}
public class Interface_SIM_Exp{
public static void main(String[] args){
VI v=new VI();
v.calling();
v.message();
v.internet();
System.out.println();

Airtel a=new Airtel();
a.calling();
a.message();
a.internet();
}
}