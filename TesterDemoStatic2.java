import java.util.Scanner;

//static member in a class
class DemoStatic2
{
  int x;
static  Scanner sc = new Scanner(System.in);

 void set()
 {
   x= sc.nextInt();
 }

 void set1(int a)
 {
   x= a; 
 }
}

class TesterDemoStatic2
{
  public static void main(String[] args)
  {
    DemoStatic2 c = new DemoStatic2();
    //c.set();
    c.set1(5);
    c.set1(c.sc.nextInt());
 
   //DemoStatic2 c1 = new DemoStatic2();
   //c1.set1(DemoStatic2.sc.nextInt());
   //c1.set();     

  }
}
