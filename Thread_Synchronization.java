import java.lang.Thread;
class Thread_Synchronization implements Runnable{
int count;
public synchronized void run(){             
for(int i=1;i<=10000;i++){
count++;}

}
public static void main(String[] args){
Thread_Synchronization m=new Thread_Synchronization();
Thread t1=new Thread(m);
Thread t2=new Thread(m);
t1.start();
t2.start();
System.out.println(t1.isAlive());   // used for to Check the Given Thread is alive or Dead state.....

t1.setName("Nagendra");
System.out.println(t1.getName());       // for giving name to the Thread...

t1.setPriority(10);
System.out.println(t1.getPriority());   // For giving priority to the Thread...

t2.setPriority(Thread.MIN_PRIORITY);
System.out.println(t2.getPriority());   // This is also for set priority...

try{
	t1.join();
	t2.join();   
}
catch(Exception e){
	e.printStackTrace();           // join method for clearing clumgy order output printing....
	
}
System.out.println(m.count);
}
}


