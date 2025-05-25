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
  -----------------------------------
 */   
}
