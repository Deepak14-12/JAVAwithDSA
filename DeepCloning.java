package langpack;
//Deep cloning of objects
class Cat 
{
  int j ;
  Cat(int j)
  { 
   this.j = j;
  }  
}
class Dog implements Cloneable
{
  Cat c;
  int i ;
  Dog(Cat c, int i)
  { 
   this.c = c;
   this.i = i;
  }  
 public Object clone() throws CloneNotSupportedException
 { Cat c1 = new Cat(c.j);
   Dog d  = new Dog(c1,i);
   return d;
 }
}
class DeepCloning
{
 public static void main(String[] args) throws   CloneNotSupportedException
 {
   Cat c = new Cat(10);
   Dog d1 = new Dog(c,20);
   System.out.println("dog: "+d1.i+" ----- cat: "+d1.c.j);
   Dog d2= (Dog) d1.clone();
   d2.i = 888;
   d2.c.j = 999;
   System.out.println("dog: "+d1.i+" ----- cat: "+d1.c.j);
 }
}
