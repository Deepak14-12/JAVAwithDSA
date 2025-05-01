package alpha;

import java.util.Scanner;

public class Butterfly {

	public static void main(String[] args) {
		System.out.print("Enter Rows: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		butterFly(n);
	}

	//method to print butterfly pattern 
	public static void butterFly(int n) {

		// first half
		for (int i = 1; i <= n; i++) {
			// print star
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			// print space
			for (int j = 1; j <= 2 * (n - i); j++)
				System.out.print(" ");
			// print star
			for (int j = 1; j <= i; j++)
				System.out.print("*");

			System.out.println();
		}

		// second half
		for (int i = n; i >= 1; i--) {
			// print star
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			// print space
			for (int j = 1; j <= 2 * (n - i); j++)
				System.out.print(" ");
			// print star
			for (int j = 1; j <= i; j++)
				System.out.print("*");

			System.out.println();
		}

	}
}
