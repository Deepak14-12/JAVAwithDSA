package lab;
class Student {
	private String name;
	private int[] marks;
	private float averageMarks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public float getAverageMarks() {
		return averageMarks;
	}
	public void setAverageMarks(float averageMarks) {
		this.averageMarks = averageMarks;
	}
	public void calculateAverageMarks() {
		int sum = 0;
		int totalSubjects = 0;
		for (int i = 0; i <= marks.length; i++) {
			if (marks[i] < 0) {
				// throw new Exception("Marks must not be negative");
			}
			++totalSubjects;
			sum += marks[i];
		}
		this.averageMarks = sum / totalSubjects;
		System.out.println("Average Marks is : " + this.averageMarks);
	}
}
class 	 {
	public static void main(String[] args) {
		Student student1 = new Student();
		int[] marks = { 96, 65, 76 };
		student1.setMarks(marks);
		try {
			student1.calculateAverageMarks();
		} catch (ArithmeticException e) {
			// This block will execute only if any Arithmetic exception occurs
			// in try block
			System.out.println("Divide by Zero exception occurred!");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// This block will execute only if any
			// ArrayIndexOutOfBoundsException occurs in try block
			System.out.println("Array index out of range exception occurred!");
		} catch (Exception e) {
			// This block will handle all the types of exceptions that occur in
			// try block
			System.out.println(e.getMessage());
		} finally {
			// This block will be executed irrespective of whether an exception
			// has occurred or not
			System.out.println("Thank you for using the program!");
		}
	}
}
