package collectionframework;

public class DoublyLInkedList {
	public class Node {
		int data;
		Node prev;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;

		}
	}

	public static Node head;
	public static Node tail;
	public static int size;

	// add node AT First
	public static void addFirst(int data) {
		Node newNode = dll.new Node(data);
		size++;
		if (head == null) {
			head = tail = newNode;
			return;
		}
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}

	// remove node AT First
	public static void removeFirst() {
    
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
	static DoublyLInkedList dll = new DoublyLInkedList();
	public static void main(String[] args) {
	//System.out.println(dll.getClass());	;
	}
}
