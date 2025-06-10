package generic;
import java.util.*;

class OwnGeneric<Type>
{
 Type obj;
 OwnGeneric( Type obj)
 { 
  this.obj = obj; 
 }
 public void show()
 {
  System.out.println("The type of object is: "+obj.getClass().getName());
 }
 public Type getObject()
 {
  return obj;
 }
}

public class OwnGenericDemo
{
 public static void main(String[] args)
 {
  OwnGeneric<Integer> og = new OwnGeneric<Integer>(100);
  og.show();
  System.out.println(og.getObject());
 
  OwnGeneric<String> og1 = new OwnGeneric<String>("Deepika");
  og1.show();
  System.out.println(og1.getObject());

  OwnGeneric<Double> og2 = new OwnGeneric<Double>(100.256);
  og2.show();
  System.out.println(og2.getObject());
 } 
}
