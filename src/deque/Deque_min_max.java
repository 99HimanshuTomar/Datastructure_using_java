package deque;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_min_max {
	
	public Deque<Integer> dq;
	
	
	public Deque_min_max() 
	{
		 dq = new LinkedList<Integer>();
	}
	void insertmin(int x)
	{
		dq.offerFirst(x);
	}
	void insertmax(int x)
	{
		dq.offerLast(x);
	}
	int getmin()
	{
		return dq.peekFirst();
	}
	int getmax()
	{
		return dq.peekLast();
	}
	int extramin()
	{
		return dq.pollFirst();
		
	}
	int extramax()
	{
		return dq.pollLast();
	}

	public static void main(String[] args) {
		Deque_min_max d=new Deque_min_max();
		d.insertmin(5);
		d.insertmin(10);
		d.insertmin(15);
		d.insertmax(25);
		System.out.println(d.getmin());
		System.out.println(d.getmax());
		System.out.println(d.extramin());
		System.out.println(d.extramax());
		

	}

}
