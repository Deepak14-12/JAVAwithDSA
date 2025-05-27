package filehandling;
import java.io.*;

class PrintWriterDemo
{
 public static void main(String [] args) throws IOException
  {   FileWriter f = new FileWriter("D:\\JAVA\\collegedemo\\src\\house1\\student.txt");
      PrintWriter pr = new PrintWriter(f) ;
      pr.write(100);
      pr.println(100);
      pr.println('A');
      pr.println("deepak");
      pr.println(90.8);
      pr.println(true);
      pr.flush();
      pr.close();
  }
}
