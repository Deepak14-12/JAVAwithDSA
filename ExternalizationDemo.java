//Externalization
package serialization;
import java.io.*;

class ExternalizationDemo implements Externalizable
{
 String s;
 int i, j;
 public ExternalizationDemo()
 {
   System.out.println("ExternalizationDemo Default Constructor.....");
 }
 public ExternalizationDemo(String s, int i, int j)
 {
  this.s = s;
  this.i = i;
  this.j = j; 
 } 
 public void writeExternal(ObjectOutput out) throws IOException
 {
  out.writeObject(s);
  out.writeInt(i);
 }
 public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException

 {
  s = (String)in.readObject();
  i = in.readInt();
 }
 public static void main(String []args) throws Exception
 {
  ExternalizationDemo ed1 = new ExternalizationDemo("Deepak",10,20);
  System.out.println(ed1.s+"----"+ed1.i+"----"+ed1.j);

  System.out.println("externalization started.........");
  FileOutputStream fos = new FileOutputStream("xyz.ser");
  ObjectOutputStream oos = new ObjectOutputStream(fos);
  oos.writeObject(ed1);
 
  FileInputStream fis = new FileInputStream("xyz.ser");
  ObjectInputStream ois = new ObjectInputStream(fis);
  ExternalizationDemo ed2 = (ExternalizationDemo)ois.readObject();
  System.out.println("externalization ended.........");
  System.out.println(ed2.s+"----"+ed2.i+"----"+ed2.j); 
 }
}
