package alpha;

public class QueueCircularUsingArray {

	static class Queue {
		static int arr[];
		static int size;
		static int rear;
		static int front;

		Queue(int n) {
			arr = new int[n];
			size = n;
			rear = -1;
			front = -1;
		}

		public static boolean isEmpty() {
			return rear == -1 && front == -1;
		}
		
		public static boolean isFull() {
			return (rear + 1) % size == front ;
		}

		// add  ~O(1)
		public static void add(int data) {
			if (isFull()) {
				System.out.println("Queue is full! cannot insert data.");
				return;
			}
			//add first element
			if(front == -1) //empty condition
				front = 0;
			
			rear = (rear+1)%size;
			arr[rear] = data;
		}

		// remove ~O(1)
		public static int remove() {
			if (isEmpty()) {
				System.out.println("Queue is empty! cannot delete. ");
				return -1;
			}
			
			 int result  = arr[front];
			 
			 //last element delete
			 if(rear == front)
				 rear = front = -1;
			 else
				 front = (front + 1)%size;
			 
			return result;
		}
		
		public static int peek() {
			if (isEmpty()) {
				System.out.println("Queue is empty! cannot delete. ");
				return -1;
			}
			return arr[front];
		}
	}

	public static void main(String[] args) {
    Queue q = new Queue(3);
    Queue.add(5);
    Queue.add(4);
    Queue.add(3);
    System.out.println(q.remove());
    q.add(6);
    System.out.println(q.remove());
    q.add(9);
    
    while(!q.isEmpty()) {
    	System.out.println(q.peek());
    	q.remove();
    }
	}
}

