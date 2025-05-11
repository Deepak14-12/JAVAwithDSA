import java.util.Scanner;

public class DemoUniversity {
    public static void main(String[] args) {
        University u = new University();
        boolean b = true;

        while (b) {
            System.out.println("1. Create College");
            System.out.println("2. Add Department to College");
            System.out.println("3. Add Course + Student + Faculty to Department");
            System.out.println("4. Add Subject to Course");
            System.out.println("5. Display University Info");
            System.out.println("6. Exit");
            System.out.print("Enter your option: ");

            byte option = Dept.scan.nextByte();

            switch (option) {
                case 1:
                    u.set(new College());
                    break;
                case 2:
                    if (u.lastCollege() != null)
                        u.lastCollege().set(new Dept());
                    break;
                case 3:
                    if (u.lastCollege() != null && u.lastCollege().lastDept() != null) {
                        u.lastCollege().lastDept().set(new Course(), new Students(), new Faculty());
                    }
                    break;
                case 4:
                    if (u.lastCollege() != null && u.lastCollege().lastDept() != null && u.lastCollege().lastDept().lastCourse() != null) {
                        u.lastCollege().lastDept().lastCourse().set(new Subject());
                    }
                    break;
                case 5:
                    u.get_university_info();
                    break;
                case 6:
                    b = false;
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }

        System.out.println("Thank you. Visit again!");
    }
}

class University {
    int i;
    int uni_code;
    String uni_name;
    College c[];

    University() {
        System.out.print("Enter University code: ");
        uni_code = Dept.scan.nextInt();
        System.out.print("Enter University name: ");
        uni_name = Dept.scan.next();
        System.out.print("Enter number of colleges: ");
        c = new College[Dept.scan.nextByte()];
    }

    void set(College c1) {
        c[i++] = c1;
    }

    College lastCollege() {
        return i > 0 ? c[i - 1] : null;
    }

    void get_university_info() {
        System.out.println("University: " + uni_code + " " + uni_name);
        for (int j = 0; j < i; j++) {
            c[j].get_college_info();
        }
    }
}

class College {
    int i;
    int code;
    String name;
    Dept d[];

    College() {
        System.out.print("Enter college code: ");
        code = Dept.scan.nextInt();
        System.out.print("Enter college name: ");
        name = Dept.scan.next();
        System.out.print("Enter number of departments: ");
        d = new Dept[Dept.scan.nextByte()];
    }

    void set(Dept d1) {
        d[i++] = d1;
    }

    Dept lastDept() {
        return i > 0 ? d[i - 1] : null;
    }

    void get_college_info() {
        System.out.println("  College: " + code + " " + name);
        for (int j = 0; j < i; j++) {
            d[j].get_dept_info();
        }
    }
}

class Dept {
    int i, j, k;
    int code;
    String name;
    Course[] course;
    Students[] student;
    Faculty[] faculty;
    static Scanner scan = new Scanner(System.in);

    Dept() {
        System.out.print("Enter Department code: ");
        code = scan.nextInt();
        System.out.print("Enter Department name: ");
        name = scan.next();
        System.out.print("Enter number of courses: ");
        course = new Course[scan.nextByte()];
        System.out.print("Enter number of students: ");
        student = new Students[scan.nextByte()];
        System.out.print("Enter number of faculties: ");
        faculty = new Faculty[scan.nextByte()];
    }

    void set(Course c, Students s, Faculty f) {
        course[i++] = c;
        student[j++] = s;
        faculty[k++] = f;
    }

    Course lastCourse() {
        return i > 0 ? course[i - 1] : null;
    }

    void get_dept_info() {
        System.out.println("    Department: " + code + " " + name);
        for (int x = 0; x < i; x++) {
            course[x].get_course_info();
            if (x < faculty.length) faculty[x].get_faculty_info();
            if (x < student.length) student[x].get_students_info();
        }
    }
}

class Course {
    int course_code;
    String course_name;
    Subject[] subjects;
    int subjectCount;

    Course() {
        System.out.print("Enter course code: ");
        course_code = Dept.scan.nextInt();
        System.out.print("Enter course name: ");
        course_name = Dept.scan.next();
        System.out.print("Enter number of subjects: ");
        subjects = new Subject[Dept.scan.nextByte()];
    }

    void set(Subject s) {
        subjects[subjectCount++] = s;
    }

    void get_course_info() {
        System.out.println("      Course: " + course_code + " " + course_name);
        for (int i = 0; i < subjectCount; i++) {
            subjects[i].displaySubject();
        }
    }
}

class Subject {
    int subjectCode;
    String subjectName;

    Subject() {
        System.out.print("Enter subject code: ");
        subjectCode = Dept.scan.nextInt();
        System.out.print("Enter subject name: ");
        subjectName = Dept.scan.next();
    }

    void displaySubject() {
        System.out.println("        Subject: " + subjectCode + " " + subjectName);
    }
}

class Faculty {
    String fname;
    String subject;
    String fcode;

    Faculty() {
        Dept.scan.nextLine(); // Consume leftover newline
        System.out.print("Enter faculty name: ");
        fname = Dept.scan.nextLine();
        System.out.print("Enter faculty code: ");
        fcode = Dept.scan.next();
        System.out.print("Enter faculty subject: ");
        subject = Dept.scan.next();
    }

    void get_faculty_info() {
        System.out.println("      Faculty: " + fcode + " " + fname + " " + subject);
    }
}

class Students {
    String sname;
    String courseEnrolled;
    String scode;
    String rollNO;

    Students() {
        Dept.scan.nextLine(); // Consume leftover newline
        System.out.print("Enter student name: ");
        sname = Dept.scan.nextLine();
        System.out.print("Enter student code: ");
        scode = Dept.scan.next();
        System.out.print("Enter student roll number: ");
        rollNO = Dept.scan.next();
        System.out.print("Enter course enrolled in: ");
        courseEnrolled = Dept.scan.next();
    }

    void get_students_info() {
        System.out.println("      Student: " + rollNO + " " + sname + " " + courseEnrolled + " " + scode);
    }
}
