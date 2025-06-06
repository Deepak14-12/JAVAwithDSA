package collectionf;
import java.util.*;
import java.io.*;
import java.sql.*;
class PropertiesDemoDB2
{
 public static void main(String[] args) throws Exception
 {
  Properties p = new Properties();
  FileInputStream fis  = new FileInputStream("D:\\JAVA\\collegedemo\\src\\collectionf\\db.properties");
  
  p.load(fis);
  String url = p.getProperty("url");
  String user = p.getProperty("user");
  String pwd = p.getProperty("pwd");

  Connection con = DriverManager.getConnection(url,user,pwd);  

  FileOutputStream fos =  new FileOutputStream("D:\\JAVA\\collegedemo\\src\\collectionf\\abc.properties");
 p.store(fos,"updated by deepak bisen database connectivity");
 }
}
