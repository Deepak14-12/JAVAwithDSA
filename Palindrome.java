//write a program to check given number is palindrome or not.
import java.util.Scanner;
class Palindrome {
	public static void main(String[] args) {
		// Implement your code here 
	int	number, r = 0, remainder =0;
	
Scanner sc = new Scanner(System.in);
number = sc.nextInt();
int temp = number;
		
		while(temp != 0)
		{
		  remainder = temp % 10;
		  //System.out.println(r);
		  r = r * 10 + remainder;
		  temp = temp/10;
		}
		
		if(number == r)
		System.out.println(r +" is a palindrome");
		else
		System.out.println(r +"is a not a palindrome");
    }
}
