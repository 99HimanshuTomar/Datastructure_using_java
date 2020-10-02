package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue; 

class Graph { 
	static void addEdge(ArrayList<ArrayList<Integer> > adj, 
						int u, int v) 
	{ 
		adj.get(u).add(v); 
		adj.get(v).add(u); 
	} 
 
	static void printGraph(ArrayList<ArrayList<Integer> > adj) 
	{ 
		for (int i = 0; i < adj.size(); i++) { 
			System.out.println("\nAdjacency list of vertex " + i); 
			System.out.print("head"); 

			for (int j = 0; j < adj.get(i).size(); j++) { 
				System.out.print(" -> "+adj.get(i).get(j)); 
			} 
			System.out.println(); 
		} 
	} 
	
	static void BFS(ArrayList<ArrayList<Integer>>adj, int v, int s)
	{
		boolean visited[]= new boolean[v+1];
		Queue<Integer> q=new LinkedList<Integer>();
		visited[s] = true;
		q.add(s);
		while(q.isEmpty() == false)
		{
			int u=q.poll();
			System.out.print(u+" ");
			for(int v1 :adj.get(u))
			{
				if(visited[v1] == false)
				{
					visited[v1] =true;
					q.add(v1);
				}
			}
			
		}
	}
	
	//No source given and graph may be disconnected
	static void BFS_help(ArrayList<ArrayList<Integer> > adj, int s, boolean []visited)
	{
		Queue<Integer> q=new LinkedList<Integer>();
		visited[s]=true;
		q.add(s);
		while(q.isEmpty()==false)
		{
			int u=q.poll();
			System.out.print(u+" ");
			for(int v:adj.get(u)) {
				if(visited[v] == false)
				{
					visited[v]=true;
					q.add(v);
				}
			}
		}
	}
	static int BFS_Disc(ArrayList<ArrayList<Integer>> adj ,int V)
	{
		int count=0;
		boolean visited[]=new boolean[V+1];
		
		for(int i=0;i<V;i++)
			if(visited[i] == false) {
				BFS_help(adj, i ,visited);
				count++;
			}
				
		return count;
	}
	
	static void DFSRec(ArrayList<ArrayList<Integer> > adj, int s,boolean []visited)
	{
		visited[s]=true;
		System.out.print(s+" ");
		for(int u:adj.get(s))
		{
			if(visited[u] == false)
				DFSRec(adj, u, visited);
		}	
	}
	
	static void DFS(ArrayList<ArrayList<Integer> > adj, int V, int s)
	{
		boolean visited[]=new boolean[V];
		DFSRec(adj, s, visited);
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) 
	{ 
		int V = 5; 
		ArrayList<ArrayList<Integer> > adj 
					= new ArrayList<ArrayList<Integer> >(V); 
		
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

		addEdge(adj, 0, 1); 
		addEdge(adj, 0, 4); 
		addEdge(adj, 1, 2); 
		addEdge(adj, 1, 3); 
		addEdge(adj, 1, 4); 
		addEdge(adj, 2, 3); 
		addEdge(adj, 3, 4); 
		
		printGraph(adj); 
		
		System.out.print("\nBFS is given vertices: ");
		BFS(adj, V, 2);
		System.out.println();
		
		System.out.print(BFS_Disc(adj, V));
		System.out.println("\nDisconnected graph: ");
		BFS_Disc(adj, V);
	
		System.out.print("\n\nDFS is: ");
		DFS(adj, V, 2);
	
	} 
} 
