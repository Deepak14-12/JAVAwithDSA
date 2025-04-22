class NumberThis{
int x;
float f;

void set(int x){
System.out.println(this);
this. x = x;
}

NumberThis(int x){
this.x = x;
}

NumberThis(){} //explicit default constructor

NumberThis(float ft){
this.f = f;
}

void set(float f){
this.f = f;
}

NumberThis(int x,float ft){
this(x); //it should be first statement always
//this(f);  //at a time only one constructor is called 
this.f = f;
}

NumberThis(float f, int x){
this(x,f); //called Number(int x, float f)  
}

}


class DemoThis{
 public static void main(String[] args)
 {
  NumberThis n  =  new NumberThis();
 System.out.println(n.x);
   n.set(45);
System.out.println(n.x);
   n.set(3.4f);
System.out.println(n.f);
  NumberThis n1 =  new NumberThis(2);
System.out.println(n1.x);
   n1.set(45);
System.out.println(n1.x);
   n1.set(3.4f);
System.out.println(n1.f);

  NumberThis n2 =  new NumberThis(4.6f);
System.out.println(n2.x);
   n2.set(45);
System.out.println(n2.x);
   n2.set(3.4f);
System.out.println(n2.f);

  NumberThis n3 =  new NumberThis(34,67.6f);
System.out.println(n3.x);
   n3.set(45);
System.out.println(n3.x);
   n3.set(3.4f);
System.out.println(n3.f);

  NumberThis n4 =  new NumberThis(45.99f,90);
System.out.println(n4.x);
   n4.set(45);
System.out.println(n4.x);
   n4.set(3.4f);
System.out.println(n4.f);
 
}
}
