package inner;
class Outer1
{
  class Inner1
  {    //cant declare any static members
       public void m1()
       {
         System.out.println("innner1 m1");
       }
  }
   //instance area
   public void m2()
    {
      Inner1 i = new Inner1();
      i.m1();
     }
  
  public static void main(String[] args)
  { Outer1 o = new Outer1();
    o.m2();
    System.out.println("outer class main method");
  }
}
