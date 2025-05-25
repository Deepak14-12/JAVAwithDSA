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
  
    Integer x = new Integer(10) ; 
    Integer y = new Integer(10) ; 
    System.out.println(x==y); //false
      
  -----------------------------------
    Integer x = new Integer(10) ; 
    Integer y = 10 ; 
    System.out.println(x==y); //false
      
  -----------------------------------
    Integer x = 10; 
    Integer y = 10 ; 
    System.out.println(x==y); //true
      
  -----------------------------------
    Integer x = 100; 
    Integer y = 100; 
    System.out.println(x==y); //true
  -----------------------------------
    Integer x = 1000; 
    Integer y = 1000; 
    System.out.println(x==y); //false
 */   
}
