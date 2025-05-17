public class HollowSqaurePattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		for(int line = 1; line <= n; line++) {
			for(int star = 1; star <= n; star++) {
				if(line==1 || line== n || star == 1 || star == n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
		System.out.println();
		}
	}
}
