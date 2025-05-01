package alpha;
import java.util.Scanner;

public class DiamondPattern {

	public static void diamondP(int n) {
		//upper half
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++)
				System.out.print(" ");
			
			for(int j = 1; j <= 2*i-1; j++ )
				System.out.print("*");
			
			System.out.println();
		}
		
		//lower half
		for(int i = n; i >= 1; i--) {
			for(int j = 1; j <= n-i; j++)
				System.out.print(" ");
			
			
			for(int j = 1; j <= 2*i-1; j++ )
				System.out.print("*");
			
			System.out.println();
		}
	}
	
	
	
	
	public static void main(String[] args) {
System.out.print("Enter rows: ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
sc.close();
diamondP(n);
	}

}
