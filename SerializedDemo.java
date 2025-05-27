package serialization;
import java.io.*;

class Dog implements Serializable
{
  int i =10;
  int j =20;
}
class SerializedDemo
{
 public static void main(String[] args) throws Exception
 {
   Dog d1 = new Dog();
   System.out.println("Serialization started...");
   FileOutputStream fos = new FileOutputStream("abc.ser");
   ObjectOutputStream ous = new ObjectOutputStream(fos);
   ous.writeObject(d1);//Serialization  
   System.out.println("Serialization Ended...");
   
   System.out.println("De-Serialization started...");
   FileInputStream fis  = new FileInputStream("abc.ser");
   ObjectInputStream ois = new ObjectInputStream(fis);
   Dog d2 = (Dog)ois.readObject();//De-Serialization 
   System.out.println("De-Serialization ended...");  
   System.out.println(d2.i+"-------"+d2.j);  
  }
}
