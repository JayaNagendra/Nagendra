import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Text_File_Data_Adding{
public static void main(String[] args) throws IOException{
	File f=new File("C:\\Users\\Dell\\Desktop\\Note programs\\Resume.txt");
FileReader fr=new FileReader(f);
BufferedReader br = new BufferedReader(fr);
String s=new String();
String str=new String();
while((s=br.readLine()) !=null){
	str +=s;
	//System.out.print(s);
}
	String st="Nagendra IPS......";
FileWriter fw=new FileWriter(f);	
	BufferedWriter bw=new BufferedWriter(fw);
bw.write(str + st);
bw.flush();   // this is mandatry for writing data in to file....
System.out.print(str + st);
}
}
