 class guest{
	public void read(){
	System.out.println("Read code");
	}
}
class developer extends guest{
	public void write(){
		System.out.println("Write code");
	}
}
class admin extends developer{
	public void edit(){
		System.out.println("Edit code");
	}
}
     public class Inheritance{
		 public static void main(String[] args){
			 guest g =new guest();
			 g.read();
			 developer d =new developer();
			 d.write();
			 d.read();
			 admin a =new admin();
			 a.read();
			 a.write();
			 a.edit();
		 }
	 }
	 
			 
		
	