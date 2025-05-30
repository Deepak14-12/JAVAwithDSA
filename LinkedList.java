package alpha;

public class LinkedList {
	// node creation
	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public static Node head;
	public static Node tail;

	// Add at First
	public void addAtFirst(int data) {
		// step-1 create new node
		Node newNode = new Node(data);

		if (head == null) {
			head = tail = newNode;
			return;
		}
		// step-2 newNode's next = head
		newNode.next = head;

		// step-3 head = newNode
		head = newNode;
	}

	public void addAtLast(int data) {
		// step-1 create new node
		Node newNode = new Node(data);

		if (head == null) {
			head = tail = newNode;
			return;
		}
		// step-2 tail's next = new Node
		tail.next = newNode;

		// step-3 tail = newNode
		tail = newNode;
	}

	// print linked list
	public void printList() {
		if (head == null) {
			System.out.println("list is empty!");
			return;
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("null");

	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.printList();
		ll.addAtFirst(11);
		ll.printList();
		ll.addAtFirst(12);
		ll.printList();
		ll.addAtLast(13);
		ll.printList();
		ll.addAtLast(14);
		ll.printList();
	
	}

}
