public class Array2D {
	
	public static void print(int mat[][]) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void numberOf7s(int mat[][], int key) {
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (key == mat[i][j])
					count++;

			}

		}
		System.out.println(count);

	}

	public static void sumOfSecondRow(int mat[][]) {
		int sum = 0;
		for (int i = 0; i < mat[0].length; i++) {
			sum += mat[1][i];
		}

		System.out.println(sum);
	}

	public static void transPose(int mat[][]) {

		int row = 2;
		int col = 3;

		int[][] transpose = new int[col][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++)
				transpose[j][i] = mat[i][j];
		}
		System.out.println("transposed matrix  ");
		print(transpose);
	}

	public static void main(String[] args) {
		int mat[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
		// int key = 7;
		// numberOf7s(mat, key);
		// sumOfSecondRow(mat);

		// print original array
		print(mat);
		transPose(mat);
	}

}
