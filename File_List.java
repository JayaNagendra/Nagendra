import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.io.IOException;
public class File_List{
public static void main(String[] args) throws IOException{
File f=new File("C:\\Users\\Dell\\Desktop\\Note programs\\Resume.txt");

System.out.print(new Date(f.lastModified()));  // For checking last modified date...

System.out.print(f.isFile());   // For checking weather this is a file or folder

//System.out.print(f.getAbsolutePath());    // This is for verifying single file name along with path

//System.out.print(f.getName());   // This is for verifying single file....

//System.out.print(Arrays.toString(f.list()));  // this is for list of files in a folder 


//System.out.print(Arrays.toString(f.listFiles()));  // this is for list of files along with the path for each files..
}
}