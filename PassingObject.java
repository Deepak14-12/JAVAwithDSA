//passing object as an array
import java.util.Scanner;

class Number 
{
 int x;

 void set(int a)
 {
  x= a;
  }
 
 void add(Number m)
 {
  x  = m.x;
  m.x = m.x + x;
  } 

//returning object from method
 Number add1(Number m)
 {
   Number t = new Number();
   t.x = m.x + x;
   return t;
  }
}

class PassingObject
{ 
  public static void main(String[] args)
  {
    Number n = new Number();
           n.set(4);
           n.add(n);//valid
   // System.out.println(n.add(n));//error:void type is not allowed
    System.out.println(n.add1(n)); //Number@372fa8d cls@hexad

    Number n1 = new Number();
    n1.set(9);
    //n1.add(4); //error: int can not be converted to Number
    n1.add(n);  //shallow copy of n assigned to m in add1 method
    System.out.println("n1 "+n1.x);
        

   Number t1 ;
   t1 = n1.add1(n);
   System.out.println(t1.x);

    }
}
