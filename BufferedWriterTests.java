package filehandling;
import java.io.*;

class BufferedWriterTests
{
 public static void main(String [] args) throws IOException
  {   FileWriter f = new FileWriter("D:\\JAVA\\collegedemo\\src\\house1\\khairi2.txt");
      BufferedWriter bw = new BufferedWriter(f) ;
      bw.write(100);
      bw.newLine();
      char []ch = {'s','t','u'};
      bw.write(ch);
      bw.newLine();
      bw.write("Deepak bisen");
      bw.newLine();
      bw.flush();
      bw.close();
  }
}
