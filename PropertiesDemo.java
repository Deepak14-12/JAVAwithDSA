package collectionf;
import java.util.*;
import java.io.*;
class PropertiesDemo
{
 public static void main(String[] args) throws Exception
 {
  Properties p = new Properties();
  FileInputStream fis  = new FileInputStream("D:\\JAVA\\collegedemo\\src\\collectionf\\abc.properties");
  p.load(fis);
  System.out.println(p);
  String s = p.getProperty("username");
  System.out.println(s);  //deepak
  p.setProperty("address","kahiri");
  Enumeration e = p.propertyNames();
  //System.out.println(e); //java.util.Hashtable$Enumerator@4517d9a3
  while(e.hasMoreElements())
  {
     String s1 = (String)e.nextElement();
     System.out.println(s1); //address
  }
  FileOutputStream fos =  new FileOutputStream("D:\\JAVA\\collegedemo\\src\\collectionf\\abc.properties");
 p.store(fos,"updated by deepak bisen");
 }
}
