package inner;
class Outer2
{ int x = 10;
  static int y = 20; 
  class Inner2
  {    //cant declare any static members
       int x = 100;
       public void m1()
        {   int x = 1000;
          System.out.println(x+" "+y); //1000 20
          System.out.println(this.x); //100
          System.out.println(Outer2.this.x);  //10
        }
  }
  
  public static void main(String[] args)
  {  
   new Outer2().new Inner2().m1(); 
  }
}
