//write a program to perform file extraction operation :: output=input-delete
package filehandling;
import java.io.*;

class FileExtraction
{
 public static void main(String [] args) throws IOException
  {  
    PrintWriter pw = new PrintWriter("D:\\JAVA\\collegedemo\\src\\house1\\output.txt");
    BufferedReader br1 = new BufferedReader(new FileReader("D:\\JAVA\\collegedemo\\src\\house1\\input.txt")) ;
    String line = br1.readLine();
    while(line != null )
    { 
       boolean available = false; 
       BufferedReader br2 = new BufferedReader(new FileReader("D:\\JAVA\\collegedemo\\src\\house1\\delete.txt")) ;
       String target = br2.readLine();
       while(target!= null)
       {
         if(line.equals(target))
         { 
           available =true;
           break;
         }
         target = br2.readLine();
       }
       if(available == false)
          pw.println(line);
       line = br1.readLine();  
       br2.close();
    }
       
      pw.flush();
      br1.close();
      pw.close();
  }
}
