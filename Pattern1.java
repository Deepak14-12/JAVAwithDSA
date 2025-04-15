package alpha;

public class Pattern1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		for (int line = 1; line <= n; line++) {
			for (int space = n - 1; space >= 1; space--) {
				System.out.print(" ");

			}
			for (int star = 1; star <= line; star++)
				System.out.print("*");

			System.out.println();
		}

	}
}
