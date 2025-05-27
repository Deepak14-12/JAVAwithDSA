//write a program for merge two files in another file where matching should be done line by line alternatively
package filehandling;
import java.io.*;

class FileMergerLineByLine
{
 public static void main(String [] args) throws IOException
  {   PrintWriter pw = new PrintWriter("D:\\JAVA\\collegedemo\\src\\house1\\MergedFile2.txt");
     BufferedReader br1 = new BufferedReader(new FileReader("D:\\JAVA\\collegedemo\\src\\house1\\student.txt")) ;
 BufferedReader br2 = new BufferedReader(new FileReader("D:\\JAVA\\collegedemo\\src\\house1\\khairi.txt")) ;
      String line1 = br1.readLine();
      String line2 = br2.readLine();
      while(line1 != null || line2 != null)
      {
        if(line1 !=null)
        {
          pw.println(line1);
          line1 = br1.readLine();
        } 
        if(line2 !=null)
        {
          pw.println(line2);
          line2 = br2.readLine();
        }
      }
       
      pw.flush();
      br1.close();
      br2.close();
      pw.close();
  }
}
