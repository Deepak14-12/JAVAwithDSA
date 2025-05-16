package alpha;
import java.util.Scanner;

public class SolidRhombousPattern {

	public static void rhombousPattern(int n) {
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j <= n-i; j++)
				System.out.print(" ");
			
			for(int j = 1; j <= n;j++)
				System.out.print("*");

//			for(int j = 1; j <= i-j; j++)
//				System.out.print(" ");
			
			System.out.println();
		}
			
	}
	
	public static void hollowRhombousPattern(int n) {
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j <= n-i; j++)
				System.out.print(" ");
			
			for(int star = 1; star <= n; star++) {
				if(i == 1 || i == n || star == 1 || star == n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
				System.out.println();
		}
			
	}
	
	
	public static void main(String[] args) {
		System.out.print("Enter rows: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		rhombousPattern(n);
		 hollowRhombousPattern(n);

	}

}
