package result;
import java.util.Scanner;
class Person {
	String name;
        long mno;
        String dob;
        String fName;
        String mName;
        String address; 
    Scanner sc = new Scanner(System.in);
	
    void setPerson() {
    
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter Date of Birth: ");
        dob = sc.nextLine();
     
        System.out.print("Enter father's name: ");
        fName = sc.nextLine();
        System.out.print("Enter mother's name: ");
        mName = sc.nextLine();
        System.out.print("Enter address name: ");
        address = sc.nextLine();
    }

    void getPerson() {
        System.out.println("Name: " + name);
        System.out.println("DOB: " + dob);
        System.out.println("Father: " + fName);
        System.out.println("Mother: " + mName);
        System.out.println("Address: " + address);
    }

	}
class Student extends Person {
	String rollNo;
        String clg;
	
        void setStudent() {
        System.out.print("Enter rollno: ");
        rollNo = sc.nextLine();
        System.out.print("Enter college name: ");
        clg = sc.nextLine();
        }

    void getStudent() {
        System.out.println("RollNO: " + rollNo);  
        System.out.println("College: " + clg); 
  }

}
class Result extends Student {
    String subject[] = new String[5];
    int subcode[]= new int[5];
    int marks[] = new int[5];
   

void setSubjectsMarks() {
        System.out.println("Enter subject code ,name and marks : ");
        for(int i = 0; i < 5; i++)
        {
         System.out.print("Enter for Subject "+(i+1)+": ");
         subcode[i] = sc.nextInt();
         subject[i] = sc.next();
         marks[i] = sc.nextInt();
       }
  }
        void getResult() {
        int total = 0 ;
        System.out.println("------------------------------------");
        System.out.println("|SCode\t|"+"Subjects\t|"+"Marks      |");
        System.out.println("------------------------------------");
        for(int i = 0; i < 5; i++ )
        {
         total+= marks[i];
         System.out.println("|"+subcode[i]+"\t| "+subject[i]+"\t\t| "+marks[i]+"\t|");
         }
        System.out.println("------------------------------------");
        System.out.println("Total Marks: "+total+"/500           |");
        if(total >= 450)
             System.out.println("Grade: A+                      |");
        else System.out.println("Grade: A - B                   |");
        System.out.println("------------------------------------");
     }
  }

public class Marksheet{
    public static void main(String[] args) {
        Result r = new Result();
       
        r.setPerson(); 
        r.setStudent();
        r.setSubjectsMarks();

        System.out.println("\n--- Student Details And Marksheet---");
        r.getPerson(); 
        r.getStudent();
        r.getResult();
    }
}
