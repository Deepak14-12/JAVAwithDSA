package alpha;

import java.util.*;

public class ArrayListDemo {
//method for swapping two elements in the list
	public static void swapElements(ArrayList<Integer> list, int idx1, int idx2) {

		int temp = list.get(idx1);
		list.set(idx1, list.get(idx2));
		list.set(idx2, temp);
	}
        public static void sortingElements(ArrayList<Integer> list) {
		System.out.println("\nbefore sorting:\n" + list);
		Collections.sort(list);
		System.out.println("after sorting in ascending order:\n" + list);

		System.out.println("\nbefore sorting:\n" + list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("after sorting in descending order:\n" + list);
	}
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(85);
		list.add(5);
		list.add(2);
		list.add(20);
		int idx1 = 1, idx2 = 3;
		System.out.println("before swapping:\n" + list);
		swapElements(list, idx1, idx2);  //called method for swapping
		System.out.println("after swapping:\n" + list);

		sortingElements(list);

	}
}
