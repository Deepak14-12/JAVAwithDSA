package alpha;

public class QueueUsingArray{
	static class Queue {
		static int arr[];
		static int size;
		static int rear;

		Queue(int n) {
			arr = new int[n];
			size = n;
			rear = -1;
		}

		public static boolean isEmpty() {
			return rear == -1;
		}

		// add  ~O(1)
		public static void add(int data) {
			if (rear == size - 1) {
				System.out.println("Queue is full! cannot insert data.");
				return;
			}
			rear += 1;
			arr[rear] = data;
		}

		// remove  ~O(n)
		public static int remove() {
			if (isEmpty()) {
				System.out.println("Queue is empty! cannot delete. ");
				return -1;
			}
			int front = arr[0];
			for(int i = 0; i<rear; i++) {
				arr[i] = arr[i+1];
			}
			rear--;
			return front;
		}
		
		public static int peek() {
			if (isEmpty()) {
				System.out.println("Queue is empty! cannot delete. ");
				return -1;
			}
			return arr[0];
		}
	}

	public static void main(String[] args) {
    Queue q = new Queue(5);
    Queue.add(5);
    Queue.add(4);
    q.add(3);
    
    while(!q.isEmpty()) {
    	System.out.println(q.peek());
    	Queue.remove();
    }
	}
}
