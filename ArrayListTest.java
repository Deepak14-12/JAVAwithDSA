package alpha;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Boolean> list2 = new ArrayList<Boolean>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);

		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list);
		list.remove(0);
		list.remove(4);
//    list.set(0, 101);  //RE: IOFB (this method replace existing value by new value at given index  )
//    list.set(4, 110);
//    System.out.println(list);
		System.out.println(list.contains(112));
		System.out.println(list.contains(50));
		list.add(4, 101);
		System.out.println(list);
		list.add(0, 102);
		System.out.println(list);
		System.out.println("size of the list" + list.size());

		System.out.println("------print arraylist using size() and loop------");
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");

		System.out.println("\n------Reverse Print Arraylist------");
		for (int i = list.size() - 1; i >= 0; i--)
			System.out.print(list.get(i) + " ");

		System.out.println("\n------Find Maximum in Arraylist------");
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < list.size(); i++) {
			/*
			 * if (max < list.get(i)) max = list.get(i);
			 */

			// alternative to find max in array list
			max = Math.max(max, list.get(i));
		}
		System.out.print(max);

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("deepak");
		list1.add("kartik");
		list1.add("vinesh");
		list1.add("vikesh");
		list1.add("divya");
		list1.add("baby");

		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println("\n------Arraylist of Type String------");
		System.out.println(list1);
		list1.remove(0);
		System.out.println("after removing index 0 element: "+list1);
		list1.remove(4);
		System.out.println("after removing index 4 element: "+list1);
		System.out.println("if list contains 'deepak':");
		System.out.println(list1.contains("deepak"));
		System.out.println("if list contains 'vinesh':");
		System.out.println(list1.contains("vinesh"));
		list1.add(0, "deepak");
		System.out.println(list1);

	}
}
