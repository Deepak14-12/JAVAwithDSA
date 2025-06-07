package collectionframework;

import alpha.LinkedList.Node;

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

	// add node AT Last
	public void addLast(int data) {
		// step-1 create new node
		Node newNode = new Node(data);
		size++;
		if (head == null) {
			head = tail = newNode;
			return;
		}

		// step-2
		newNode.prev = tail;
		tail.next = newNode;
		tail = newNode;
	}

	// add in middle of list
	public void addInMiddle(int index, int data) {
		// step-1 create new node
		Node newNode = new Node(data);
		if (index == 0) {
			addFirst(data);
			return;
		}
		Node temp = head;
		int i = 0;
		// step-2 traverse till index-1
		while (i < index - 1) {
			temp = temp.next;
			i++;
		}
		// step-3 add links
		newNode.next = temp.next;
		newNode.prev = temp;
		newNode.next.prev = newNode;
		temp.next = newNode;
		size++;
	}

	// remove node AT First
	public static int removeFirst() {
		if (size == 0) { // if(head==null)
			System.out.println("linked list is empty.");
			return Integer.MIN_VALUE;
		} else if (size == 1) {
			int value = head.data;
			head = tail = null;
			size = 0;
			return value;
		}
		int value = head.data;
		head = head.next;
		head.prev = null;
		size--;
		return value;

	}

	// remove last node
	public static int removeLast() {
		if (size == 0) { // if(head==null)
			System.out.println("linked list is empty.");
			return Integer.MIN_VALUE;
		} else if (size == 1) {
			int value = head.data;
			head = tail = null;
			size = 0;
			return value;
		}
		int value = tail.data;
		tail = tail.prev;
		tail.next = null;
		size--;
		return value;

	}

//reverse DoublyLL
	public void reverseLL() {
		Node current = head;
		Node prev = null;
		Node next;

		while (current != null) {
			next = current.next;
			current.next = prev;
			current.prev = next;

			prev = current;
			current = next;
		}
		head = prev;
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
		// System.out.println(dll.getClass()); ;
		addFirst(12);
		addFirst(13);
		addFirst(14);
		dll.printList();

		dll.addLast(56);
		dll.printList();
		System.out.println("side of list: " + size);

		int removedNode = removeFirst();
		System.out.println("removed element: " + removedNode);
		System.out.println("size of list: " + size);

		dll.reverseLL();
		dll.printList();

		int rml = removeLast();
		System.out.println("removed element: " + rml + "\nsize of list: " + size);
		dll.printList();
		dll.printList();

		dll.addInMiddle(3, 5);
		dll.printList();
	}
}
