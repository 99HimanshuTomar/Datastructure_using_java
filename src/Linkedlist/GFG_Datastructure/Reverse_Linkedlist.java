package Linkedlist.GFG_Datastructure;

import java.io.IOException;
import java.util.Scanner;

class Node1{
 int data;
 Node1 next;
 
 Node1(int x)
{
     data = x;
     next = null;
}
 
}
 
class Reverse_Linkedlist{
	static void printList(Node1 node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
 public static void main(String args[]) throws IOException { 
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     while(t > 0){
     	int n = sc.nextInt();
         Node1 head = new Node1(sc.nextInt());
         Node1 tail = head;
         for(int i=0; i<n-1; i++)
         {
             tail.next = new Node1(sc.nextInt());
             tail = tail.next;
         }
         ReverseLL g = new ReverseLL();
         head = g.reverseList(head);
         printList(head); 
         t--;
     }
 } 
} 
// } Driver Code Ends


 class ReverseLL{
 
 Node1 reverseList(Node1 node)
 {
     Node1 prev1 = null; 
     Node1 current = node; 
     Node1 next1 = null; 
     while (current != null) { 
         next1 = current.next; 
         current.next = prev1; 
         prev1 = current; 
         current = next1; 
     } 
     node = prev1; 
     return node;
 }
}

