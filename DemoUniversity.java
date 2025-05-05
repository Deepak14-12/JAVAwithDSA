package collegelab;

import java.util.Scanner;
class college
{   int i;
   int code;
   String name;
   Dept d[];

   college()
   {
     System.out.println("enter college code");
     code=dept.scan.nextInt();
     System.out.println("enter college name");
     name=dept.scan.next();
     System.out.println("enter no of department");
     d=new dept[dept.scan.nextByte()];
   }  

   void set(dept d1)
   {
     d[i++]=d1;     
  }

   void get_college_info()
   {
     System.out.println(code+" "+name);
     for(int j=0;j<i;j++)
      {
         d[j].get_dept_info();
     }
  }
}

class Dept
{
  int code;
  String name;
  static Scanner scan=new Scanner(System.in);
  
  Course
  Dept()
  {
     System.out.println("enter Dept code");
     code=scan.nextInt();
     System.out.println("enter Dept name");
     name=scan.next();   	
  }

  void get_dept_info()
  {
     System.out.println(code+" "+name);
   }

}

public class DemoUniversity
{
  public static void main(String []a)
  {

	//college c=new college();
          University u=new University();
        boolean b=true;
        while(b)
        {
		System.out.println("1.create college\n 2. Display college\n 3.exit");
                System.out.println("enter the option");
                switch(dept.scan.nextByte())
		{

			case 1:
				u.set(new college());
				dept.scan.nextInt();
				break;
			case 2:
				u.get_university_info();
				dept.scan.nextInt();				
				break;
			case 3:
				b=false;
		}
               
	}
	
	
	System.out.println("Thank you Visit again");
  }

}

class Course
{
  int course_code;
  String course_name;
  static Scanner scan=new Scanner(System.in);

  Course()
  {
     System.out.println("enter course code");
     course_code=scan.nextInt();
     System.out.println("enter course name");
     course_name=scan.next();   	
  }


  void get_course_info()
  {
     System.out.println(course_code+" "+course_name);
   }

}

class Faculty
{
String fname;
String designation;
String fcode;

Faculty()
  {
     System.out.println("enter faculty name");
     fname = scan.nextLine();
     System.out.println("enter faculty code");
     fcode=scan.next();
     System.out.println("enter designation code");
     designation=scan.next();   	
  }

void get_faculty_info()
  {
     System.out.println(fcode+" "+fname);
   }
}

class Students
{
String sfname;
String courseEnrolled;
String scode;

Students()
  {
     System.out.println("enter student name: ");
     fname = scan.nextLine();
     System.out.println("enter student code: ");
     fcode=scan.next();
     System.out.println("enter course enrolled in: ");
     designation=scan.next();   	
  }

void get_student_info()
  {
     System.out.println(scode+" "+sname);
   }
}
