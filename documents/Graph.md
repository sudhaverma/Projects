#What is a Graph? 

A Graph is a data structure which consists of two components :

* Set of vertices or nodes (V)
* Ordered pair of these vertices also called edges(E)

They are basically of two types as given below:

*Directed Graph* :
A directed graph is a graph in which all the vertices are connected together with edges which have direction associated with them. This is also called Digraph.
#####Example:
An edge(A,B) goes from A vertex to B Vertex.

*Undirected Graph* :
An undirected graph is a graph in which edges are not associated with direction.This is also called Bi-directional graph.


###Basic Operations provided by Graph

* adjacent(G,x,y)       - Tests whether there is an edge from node x to node y
* neighbours(G,x)       - Lists all the nodes y such that there is an edge from node x to y.
* add(G,x,y)            - Add to graph G the edge from x to y if it is not there.
* delete(G,x,y)         - Removes the edge from x to y it is there.
* get_node_value(G,x)   - Returns the value associated with the node x.
* get_node_value(G,x,a) - Sets the value associated with the node x to a.


##Representation of a Graph 

Graph can be represented by following ways:

*Adjacency Matrix*  
* In Adjacency Matrix a row and a column represent vertices of the graph.Rows represent source vertices and columns represent destination vertices, and values present (either 0 or 1) in that corresponding row and column represent whether there is a path between vertices.
* Space complexity of Adjacency Matrix is O(V^2) where V is the number of vertices in the graph.
* It is preferable to use Adjacency Matrix when the graph is dense.

*Adjacency List*
*  In Adjacency List every vertex contains a list of every other vertices or adjacent vertices in the graph in the form of a list or array. 
*  Space complexity is O(|V|+|E|) where V is the number of vertices and E is the number of edges in the graph.
*  It is preferable to use Adjacency List when the graph is sparse.

*Advantage of Adjacency Matrix*
* Insertion of a new edge in graph and finding whether there is an edge between two vertices in the graph takes constant time. Hence it is useful for Insertion and Lookup operation in Graph.
* Deletion of an edge takes constant time

*Advantages of Adjacency List*
* They are useful to use when the graph is sparse.
* Space complexity is O(|V| + |E|) which is less than space complexity of Adjacency Matrix.

*Disadvantages of Adjacency Matrix*
* They are inefficient if the graph is sparse.
* They take O(V^2) space complexity .

*Disadvantages of Adjacency List*
* They are inefficient if the graph is dense.
* Lookup operations(searching for an edge between two given vertices) takes time proportional to the size of the list.
* Insertion and deletion also takes O(V+E) since the list of edges would need to be searched sequentially.


##Graph Traversal 

It is a process of visiting all the nodes in the graph in a particular manner.

There are two ways of traversal of graph.

*BFS(Breadth First Search)* : 
* It is a algorithm for traversing a finite graph. In this we visit all the adjacent neighbour vertices before moving on to next deeper level.   We basically explore the breadth first and later move deeper from the starting vertex.
* We make use of Queue for implementation of BFS

*DFS(Depth First Search)* :
* It is another algorithm for traversing a finite graph. In this we visit child nodes before visiting sibling nodes in the graph. It traverses the deepth of any particular path before exploring its breadth. Hence  we move from starting node or vertex to adjacent,unvisited node until we can no longer find an unexplored node from the starting location and then backtracks.

* Stack is used for the implementsiton of DFS.


Code for BFS in Adjacency List

``` 
package org.graphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BFSForAdjacencyList {
	
	public static void main(String args[])
	{
		AdjacencyList al = new AdjacencyList();
		al.addEdge("A", "B");
		al.addEdge("B", "C");
		al.addEdge("C", "A");
		al.addEdge("A", "D");
		
		BFSForAdjacencyList bfs = new BFSForAdjacencyList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the source string in Graph :");
		String source = sc.next();
		System.out.println("BFS Traversal of Graph is->");
		bfs.bfsTraversal(al,source);
		
	}

	private void bfsTraversal(AdjacencyList al, String source) {
		// Traversing the Graph using BFS approach
		HashSet<String> visited = new HashSet<String>();
		Queue<String> queue = new LinkedList<String>();
		queue.add(source);
		visited.add(source);
		
		while(! queue.isEmpty())
		{
			String next=queue.poll();
			System.out.println(next);
			for(String neigh : al.getNeighbours(next))
			{
				
				if(! visited.contains(neigh))
				{
					visited.add(neigh);
					queue.add(neigh);
				}
			}
			
		}
		
	}

}

```

Code for DFS in Adjacency List
```
	package org.graphs;

	import java.util.HashSet;
	import java.util.LinkedList;
	import java.util.Queue;
	import java.util.Scanner;
	import java.util.Stack;

	

public class DFSForAdjacencyList {

		
		public static void main(String args[])
		{
			AdjacencyList al = new AdjacencyList();
			al.addEdge("A", "B");
			al.addEdge("B", "C");
			al.addEdge("C", "A");
			al.addEdge("A", "D");
			
			DFSForAdjacencyList dfs = new DFSForAdjacencyList();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the source string in Graph :");
			String source = sc.next();
			System.out.println("DFS Traversal of Graph is->");
			dfs.dfsTraversal(al,source);
			
		}

		private void dfsTraversal(AdjacencyList al, String source) {
			// Traversing the Graph using DFS approach
			HashSet<String> visited = new HashSet<String>();
			Stack<String> stack = new Stack<String>();
			
			stack.push(source);
			visited.add(source);
			while(! stack.isEmpty())
			{
				String next = stack.pop();
				System.out.println(next);
				
				for(String neigh : al.getNeighbours(next))
				{
					
					if(! visited.contains(neigh))
					{
						visited.add(neigh);
						stack.push(neigh);
					}
				}
			}
		}
}

```


*Applications of BFS*
* Finding the shortest path.
* Analysis of network(i.e, in social networking websites) and relationships. 
* Travelling salesman problem.
* Finding all nodes within one connected component.
* Crawlers in Search Engines.


*Applications of DFS*
* Detecting cycles in a graph.
* Finding path between two given vertices in the graph.
* Topological sort.
* Finding strongly connected components of a graph.
* Testing whether the graph is bipartitie (i.e, Vertices in the graph are divided into two disjoint sets)


##Topological Sort

It is a topological ordering of the directed acyclic graph (called DAG) in which all the vertices of the graph are arranged in such a way that every directed edge uv in the graph vertex u comes before v in the topological ordering.

In the topological sort of the DAG all the edges point upwards.

Code for topological sort:

```
package org.graphs;

import java.util.HashSet;
import java.util.Stack;



public class TopologicalSort {

    private  HashSet<Integer> visited;
	private static  Stack<Integer> reversePost;
	
	public TopologicalSort(AdjacencyList al)
	{
		reversePost = new Stack<Integer>();
		visited = new HashSet<Integer>();
		//Iterate through each vertex in graph and call dfs() on it
		for(int i = 0; i < 7 ; i++)
		{
			if(! visited.contains(i))
				dfs(al,i);
		}
	}
	private  void dfs(AdjacencyList al, int src) {
		
		
		visited.add(src);
		
		
		for( int neigh : al.getNeighbours(src))
		{
			
			if(! visited.contains(neigh))
				dfs(al,neigh);
			
		}
			reversePost.push(src);
			
		
			
		
	}
	public static void main(String args[])
	{
		
		AdjacencyList al = new AdjacencyList();
		al.addEdge(0, 1);
		al.addEdge(0, 5);
		al.addEdge(0, 2);
		al.addEdge(1, 4);
		al.addEdge(5, 2);
		al.addEdge(6, 0);
		al.addEdge(3, 2);
		al.addEdge(3, 4);
		al.addEdge(3, 5);
		al.addEdge(3, 6);
		al.addEdge(6, 4);
		
		TopologicalSort ts = new TopologicalSort(al);
	
		ts.printTopologicalSort(reversePost);
		
		
	}
	private void printTopologicalSort(Stack<Integer> reversePost) {
		
		while(!reversePost.isEmpty())
		{
			System.out.println(reversePost.pop());
		}
		
	}
}


```


## Code to compute 'path between two given vertices' in the graph

```
package org.graphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PathInGraph {

	
	
	public static void main(String args[])
	{
		Graph g = new Graph();
		g.addEdges(0, 8);
		g.addEdges(1, 3);
		g.addEdges(1, 7);
		g.addEdges(1, 9);
		g.addEdges(1, 2);
		g.addEdges(2, 8);
		g.addEdges(2, 1);
		g.addEdges(2, 4);
		g.addEdges(3, 4);
		g.addEdges(3, 5);
		g.addEdges(3, 1);
		g.addEdges(4, 2);
		g.addEdges(4, 3);
		g.addEdges(5, 3);
		g.addEdges(5, 6);
		g.addEdges(6, 7);
		g.addEdges(6, 5);
		g.addEdges(7, 1);
		g.addEdges(1, 6);
		g.addEdges(8, 2);
		g.addEdges(8, 0);
		g.addEdges(8, 9);
		g.addEdges(9, 1);
		g.addEdges(9, 8);
		PathInGraph sp = new PathInGraph();
		int[]prev = new int[10];
		
		System.out.println("Enter the source :");
		Scanner sc = new Scanner(System.in);
		int source = sc.nextInt();
		
		System.out.println("BFS traversal from "+source+"th vertex-->");
	    prev = sp.BFS(g,source,prev);
	    System.out.println("DFS traversal from "+source+"th vertex-->");
	    prev = sp.DFS(g,source,prev);
	   
		Stack s = sp.path(g,prev,8);
		System.out.println("A path from source is->");
		while(!s.isEmpty())
		{
			Integer res = (Integer)s.pop();
			System.out.println(res);
		}
	}

	private Stack<Integer> path(Graph g, int[] prev,int dest) {
		//finding a path between two given vertices in the graph
		Stack<Integer> s = new Stack<Integer>();
		Integer current = dest;
		while(prev[current] != -1)
		{
			s.push(current);
			current = prev[current];
		}
		s.push(current);
		
		return s;
	}

	private int[] DFS(Graph g, int source, int[] prev) {
		HashSet<Integer> visited = new HashSet<Integer>();
		Stack<Integer> s = new Stack<Integer>();
		s.push(source);
		visited.add(source);
		prev[source] = -1;
		while(!s.isEmpty())
		{
			Integer next = s.pop();
			System.out.println(next);
			for(Integer neigh:g.getNeighbours(next))
			{
				if(!visited.contains(neigh))
				{
					visited.add(neigh);
					prev[neigh] = next;
					s.push(neigh);
				}
			}
		}
		
		
		
		return prev;
		
		
	}

	private int[] BFS(Graph g, int source,int[] prev) {
		HashSet<Integer> visited = new HashSet<Integer>();
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(source);
		prev[source] = -1;
		visited.add(source);
		while(!q.isEmpty())
		{
			Integer next = q.poll();
			System.out.println(next);
			for(Integer neigh:g.getNeighbours(next))
			{
				if(!visited.contains(neigh))
				{
					visited.add(neigh);
					prev[neigh] = next;
					q.offer(neigh);
				}
			}
		}
		return prev;
		
		
	}
	
}


```


