class customer{
int amount=10000;
public synchronized void withdraw(int amount){
System.out.println("Going to withdraw");
if(this.amount<amount){
System.out.println("Low balance Waiting for deposit");
try{
wait();
}
catch(Exception e){
e.printStackTrace();
}
}
this.amount=this.amount-amount;
System.out.println("Withdraw Sucessful");
}
public synchronized void deposit(int amount){
System.out.println("Going to deposit");
this.amount=this.amount+amount;
System.out.println("Diposit completed");
notify();
}
}
class InterThread{
public static void main(String[] args){
customer c=new customer();
new Thread(){
	public void run(){
		c.withdraw(16000);
	}                                      // These are another mathod for creating thred.......and run method............
}.start();
new Thread(){
	public void run(){
		c.deposit(16000);
	}
}.start();
}
}
