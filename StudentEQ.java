//override Object class equals(Object obj) method in our class.

class StudentEQ
{
 int rollno;
 String name;

 StudentEQ(String name,int rollno)
 {
   this.name = name;
   this.rollno =  rollno;
 }
/*
 @override
 public Boolean equals(Object obj)
 {
   return (this==obj);  
 }
*/
 public static void main(String []args)
 {
   StudentEQ s1 = new StudentEQ("deepak",123);
   StudentEQ s2 = new StudentEQ("tushar",156);
   StudentEQ s3 = new StudentEQ("deepak",123);
   StudentEQ s4 = s1;
   System.out.println(s1.equals(s2));
   System.out.println(s1.equals(s3));
   System.out.println(s1.equals(s4));
 }
}
