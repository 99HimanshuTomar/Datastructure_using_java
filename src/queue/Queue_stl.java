package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_stl {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();

		// Adds elements {0, 1, 2, 3, 4} to
		// the queue
		for (int i = 0; i < 5; i++)
			q.add(i);

		//1- Display contents of the queue.
		System.out.println("Elements of queue " + q);

		//2- To remove the head of queue.
		int removedele = q.remove();
		System.out.println("removed element-" + removedele);

		System.out.println(q);

		//3-  To view the head of queue
		int head = q.peek();
		System.out.println("head of queue-" + head);

		int size = q.size();
		System.out.println("Size of queue-" + size);
	}

}
