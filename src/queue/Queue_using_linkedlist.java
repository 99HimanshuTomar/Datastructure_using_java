package queue;

public class Queue_using_linkedlist {

	class Node{
		int data;
		Node next;
		Node(int x){
			data=x;
			next=null;
		}		
	}
	
	Node front, rear;
	int size;
	Queue_using_linkedlist(){
		front=rear=null;
		size=0;
	}
	
	void enque(int x) {
		Node temp=new Node(x);
		size++;
		if(front == null) {
			front=rear=temp;
			return;
		}
		rear.next=temp;
		rear=temp;
	}
	void deque()
	{
		if(front == null) return;
		front = front.next;
		if(front == null) {
			rear=null;
		}
	}
	void show()
	{
		
		Node ptr = front;
        while (ptr != rear.next )
        {
            System.out.print(ptr.data+" ");
            ptr = ptr.next;
        }
        System.out.println(); 
	}
	
	public static void main(String[] args) {
		Queue_using_linkedlist q=new Queue_using_linkedlist();
		q.enque(10);
		q.enque(20);
		q.enque(30);
		q.show();
		System.out.println("__________________________________");
		q.deque();
		q.show();
		System.out.println("__________________________________");
		System.out.println(q.size);
		
		
	}
	
	
}
