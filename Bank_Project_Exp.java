class Bank{
int getintrest(){
return 0;}
}
class Nagendra extends Bank{
int getintrest(){
return 44;}
}
class SBI extends Bank{
int getintrest(){
return 8;}
}
class AXIS extends Bank{
int getintrest(){
return 6;}
}
class HDFC extends Bank{
int getintrest(){
return 4;}
}
class ICICI extends Bank{
int getintrest(){
return 9;} 
}

class Bank_Project_Exp{
public static void main(String[] args){
Nagendra n=new Nagendra();
System.out.println("Nagendra RI:" +n.getintrest());

SBI s=new SBI();
System.out.println("SBI RI:" +s.getintrest());

AXIS a=new AXIS();
System.out.println("AXIS RI:" +a.getintrest());

HDFC h=new HDFC();
System.out.println("HDFC RI:" +h.getintrest());

ICICI i=new ICICI();
System.out.println("ICICI RI:" +i.getintrest());
}
}
