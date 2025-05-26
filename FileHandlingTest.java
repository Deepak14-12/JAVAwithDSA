package filehandling;
import java.io.*;
class FileHandlingTest
{
 public static void main(String [] args) throws IOException
 {/*
   File f = new File("house.txt"); //represents a file or dir only not creates
   System.out.println(f.exists()); 
   f.createNewFile(); // creates file in current working directory
   System.out.println(f.exists()); 
//-------------------------------------
   File f = new File("house");
   System.out.println(f.exists()); 
   f.mkdir(); // creates directory in current working directory 
   System.out.println(f.exists()); 
//-------------------------------------------
  File f = new File("D:\\JAVA\\collegedemo\\src\\house","abc.txt");
  System.out.println(f.exists()); 
  f.createNewFile();  // creates file in specified subdirectopry that are in current working directory
  System.out.println(f.exists()); 
*/
//---------------------------------------
  File f = new File("house1","khairi.txt");
  System.out.println(f.exists()); 
  f.createNewFile();//RE:IOE -System cannot find path bcz house1 is not there
  System.out.println(f.exists()); 
 }
}
