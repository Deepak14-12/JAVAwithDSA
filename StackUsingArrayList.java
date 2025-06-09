package collectionframework;

import java.util.ArrayList;

public class StackUsingArrayList {
	static class StackA {
		static ArrayList<Integer> list = new ArrayList<>();

		public static boolean isEmpty() {
			return list.size() == 0; // returns true if list is empty
		}

		// push
		public void push(int data) {
			list.add(data);
		}

		// pop

		public int pop() {
			if (isEmpty()) {
				return -1;
			}
			int top = list.get(list.size() - 1);
			list.remove(list.size() - 1); // removes last element
			return top; // returns removed element
		}

		// peek
		public int peek() {
			if (isEmpty()) {
				return -1;
			}

			return list.get(list.size() - 1); // returns top element
		}

	}

	public static void main(String[] args) {
		StackA s = new StackA();
		s.push(10);
		s.push(12);
		s.push(30);

		while (!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
		System.out.println(s.peek());
	}

}
