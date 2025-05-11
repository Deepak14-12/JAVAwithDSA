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
        University u = new University();
        boolean b=true;
        while(b)
        {
	    System.out.println("1. Create College");
            System.out.println("2. Add Department to College");
            System.out.println("3. Add Course + Student + Faculty to Department");
            System.out.println("4. Add Subject to Course");
            System.out.println("5. Display University Info");
            System.out.println("6. Exit");
            System.out.print("Enter your option: ");
                switch(Dept.scan.nextByte())
		{
			case 1:
				u.set(new College());
				break;
			case 2:
				if(u.lastCollege() !=null)
                                u.lastCollege().set(new Dept());
                                break;
			case 3:
	                       if (u.lastCollege() != null && u.lastCollege().lastDept() != null) 
                                 {
                                   u.lastCollege().lastDept().set(new Course(), new Students(), new Faculty());
                                  }
                               break;
			case 4:
			       if (u.lastCollege() != null && u.lastCollege().lastDept() != null && u.lastCollege().lastDept().lastCourse() != null) 
                                 {
                                   u.lastCollege().lastDept().lastCourse().set(new Subject());
                                 }
                       
                        case 5:
				u.get_university_info();			
				break;
			case 6:
				b=false;
                                break;
                        default:
                                System.out.println("Invalid Option!"); 
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
