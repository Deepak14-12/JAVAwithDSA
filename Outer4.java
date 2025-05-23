package inner;
class Outer4
{
  static class Nested
  {
    public void m1()
    {
     System.out.println("static nested class method");
    }
  }

  public static void main(String[] args)
  {
   Nested n = new Nested();
    n.m1();
  }
}


/** 
  * if want to access static nested class outside of outer class

  * Outer.Nested n = new Outer.Nested();

  * also we can declare static members in static nested classes

*/
