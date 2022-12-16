import java.io.File;
import java.io.IOException;
public class File_Handling{
public static void main(String[] args) throws IOException{       // this exception throws is mandatry..
File f=new File("C:\\Users\\Dell\\Desktop\\Note programs\\Resume.txt");

System.out.println(f.setWritable(false));







//if (f.exists());
//f.delete();     // this process for combining 3 process...

//System.out.println(f.exists());  // checking weather file available or not...

//System.out.println(f.delete()); // file delete..


//System.out.println(f.createNewFile());  // for file creation
}
}
