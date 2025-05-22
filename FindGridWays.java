//problem: find the ways to reach (n-1,m-1) in a grid. allowed moves- right or down
public class FindGridWays {
	// i = currentRow, j = currentColumn, n = total rows , m = total columns
	public static int gridWays(int i, int j, int n, int m) {
		// base case
		if (i == n - 1 && j == m - 1) { // condition for last cell
			return 1;
		} else if (i == n || j == m) { // boundary cross condition
			return 0;
		}

		int way1 = gridWays(i + 1, j, n, m); // currentRow+1
		int way2 = gridWays(i, j + 1, n, m); // currentColumn+1
		return way1 + way2;
	}

	public static void main(String[] args) {
		int n = 3, m = 3;
		System.out.println("Total Ways To Reach (N-1,M-1) Cell in Grid: " + gridWays(0, 0, n, m)); // cell - (0,0)

	}

}
