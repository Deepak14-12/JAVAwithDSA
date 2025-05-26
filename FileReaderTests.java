package filehandling;
import java.io.*;

//FileReader: using FileReader obj we can read character data from the file 

class FileReaderTests
{
 public static void main(String [] args) throws IOException
  {  
//------------------------read()-----------------------------------
 /*FileReader fr = new FileReader("D:\\JAVA\\collegedemo\\src\\house1\\khairi.txt");
       
   int i = fr.read(); 
   while(i != -1)
   {
    System.out.print((char)i);
    i = fr.read();
   }*/
//-----------------read(char[] ch)-----------------------------------
   File f = new File("D:\\JAVA\\collegedemo\\src\\house1\\khairi.txt");
   char []ch = new char[(int)f.length()]; 
   FileReader fr1 = new FileReader(f);
   fr1.read(ch); 
   for(char ch1:ch)
      System.out.print(ch);     
  }
}
