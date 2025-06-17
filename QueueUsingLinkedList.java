package alpha;

public class QueueUsingLinkedList {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	static class Queue {
		static Node head = null;
		static Node tail = null;

		public static boolean isEmpty() {
			return head == null && tail == null;
		}

// add  ~O(1)
		public static void add(int data) {
			Node newNode = new Node(data);
			if (head == null) {
				head = tail = newNode;
				return;
			}
			tail.next = newNode;
			tail = newNode;
		}

// remove ~O(1)
		public static int remove() {
			if (isEmpty()) {
				System.out.println("Queue is empty! cannot delete. ");
				return -1;
			}
			int front = head.data;
			// single element
			if (tail == head)
				tail = head = null;
			else
				head = head.next;
			return front;
		}

//peek
		public static int peek() {
			if (isEmpty()) {
				System.out.println("empty queue.");
				return -1;
			}
			return head.data;
		}
	}

	public static void main(String[] args) {
		Queue q = new Queue();
		Queue.add(5);
		Queue.add(4);
		Queue.add(3);

		while (!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
	}
}
