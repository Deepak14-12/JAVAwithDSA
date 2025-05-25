package langpack;
public class AutoboxingUnboxing 
{
  static Integer I= 10;  //----1--AB
  public static void main(String[] args)
  {
    int i = I; //---2---AUB
    m1(i);  //---3---AB
  }

    public static void m1(Integer K)  //----3---AB
  {
    int m = K; //---4---AUB
    System.out.println(m);  //10
  }
/*------------------------------------
 * example 1:
  static Integer I = 0;
   public static void main(String[] args)
  {
    int i = I; 
    System.out.println(i); // 0
      }
  ------------------------------------
  * example 2:
  static Integer I ;  //null 
   public static void main(String[] args)
  {
    int i = I; 
    System.out.println(i); // RE: nullPointerException
      }
  -------------------------------------
  ** all wrapper class objects are immutable.
   *example 3:
   public static void main(String[] args)
   {
    Integer x = 10 ; 
    Integer y = x ; 
    ++x;
    System.out.println(x); //11
    System.out.println(y); //10
    System.out.println(x==y); //false
      }
  -----------------------------------
  //example 4:
    Integer x = new Integer(10) ; 
    Integer y = new Integer(10) ; 
    System.out.println(x==y); //false
      
  -----------------------------------
    //example 5:
    Integer x = new Integer(10) ; 
    Integer y = 10 ; 
    System.out.println(x==y); //false
      
  -----------------------------------
    //example 6:
    Integer x = 10; 
    Integer y = 10 ; 
    System.out.println(x==y); //true
      
  -----------------------------------
   //example 7:
    Integer x = 100; 
    Integer y = 100; 
    System.out.println(x==y); //true
  -----------------------------------
    //example 8:
    Integer x = 1000; 
    Integer y = 1000; 
    System.out.println(x==y); //false
 */   
  /** in example 8 o/p is false because :
    * to implement autoboxing concept in every wrapper class a buffer of object will be created (except for Float and Double)at the time of class loading.
    * by autoboxing of an object is required to create then JVM will check for the avalibily of that object in buffer.
    * if object not available in buffer then new object will be created.
    * the only range availble in buffer is from -128 to 127 for every wrapper class. for boolean range is always true.
    * thats why it gives false in example 8.  
  */
}
