package filehandling;
import java.io.*;
class FileMethodsTest
{//case1: print all files and directories present in house1
 /* 
  public static void main(String [] args) throws IOException
  { int count = 0;
    File f = new File("D:\\JAVA\\collegedemo\\src\\house1");
    System.out.println(f.exists());
    String [] s= f.list();
    for(String s1:s)
    {
     count++;
     System.out.println(s1);
    }
   System.out.println("number of items: "+count );
  }*/
//---------------------------------------------------------------------
/**
//case2: print all files onlypresent in house1
  public static void main(String [] args) throws IOException
  { int count = 0;
    File f = new File("D:\\JAVA\\collegedemo\\src\\house1");
    System.out.println(f.exists());
    String [] s= f.list();
    for(String s1:s)
    {
     File f1 = new File(f,s1);
     if(f1.isFile())
     {
      count++;
      System.out.println(s1);
     }
    }
  System.out.println("number of files: "+count );
  }*/
//---------------------------------------------------------------------
//case 3: print all Directories only present in house1
  public static void main(String [] args) throws IOException
  { int count = 0;
    File f = new File("D:\\JAVA\\collegedemo\\src\\house1");
    System.out.println(f.exists());
    String [] s= f.list();
    for(String s1:s)
    {
     File f1 = new File(f,s1);
     if(f1.isDirectory())
     {
      count++;
      System.out.println(s1);
     }
    }
  System.out.println("number of Directories: "+count );
  }
}
