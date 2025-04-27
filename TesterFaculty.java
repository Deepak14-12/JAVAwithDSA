class Faculty{
    //Implement your code here
 private   String name;
 private   float basicSalary;
 private    float bonusPercentage;
 private    float carAllowancePercentage;
    
    Faculty(String name,float basicSalary){
        this.name = name;
        this.basicSalary = basicSalary;
        bonusPercentage = 4.0f;
        carAllowancePercentage = 2.5f;
    }
    
    public double calculate(){
        return (basicSalary + bonusPercentage + carAllowancePercentage);
    }
    
    public void setName(String name){
        this.name = name;
    } 
    public String getName(){
        return name;
    }
    
    public void setBasicSalary(float basicSalary){
        this.basicSalary = basicSalary;
    } 
    public float getBasicSalary(){
        return basicSalary;
    }
    
    public void setBonusPercentage(float bonusPercentage){
        this.bonusPercentage = bonusPercentage;
    } 
    public float getBonusPercentage(){
        return bonusPercentage;
    }
    
    public void setCarAllowancePercentage(float carAllowancePercentage){
        this.carAllowancePercentage = carAllowancePercentage;
    } 
    public float getCarAllowancePercentage(){
        return carAllowancePercentage;
    }
    
    
}

class OfficeStaff extends Faculty{
    //Implement your code here
 private   String designation;
    
    public OfficeStaff(String name,float basicSalary, String designation ){
     super(name,basicSalary);
     this.designation = designation;
    }
    
   public double calculateSalary(){
        if(designation.equals("Accountant"))
            return (getBasicSalary() + 10000.0);
        else if(designation.equals("Clerk"))
            return (getBasicSalary() + 7000.0);
        else if(designation.equals("Peon"))
            return (getBasicSalary() + 4500.0);
            
            return getBasicSalary();
    }
    
    public void setDesignation(String designation){
        this.designation = designation;
    }
        public String getDesignation(){
        return designation;
    }
}

class Teacher extends Faculty{
    //Implement your code here
    private String qualification;
    
    public Teacher(String name,float basicSalary, String qualification ){
     super(name,basicSalary);
     this.qualification = qualification;
    }
    
    public void setQualification(String qualification){
        this.qualification = qualification;
    }
    public String getQualification(){
        return qualification;
    }
    
     public double calculateSalary(){
        if(qualification.equals("Doctoral"))
            return (getBasicSalary() + 20000.0);
        else if(qualification.equals("Masters"))
            return (getBasicSalary() + 18000.0);
        else if(qualification.equals("Bachelors"))
            return (getBasicSalary() + 15500.0);
        else if(qualification.equals("Associate"))
            return (getBasicSalary() + 10000.0);
            
            return getBasicSalary();
    }
    
}


class TesterFaculty{
	public static void main(String[] args) {
		
		Teacher teacher = new Teacher("Caroline", 30500f, "Masters");
		OfficeStaff officeStaff = new OfficeStaff("James", 24000f, "Accountant");
		
		System.out.println("Teacher Details\n***************");
		System.out.println("Name: "+teacher.getName());
		System.out.println("Qualification: "+teacher.getQualification());
		System.out.println("Total salary: $" + Math.round(teacher.calculateSalary()*100)/100.0); 
		System.out.println();

		System.out.println("Office Staff Details\n***************");
		System.out.println("Name: "+officeStaff.getName());
		System.out.println("Designation: "+officeStaff.getDesignation());
		System.out.println("Total salary: $" + Math.round(officeStaff.calculateSalary()*100)/100.0); 

        //Create more objects for testing your code   

	}
}
