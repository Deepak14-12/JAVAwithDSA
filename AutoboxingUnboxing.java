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

}
