package queue;

//it's preety much good approach in this all method take o(1) time complexity. 

public class Queue_circular_array {

	int []arr;
	int front,cap,size;
	
 public Queue_circular_array(int c) {
		
		arr=new int[c];
		cap=c;
		front=0;
		size=0;
		
	}
	
		void enque(int x) {
			if(isfull()) 
				return;
			int rear=getRear();
			rear=(rear+1)%cap;
			arr[rear]=x;
			size++;
			
		}
		
		void deque()
		{
			if(isempty())
				return;
			front=(front+1)%cap;
			size--;
			
		}
		
		int getfront()
		{
			if(isempty())
				return -1;
			else
				return front;
		}
		
		int getRear()
		{
			if(isempty())
				return -1;
			else
				return (front + size -1) % cap;
		}
		
		boolean isfull() {
			if(size == cap) 
				return true;
			else
				return false;
			
		}
		boolean isempty() {
			if(size == 0) 
				return true;
			else
				return false;
		}
		
		int size() {
			return size;
		}
		void show()
		{
			for (int i = 0; i < size; i++) {
				System.out.println(arr[i]);
			}
		}

		public static void main(String[] args) {
			Queue_circular_array q=new Queue_circular_array(5);
			q.enque(10);
			q.enque(20);
			q.enque(30);
			q.show();
			q.deque();
			System.out.println("__________________________________");
			q.show();
			System.out.println("__________________________________");
			System.out.println("Size of queue is: "+q.size());
			System.out.println("__________________________________");
			System.out.println("Rear element: "+q.getRear());
		    System.out.println("Front element: "+q.getfront());	
		}
}
