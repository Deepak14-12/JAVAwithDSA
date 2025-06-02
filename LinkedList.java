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
	public static int size;

	// Add at First
	public void addAtFirst(int data) {
		// step-1 create new node
		Node newNode = new Node(data);
		size++;
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
		size++;
		if (head == null) {
			head = tail = newNode;
			return;
		}
		// step-2 tail's next = new Node
		tail.next = newNode;

		// step-3 tail = newNode
		tail = newNode;
	}

	public void addInMiddle(int index, int data) {
		// step-1 create new node
		Node newNode = new Node(data);
		if (index == 0) {
			addAtFirst(data);
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
		temp.next = newNode;
		size++;
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

	public int removeFirst() {
		if (size == 0) {
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
		size--;
		return value;
	}

	public int removeLast() {
		if (head == null) {
			System.out.println("linked list is empty.");
			return Integer.MIN_VALUE;
		} else if (head.next == null) {
			int value = head.data;
			head = tail = null;
			size = 0;
			return value;
		}
		// prev: i = size-2
		Node prev = head;
		for (int i = 0; i < size - 2; i++) {
			prev = prev.next;
		}
		int value = prev.next.data; // tail's data
		prev.next = null;
		tail = prev;
		size--;
		return value;
	}

	public int itrSearch(int key) {
		Node temp = head;
		int idx = 0;
		while (temp != null) {
			if (temp.data == key) {
				return idx;  //key found
			}
			temp = temp.next;
			idx++;
		}
		//key not found
		return -1;
	}
        // Helper to find middle of the list
    private Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;      // move one step
            fast = fast.next.next; // move two steps
        }

        return slow; // middle node
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null)
            return true;

        // Step 1: Find the middle of the list
        Node midNode = findMiddle(head);

        // Step 2: Reverse the second half of the list
        Node prev = null;
        Node current = midNode;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Step 3: Compare the first and second halves
        Node left = head;
        Node right = prev; // Head of reversed second half

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
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
		ll.addInMiddle(0, 17);
		ll.printList();
		ll.addInMiddle(3, 21);
		ll.printList();
		System.out.println("size of linked list: " + size);
		System.out.println("removed element: " + ll.removeFirst());
		ll.printList();
		System.out.println("size of linked list: " + size);
		System.out.println("removed element: " + ll.removeLast());
		ll.printList();
		System.out.println("size of linked list: " + size);
		System.out.println("Key found at: "+ll.itrSearch(21));
	}

}
