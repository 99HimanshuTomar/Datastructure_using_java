package deque;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Deque_iterator {

	public static void main(String[] args) {
		Deque<Integer> d=new LinkedList<Integer>();
		d.addFirst(10);
		d.addLast(20);
		d.addFirst(5);
		d.addLast(15);
		
		Iterator it=d.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()+" ");
		}
		System.out.println("______________________________");
		for(int x:d) {
			System.out.println(x+" ");
		}
		System.out.println("______________________________");
		
		Iterator it1=d.descendingIterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next()+" ");
		}
		
	}
		//There are three ways to iterate an element in deque
}
