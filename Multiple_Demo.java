class Multiple_Demo implements Runnable{
String name;
Multiple_Demo(String name1){   // Constructor creation
name=name1;
}
public void run(){
for(int i=1;i<5;i++){
	try{
		Thread.sleep(2000);       // this is openional this is for giving some time delay between the threads while exicuting time.(Milli seconds).
	}
	catch (Exception e){
		System.out.println(e);
	}
System.out.println(name+":"+i);
}
}
public static void main(String[] args){
Multiple_Demo m1=new Multiple_Demo("THread1");
Multiple_Demo m2=new Multiple_Demo("Thread2");
Thread t1=new Thread(m1);
Thread t2=new Thread(m2);
t1.start();
t2.start();
for(int i=0;i<10;i++){
System.out.println("main:"+i);
}
}
}