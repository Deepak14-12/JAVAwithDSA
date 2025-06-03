package collectionf;
import java.util.*;

class TestComparator
{
 public static void main(String[] args)
 {
  TreeSet t = new TreeSet(new MyComparator());   
  t.add(10);
  t.add(0);
  t.add(15);
  t.add(5);
  t.add(20);
  t.add(20); 
  System.out.println(t);
 }
}

//customized order
class MyComparator implements Comparator
{
 public int compare(Object obj1, Object obj2)
 {
  Integer I1 = (Integer) obj1;
  Integer I2 = (Integer) obj2;

  if(I1 < I2)
     return +1;
  else if(I1 > I2)
     return -1;
  else
     return 0;
/** various possible implementation of compare method
  return I1.compareTo(I2);  //default natural sorting order
  return -I1.compareTo(I2);  // descending order
  return I2.compareTo(I1);   //descending order
  return -I2.compareTo(I1);  //ascending order 
  return +1; //insertion order
  return -1;  //reverse insertion order
  return 0;  //only first element will be inserted and remaining all duplicates
*/
 }
} 
