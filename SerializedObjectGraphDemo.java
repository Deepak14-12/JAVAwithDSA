package serialization;
import java.io.*;

class Dog implements Serializable
{
 Cat c = new Cat();
}
class Cat implements Serializable
{
  Rat r = new Rat(); 
}
class Rat implements Serializable
{
  int i = 20; 
}
class SerializedObjectGraphDemo
{
 public static void main(String[] args) throws Exception
 {
   Dog d1 = new Dog();
// Serialization
   System.out.println("Serialization started...");
   FileOutputStream fos = new FileOutputStream("abc.ser");
   ObjectOutputStream ous = new ObjectOutputStream(fos);
   ous.writeObject(d1);//Serialization of Dog object will serialize the set of all reachable object from Dog object automatically 
   System.out.println("Serialization Ended...");
// De-Serialization  
   System.out.println("De-Serialization started...");
   FileInputStream fis  = new FileInputStream("abc.ser");
   ObjectInputStream ois = new ObjectInputStream(fis);
   Dog d2 = (Dog)ois.readObject();//De-Serialization of Dog Object will De-serialize the set of all reachable object from Dog object automatically 
   System.out.println("De-Serialization ended...");  
   System.out.println("Dog-->Cat-->Rat-->i : "+d2.c.r.i);
   
  }
}
