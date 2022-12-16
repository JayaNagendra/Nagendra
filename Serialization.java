import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employe implements Serializable{
	String name;
	int num;
	Employe(String name,int num){
		this.name=name;
		this.num=num;
	}
}



//    Deserialization....................



public class Serialization {
	public static void main(String[] args) {
	try {
		FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\Desktop\\Note programs\\IPS.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employe e2=(Employe)ois.readObject();
		fis.close();
		ois.close();
		System.out.println(e2.name+" "+e2.num);
	}
	catch(Exception e1) {
		e1.printStackTrace();
	}
	
}
}

//  Serialization............



/*public class Serialization {

	public static void main(String[] args) {
		Employe e=new Employe("Nagendra",10);
		try {
			FileOutputStream fos=new FileOutputStream("C:\\Users\\Dell\\Desktop\\Note programs\\IPS.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(e);
			oos.close();
			fos.close();
			System.out.println("Sucess");
		} catch(Exception e1) {
			e1.printStackTrace();
			
		}
		
		
	}

}*/
