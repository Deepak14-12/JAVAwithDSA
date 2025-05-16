package alpha;
import java.util.Scanner;


public class ZeroOneTriangle {
	public static void zeroOneTringle(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				if((i+j) % 2 == 0)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		System.out.print("enter number of rows:");
	Scanner sc = new Scanner(System.in);
	int rows = sc.nextInt();
	
	sc.close();
	
	zeroOneTringle(rows);
	}

}
