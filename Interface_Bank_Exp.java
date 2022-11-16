interface bank{
void withdra();
void Deposit();
void Balance();
}
class SBI implements bank{
public void withdra(){
System.out.println("SBI Money Withdraw");
}
public void Deposit(){
System.out.println("SBI Money Deposit");
}
public void Balance(){
System.out.println("SBI Balance check");
}
}
class AXIS implements bank{
public void withdra(){
System.out.println("AXIS Money Withdraw");
}
public void Deposit(){
System.out.println("AXIS Money Deposit");
}
public void Balance(){
System.out.println("AXIS Balance check");
}
}
public class Interface_Bank_Exp{
public static void main(String[] args){
SBI s=new SBI();
s.withdra();
s.Deposit();
s.Balance();
System.out.println();

AXIS a=new AXIS();
a.withdra();
a.Deposit();
a.Balance();
}
}