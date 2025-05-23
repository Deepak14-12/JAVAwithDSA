class Outer
{
  class Inner
  {    //cant declare any static members
       public void m1()
       {
         System.out.println("innner m1");
        }
  }
  
  public static void main(String[] args)
  { Outer o = new Outer();
    Outer.Inner i = o.new Inner();
    //Outer.Inner i= new Outer().New Inner()  --above 2 lines in one line
    i.m1();
    //new Outer().new Inner().m1();  --Above 3 lines in one statement
   System.out.println("outer class main method");
  }
}
