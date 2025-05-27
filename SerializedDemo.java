package serialization;
import java.io.*;

class Dog implements Serializable
{
  int i =10;
  int j =20;
}
class Cat implements Serializable
{
  int i =30;
  int j =40;
}
class SerializedDemo
{
 public static void main(String[] args) throws Exception
 {
   Dog d1 = new Dog();
   Cat c1 = new Cat();
   System.out.println("Serialization started...");
   FileOutputStream fos = new FileOutputStream("abc.ser");
   ObjectOutputStream ous = new ObjectOutputStream(fos);
   ous.writeObject(d1);//Serialization of Dog object
   ous.writeObject(c1);// Serialization of Cat object 
   System.out.println("Serialization Ended...");
   
   System.out.println("De-Serialization started...");
   FileInputStream fis  = new FileInputStream("abc.ser");
   ObjectInputStream ois = new ObjectInputStream(fis);
   Dog d2 = (Dog)ois.readObject();//De-Serialization of Dog Object
   Cat c2 = (Cat)ois.readObject();//De-Serialization of Cat Object 
   System.out.println("De-Serialization ended...");  
   System.out.println(d2.i+"---Dog---"+d2.j);
   System.out.println(c2.i+"---Cat---"+c2.j);   
  }
}
