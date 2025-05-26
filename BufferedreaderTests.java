package filehandling;
import java.io.*;
class BufferedreaderTests
{
 public static void main(String [] args) throws IOException
  {   FileReader fr = new FileReader("D:\\JAVA\\collegedemo\\src\\house1\\khairi2.txt");
      BufferedReader br = new BufferedReader(fr) ;
      String line  = br.readLine();
      while(line != null)
      {
        System.out.println(line);
        line = br.readLine();
      } 
      br.close();
  }
}
