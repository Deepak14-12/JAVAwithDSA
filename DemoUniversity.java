import java.util.Scanner;
class College
{  int i;
   int code;
   String name;
   Dept d[];

   College()
   {
     System.out.print("Enter college code: ");
     code = Dept.scan.nextInt();
     System.out.print("Enter college name: ");
     name = Dept.scan.next();
     System.out.print("Enter no of department: ");
     d = new Dept[Dept.scan.nextByte()];
     
   }  
   
   void set(Dept d1)
   {
     d[i++]=d1;     
   }
    
   void lastDept(){
    if(i>0){return d[i-1];}
    return null;
   }

   void get_college_info()
   {
     System.out.println("College: "+code+" "+name);
     for(int j=0; j<i; j++)
      {
         d[j].get_dept_info();
     }
  }
}

class Dept
{ 
  int i,j,k;
  int code;
  String name;
  Course course[];
  Students student[];
  Faculty faculty[];

  static Scanner scan=new Scanner(System.in);

  Dept()
  {
     System.out.print("Enter Department code: ");
     code=scan.nextInt();
     System.out.print("Enter Department name:");
     name=scan.next();   
     System.out.print("Enter no of courses:");
     course = new Course[Dept.scan.nextByte()];
     System.out.print("Enter no of students:");
     student = new Students[Dept.scan.nextByte()];	
     System.out.print("Enter no of faculties:");
     faculty = new Faculty[Dept.scan.nextByte()];		
  }
  
  void set(Course course,Students student,Faculty faculty)
   {
     this.course[i++]=course;    
     this.student[j++]=student;      
     this.faculty[k++]=faculty;
  }
  
  Course lastCourse(){
         if(i > 0)
             {return course[i-1];}
  return null;
}
  void get_dept_info()
  {
     System.out.println("Department: "+code+" "+name);
     for(int j=0; j < i;j++)
      {
         course[j].get_course_info();
         if(j < faculty.length)
            faculty[j].get_faculty_info();
         if(j < student.length)
            student[j].get_students_info();
     }
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

class University
{   int i;
   int uni_code;
   String uni_name;
   College c[];

   University()
   {
     System.out.println("Enter University code: ");
     uni_code=Dept.scan.nextInt();
     System.out.println("Enter University name: ");
     uni_name=Dept.scan.next();
     System.out.println("Enter no of college: ");
     c = new College[Dept.scan.nextByte()];
     
   }  

   void set(College c1)
   {
     c[i++] = c1;
   }
   
    void lastCollege(){
    if(i>0){return c[i-1];}
    return null;
   }

   void get_university_info()
   {
     System.out.println(uni_code+" "+uni_name);
     for(int j=0;j<i;j++)
      {
         c[j].get_college_info();
     }
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
