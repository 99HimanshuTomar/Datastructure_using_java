package queue;

//In this all method take o(1) time complexity except deque, Only deque will take o(n) time complexity.

public class QueueImp {
	int size,cap;
	int []arr;
	
	public QueueImp(int c) {
		cap=c;
		size=0;
		arr = new int[cap];
	}
	
		void enque(int x) {
			if(isfull()) 
				return;
			arr[size]=x;
			size++;
		}
		
		void deque()
		{
			if(isempty())
				return;
			for (int i = 0; i < size-1; i++) {
				arr[i]=arr[i+1];
			}
			size--;
			
		}
		
		int getfront()
		{
			if(isempty())
				return -1;
			else
				return 0;
		}
		
		int getRear()
		{
			if(isempty())
				return -1;
			else
				return size-1;
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
			QueueImp q=new QueueImp(5);
			q.enque(10);
			q.enque(20);
			q.enque(30);
			q.show();
			q.deque();
			System.out.println("__________________________________");
			q.show();
			System.out.println("__________________________________");
			System.out.println(q.size());
			System.out.println("__________________________________");
			System.out.println(q.getRear());
		    System.out.println(q.getfront());	
		}
	}

	
	

