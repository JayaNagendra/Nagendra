import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.BufferedReader;

public class Text_File_Handling{  // This is file input stream...Method &  Scanner method &  File reader Method & BufferedReader
public static void main(String[] args) throws IOException{
	
	
	
	// BufferedReader metod......
	
FileReader f=new FileReader("C:\\Users\\Dell\\Desktop\\Note programs\\Resume.txt");
BufferedReader br=new BufferedReader(f);
String s=new String();
while((s=br.readLine()) !=null){
	System.out.print(s);
}
f.close();
br.close();
}
}



// Scanner method

/*File f=new File("C:\\Users\\Dell\\Desktop\\Note programs\\Resume.txt");
Scanner s=new Scanner(f);
while(s.hasNextLine()){
System.out.print(s.nextLine());
}
s.close();
}
}	*/
	
	
	
	// File Input Stream method.....The process of File reader also same as this only.....
	
/*FileInputStream f=new FileInputStream("C:\\Users\\Dell\\Desktop\\Note programs\\Resume.txt");
int a;
while((a=f.read())!=-1){  // if this loop not given mens it will read only first character.....in data
System.out.print((char)a);  // if char not given means it will print asscii code not letters number will print.
}
f.close();   // this is not given also no problem but avoiding the data leckagging purpose need to use this..
}
}*/