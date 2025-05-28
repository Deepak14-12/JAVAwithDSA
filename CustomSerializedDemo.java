//demo program for customized serialization to recover loss of information which is happen due to transient keyword.

package serialization;
import java.io.*;

class Account implements Serializable
{
 String username = "deepak";
 transient String pwd= "rush";
 transient int pin= 1234;
 private void writeObject(ObjectOutputStream os) throws Exception
 {
  os.defaultWriteObject();
  String epwd = "123"+pwd;
  int epin = 4444+pin;
  os.writeObject(epwd);
  os.writeInt(epin);
}
 private void readObject(ObjectInputStream is) throws Exception
 {
  is.defaultReadObject();
  String epwd = (String)is.readObject();
  pwd = epwd.substring(3);
  int epin = is.readInt();
  pin = epin-4444;
 }
}
class CustomSerializedDemo
{
 public static void main(String[] args) throws Exception
 {
   Account a1 = new Account();
// Serialization
   System.out.println("Serialization started...");
   System.out.println(a1.username+"  "+a1.pwd+"  "+a1.pin);
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
   System.out.println("Username: "+a2.username+"  password: "+a2.pwd+"  pin: "+a2.pin);
  }
}
