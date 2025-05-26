package alpha;

import java.util.ArrayList;

public class MultiDimensionArrayList {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
		/*
		 * list1: 1 2 3 4 5 list2: 2 4 6 8 10 list3: 3 6 9 12 15
		 */
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list1.add(i * 1);
			list2.add(i * 2);
			list3.add(i * 3);
		}
		mainList.add(list1);
		mainList.add(list2);
		mainList.add(list3);

		System.out.println(mainList);

		for (int i = 0; i < mainList.size(); i++) {
			ArrayList<Integer> currList = mainList.get(i);
			for (int j = 0; j < currList.size(); j++) {
				System.out.print(currList.get(j) + " ");
			}
			System.out.println();
		}

		/*
		 * ArrayList<Integer> list1 = new ArrayList<>();
		 *
		 * list1.add(10); list1.add(85); list1.add(5); list1.add(2); list1.add(20);
		 * mainlist.add(list1);
		 * 
		 * 
		 * ArrayList<Integer> list2 = new ArrayList<>();
		 * 
		 * list2.add(8); list2.add(7); list2.add(2); list2.add(10); mainlist.add(list2);
		 * System.out.println(mainlist);
		 * 
		 * for (int i = 0; i < mainList.size(); i++) { // ArrayList <Integer> currlist =
		 * mainlist.get(i); // mainlist.get(i).size(); ==> currlist.size();
		 * mainlist.get(i).get(j) ===> currlist.get(j); for (int j = 0; j <
		 * mainList.get(i).size(); j++) { System.out.print(mainlist.get(i).get(j) +
		 * " "); } System.out.println();
		 */
	}
}
