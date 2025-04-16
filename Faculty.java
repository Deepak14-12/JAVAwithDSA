//inheritance
class Faculty {
	private String name;
	private float basicSalary;
	private float bonusPercentage;
	private float carAllowancePercentage;

	public Faculty(String name, float basicSalary) {
		this.name = name;
		this.basicSalary = basicSalary;
		this.bonusPercentage = 4.0f; // Changed to float for consistency
		this.carAllowancePercentage = 2.5f;
	}
	public float calculateSalary() {
	    float bonus = (bonusPercentage / 100) * basicSalary;
	    float carAllowance = (carAllowancePercentage / 100) * basicSalary;
	    return basicSalary + bonus + carAllowance;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}

	public float getBonusPercentage() {
		return bonusPercentage;
	}

	public void setBonusPercentage(float bonusPercentage) {
		this.bonusPercentage = bonusPercentage;
	}

	public float getCarAllowancePercentage() {
		return carAllowancePercentage;
	}

	public void setCarAllowancePercentage(float carAllowancePercentage) {
		this.carAllowancePercentage = carAllowancePercentage;
	}
}

class OfficeStaff extends Faculty {
	private String designation;

	public OfficeStaff(String name, float basicSalary, String designation) {
		super(name, basicSalary);
		this.designation = designation;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
}

class Teachers extends Faculty {
	private String qualification;

	public Teachers(String name, float basicSalary, String qualification) {
		super(name, basicSalary);
		this.qualification = qualification;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
}

class Tester {
	public static void main(String[] args) {
		Teachers teacher = new Teachers("Caroline", 30500f, "Masters");
		OfficeStaff officeStaff = new OfficeStaff("James", 24000f, "Accountant");

		System.out.println("Teacher Details\n***************");
		System.out.println("Name: " + teacher.getName());
		System.out.println("Qualification: " + teacher.getQualification());
		System.out.println("Total salary: $" + Math.round(teacher.calculateSalary() * 100) / 100.0);
		System.out.println();

		System.out.println("Office Staff Details\n***************");
		System.out.println("Name: " + officeStaff.getName());
		System.out.println("Designation: " + officeStaff.getDesignation());
		System.out.println("Total salary: $" + Math.round(officeStaff.calculateSalary() * 100) / 100.0);

		// Additional test objects
		Teachers teacher2 = new Teachers("Alice", 35000f, "Doctoral");
		OfficeStaff officeStaff2 = new OfficeStaff("Bob", 28000f, "Clerk");

		// Optional: Print additional test results
		System.out.println("\nAdditional Teacher Details\n***************");
		System.out.println("Name: " + teacher2.getName());
		System.out.println("Qualification: " + teacher2.getQualification());
		System.out.println("Total salary: $" + Math.round(teacher2.calculateSalary() * 100) / 100.0);
		System.out.println();

		System.out.println("Additional Office Staff Details\n***************");
		System.out.println("Name: " + officeStaff2.getName());
		System.out.println("Designation: " + officeStaff2.getDesignation());
		System.out.println("Total salary: $" + Math.round(officeStaff2.calculateSalary() * 100) / 100.0);
	}
}
