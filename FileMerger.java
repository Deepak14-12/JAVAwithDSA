//write a program for merge two files in another file
package filehandling;
import java.io.*;

class FileMerger
{
 public static void main(String [] args) throws IOException
  {   PrintWriter pw = new PrintWriter("D:\\JAVA\\collegedemo\\src\\house1\\MergedFile.txt");
     BufferedReader br = new BufferedReader(new FileReader("D:\\JAVA\\collegedemo\\src\\house1\\student.txt")) ;
      String line  = br.readLine();
      while(line != null)
      {
        pw.println(line);
        line = br.readLine();
      }
     
      br = new BufferedReader(new FileReader("D:\\JAVA\\collegedemo\\src\\house1\\khairi.txt")) ;
      line  = br.readLine();
      while(line != null)
      {
        pw.println(line);
        line = br.readLine();
      }
      pw.flush();
      br.close();
      pw.close();
  }
}
