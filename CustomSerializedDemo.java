package serialization;
import java.io.*;
//demo program for customized serialization to recover loss of information which is happen due to transient keyword.
class Account implements Serializable
{
 String username = "deepak";
 transient String pwd= "rush";
}

class CustomSerializedDemo
{
 public static void main(String[] args) throws Exception
 {
   Account a1 = new Account();
// Serialization
   System.out.println("Serialization started...");
   System.out.println(a1.username+"  "+a1.pwd);
   FileOutputStream fos = new FileOutputStream("Account.ser");
   ObjectOutputStream oos = new ObjectOutputStream(fos);
   oos.writeObject(a1); 
   System.out.println("Serialization Ended...");
// De-Serialization  
   System.out.println("De-Serialization started...");
   FileInputStream fis  = new FileInputStream("Account.ser");
   ObjectInputStream ois = new ObjectInputStream(fis);
   Account a2 = (Account)ois.readObject();
   System.out.println("De-Serialization ended...");  
   System.out.println("Username: "+a2.username+"  password: "+a2.pwd);
  }
}
