class ThreadDemo extends Thread{
public void run(){
	Thread t1=Thread.currentThread();
System.out.println(t1);
}
public static void main(String[] args){
ThreadDemo td=new ThreadDemo();
Thread t=new Thread(td);
t.start();
Thread t1=Thread.currentThread();
System.out.println(t1);
}
}
