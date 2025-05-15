
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
