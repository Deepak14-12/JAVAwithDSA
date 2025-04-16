//abstract class

abstract class Person
{
String name;
int age;

Person(String name, int age){
this.name = name;
this.age = age;
 }
}

class Student extends Person{
int rollNo;
Student(String name, int age,int rollNo){
super(name, age);  //calls cunstructor of super class
this.rollNo = rollNo;
 }

}

class Teacher extends Person{
String subject;
Teacher(String name, int age, String subject){
super(name, age);  //calls cunstructor of super class
this.subject = subject;

}
}
class Person1{
public static void main(String[] args){
Student s = new Student("deeapk",22,63);
Teacher t = new Teacher("bharat",50,"maths");

System.out.println("student" + s.name+" "+s.age+" "+s.rollNo); 
System.out.println("teacher" + t.name+" "+t.age+" "+t.subject);
 }
}
