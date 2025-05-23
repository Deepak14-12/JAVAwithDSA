package inner;
interface Outer
{
  public void m1();
  interface Inner
  {
    public void m1();
  }
} 
class TestNested1 implements Outer
{
 public void m1()
  {
    System.out.println("Outer interface method implementation ");
  }
}
class TestNested2 implements Outer.Inner
{
 public void m1()
  {
    System.out.println("Inner interface method implementation ");
  }
}

class TestNestedInterface
{
 public static void main(String[] args)
 {
   TestNested1 t1 = new TestNested1();
    t1.m1(); 
   TestNested2 t2 = new TestNested2();
    t2.m1();
  }
}
