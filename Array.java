import java.util.Scanner;

public class Arrays {

	public static void updateMarks(int marks[]) {
		for (int i = 0; i < marks.length; i++) {
			marks[i] += 1;
		}
	}

	public static void arr2Dinput(int mark3[][]) {
		int n = mark3.length, m = mark3[0].length;
		System.out.println("enter " + n + "  x " + m + " matrix ");
		Scanner sc = new Scanner(System.in);

		// input
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mark3[i][j] = sc.nextInt();
			}
		}

		sc.close();
	}

	public static void print(int mark3[][]) {
		int n = mark3.length, m = mark3[0].length;
		// output
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(mark3[i][j] + " ");

			}
			System.out.println();
		}
	}

	// spiral matrix
	public static void spiralMatrix(int[][] matrix) {
		int startRow = 0;
		int startCol = 0;
		int endRow = matrix.length - 1;
		int endCol = matrix[0].length - 1;
		while (startRow <= endRow && startCol <= endCol) {
			// top
			for (int j = startRow; j <= endCol; j++)
				System.out.print(matrix[startRow][j] + " ");
//right
			for (int j = startRow + 1; j <= endRow; j++)
				System.out.print(matrix[j][endCol] + " ");
//bottom
			for (int j = endCol - 1; j >= startCol; j--) {
				if (startRow == endRow)
					break;
				System.out.print(matrix[endRow][j] + " ");
			}
//left
			for (int j = endRow - 1; j >= startRow + 1; j--) {
				if (startCol == endCol)
					break;
				System.out.print(matrix[j][startCol] + " ");
			}
			startCol++;
			startRow++;
			endCol--;
			endRow--;
			System.out.println();
		}

	}

	public static void diagonalSum(int[][] matrix) {
		int sum1 = 0;
//brute force approach
		/*--->
				for (int i = 0; i < matrix.length; i++) {
					for (int j = 0; j < matrix[i].length; j++) {
						if (i == j)
							sum1 += matrix[i][j];
						else if (i + j == matrix.length - 1)
							sum1 += matrix[i][j];
					}
				}
		--->*/

//optimized -->
		for (int i = 0; i < matrix.length; i++) {
			// pd
			sum1 += matrix[i][i];
			// sd
			sum1 += matrix[i][matrix.length - 1 - i];
		}

		System.out.println("sum of diagonal " + sum1);
	}

	public static boolean searchStaircase(int mat[][], int key) {
		int row = 0, col = mat[0].length-1;

		while (row < mat.length && col >= 0) {
			if (mat[row][col] == key) {
				System.out.println("fount at (" + row + "," + col + ")");
				return true;
			} else if (key < mat[row][col]) {
				col--;
			} else
				row++;

		}
		System.out.println("key not found");
		return false; 
	}

	public static void main(String[] args) {
		// int marks = new int[3];
		// int marks[] = { 97, 98, 99 };

		// 2D array
		// int mark[][] = { { 1, 3, 2 }, { 3, 6, 54 } }; // declaration
		// int mark3[][] = new int[4][4]; // Definition
		// error mark3[][] = {{1 ,2,3},{4,5,6}};
//
//		updateMarks(marks); // passing array as

		// arr2Dinput(mark3);
//
//		for (int i = 0; i < marks.length; i++) {
//			System.out.print(marks[i] + " ");
//		}

		// spiralMatrix(mark3);

		// diagonalSum(mark3);

		int mat[][] = { { 1, 3, 2 }, { 3, 6, 54 }, { 22, 33, 77 }, { 0, 4, 9 } };
		int key = 77;

		searchStaircase(mat, key);

	}

}
