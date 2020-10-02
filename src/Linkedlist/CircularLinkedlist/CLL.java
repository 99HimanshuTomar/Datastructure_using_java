package Linkedlist.CircularLinkedlist;

class CLL{
	Node head;
	
	public void insertBeg(int data)
	{
		Node temp=new Node();
		temp.data=data;
		
		if(head == null)
		{
			temp.next=temp;
			head=temp;
		}
		else {
			Node curr=head;
			while(curr.next!=head)
			{
				curr=curr.next;
			}
			curr.next=temp;
			temp.next=head;
		
			
		}
	}
	
	public void insertEnd(int data)
	{
		Node temp=new Node();
		temp.data=data;
		
		if(head == null)
		{
			temp.next=temp;
		}
		else {
			Node curr=head;
			while(curr.next!=head)
			{
				curr=curr.next;
			}
			curr.next=temp;
			temp.next=head;	
		}
	}
	
	public void delHead()
	{
		if(head==null)
			head=null;
		if(head.next == head)
			head=null;
		head.data=head.next.data;
		head.next=head.next.next;
	}
	
	public Node delKth(int k)
	{
		if(head==null)
			return head;
		if(k==1)
			 delHead();
		Node curr=head;
		for(int i=0;i<k-2;i++)
		{
			curr=curr.next;
		}
		curr.next=curr.next.next;
		return head;
	}
	
	public void display()
	{
		System.out.print(head.data+" ");
		for (Node p=head.next;p!=head;p=p.next) {
			System.out.print(p.data+" ");
		}
		System.out.println();
	}
	
	
	
	
	
}