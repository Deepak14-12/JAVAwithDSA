public class PairsInArray {
	public static void pairs(int[] array) {
		int tp = 0;
		for(int i = 0; i < array.length; i++) {
		int crr = array[i]; //2,4,6,8,10
			for(int j = i+1 ; j <array.length; j++) {
				System.out.print("("+crr+","+array[j]+")");
			    tp++;
			}
			System.out.println();
		}
		System.out.println("total number of pairs "+tp);
	}
	
public static void main(String[] args) {
	System.out.println();
	int[] numbers = {2,4,6,8,10};
	pairs(numbers);
}
}
