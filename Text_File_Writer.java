import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileOutputStream;
public class Text_File_Writer{
public static void main(String[] args) throws IOException{   // Fileoutput stream , File Writer   ,   BufferedWriter
	File f=new File("C:\\Users\\Dell\\Desktop\\Note programs\\Resume.txt");
FileWriter fw=new FileWriter(f);                  // File Writer and Buffered Writer Same process .............
String s="Hii Nagendra How are you";
fw.write(s);
fw.flush();   // this is mandatry for writing data in to file....
System.out.print(s);
}
}


   // File Out put Steram ..........


/*FileOutputStream fs=new FileOutputStream(f);
String s="Hello Nagendra IPS";
for(char ch: s.toCharArray()){
fs.write((int)ch);
fs.flush();
System.out.print(ch);*/



