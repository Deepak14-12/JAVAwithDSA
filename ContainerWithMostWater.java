//leetcode problem: Container With Most Water
package alpha;
import java.util.ArrayList;

public class ContainerWithMostWater {
	// Brute Force Approach TC = O(n^2)
	public static int saveWaterBF(ArrayList<Integer> heights) {
		int maxWater = 0;
		// Calculate Water Area
		for (int i = 0; i < heights.size(); i++) {
			for (int j = i + 1; j < heights.size(); j++) {
				int height = Math.min(heights.get(i), heights.get(j));
				int width = j - i;
				int currentWater = height * width;
				maxWater = Math.max(maxWater, currentWater);
			}
		}
		return maxWater;
	}
        // 2 Pointer Approach: TC = O(n) Linear Time
	public static int saveWater2P(ArrayList<Integer> heights) {
		int maxWater = 0;
		int leftPointer = 0;
		int rightPointer = heights.size() - 1;
		// Calculate Water Area
		while (leftPointer < rightPointer) {
			int height = Math.min(heights.get(leftPointer), heights.get(rightPointer));
			int width = rightPointer - leftPointer;
			int currentWater = height * width;
			maxWater = Math.max(maxWater, currentWater);

			// Update Pointer
			if (heights.get(leftPointer) < heights.get(rightPointer))
				leftPointer++;
			else
				rightPointer--;
		}
		return maxWater;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> heights = new ArrayList<>();
		heights.add(1);
		heights.add(8);
		heights.add(6);
		heights.add(2);
		heights.add(5);
		heights.add(4);
		heights.add(8);
		heights.add(3);
		heights.add(7);

	//	System.out.println("max water can be hold: " + saveWaterBF(heights));
                System.out.println("max water can be hold: " + saveWater2P(heights));
	}

}
