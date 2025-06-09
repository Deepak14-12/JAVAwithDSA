package collectionframework;

public class StackUsingLinkedList {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	static class StackA {
		static Node head = null;

		public static boolean isEmpty() {
			return head == null; // returns true if list is empty
		}

		// push
		public void push(int data) {
			Node newNode = new Node(data);
			if (isEmpty()) {
				head = newNode;
				return;
			}

			newNode.next = head;
			head = newNode;

		}

		// pop
		public int pop() {
			if (isEmpty())
				return -1;

			int top = head.data;
			head = head.next;
			return top; //returns top element that has been removed
		}

		// peek
		public int peek() {
			if (isEmpty())
				return -1;
			return head.data;  //returns top element

		}

	}

	public static void main(String[] args) {
		StackA s = new StackA();
		s.push(10);
		s.push(12);
		s.push(30);
		s.push(40);

		while (!StackUsingLinkedList.StackA.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
		System.out.println(s.peek());
		

	}

}
