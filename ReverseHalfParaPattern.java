package alpha;

import java.util.Scanner;

public class ReverseHalfParaPattern {

	public static void main(String[] args) {
		System.out.print("Enter rows to print: ");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		sc.close();
		pattern(rows);
	}

public static void pattern(int rows) {
	for (int i = 1; i <= rows; i++) {
		for (int j = 1; j <= rows - i; j++) {
			System.out.print(" ");

		}
		for (int k = 1 ; k <= i; k++) {
			System.out.print("*");

		}
		System.out.println();
	}

	}

}
