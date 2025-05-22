class EmailRegex {
	public static boolean isValidEmail(String email) {
		boolean flag = false;
		String regex = "[a-zA-Z0-9]+@[a-zA-Z]+\\.(com|in)";

		if (email.matches(regex))
			 flag = true;

		return flag;
	}

	public static void main(String[] args) {
		String email = "steve123@gmail.com";
		System.out.println("The Email Id of the customer is " + email);
		if (isValidEmail(email))
			System.out.println("The Email Id is valid!");
		else
			System.out.println("The Email Id is invalid!");
	}
}
