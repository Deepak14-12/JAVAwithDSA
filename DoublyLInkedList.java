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
//reverse DoublyLL
	public void reverseLL() {
	Node current = head;
	Node prev = null;
	Node next;
	
	while(current != null) {
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
		System.out.println(size);
		int removedNode = removeFirst();
		System.out.println("removed element: "+removedNode);
		System.out.println(size);
		dll.reverseLL();
		dll.printList();
	}
}
