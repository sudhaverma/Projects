package com.projects.Graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ConnectedComponentsGraph {

	
	public static void main(String args[])
	{
	Graph graph = new Graph();
	graph.addEdges("A" , "B");
	graph.addEdges("B", "C");
	graph.addEdges("C", "D");
	graph.addEdges("A", "D");
	graph.addEdges("D", "E");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of vertices/nodes in the graph");
	int num = sc.nextInt();
	System.out.println("Please enter the scr for BFS traversal of graph");
	String src = sc.next();
	int countofNodes = BFS(graph , src);
	if(countofNodes-num == 0)
	{
		System.out.println("Graph is connected");
	}
	else
	{
		System.out.println("Graph is not connected");
	}
	sc.close();
	}

	public static int BFS(Graph graph, String src) {
		// perform BFS traversal of the given graph and count the number of nodes or vertices in the graph traversed.
		int count = 1;
		Queue<String> q = new LinkedList<String>();
		HashSet<String> visited = new HashSet<String>();
		visited.add(src);
		q.add(src);
		while(!q.isEmpty())
		{
			String next = q.poll();
			System.out.println(next);
			for(String neighbour : graph.getNeighbours(next))
			{
				if(!visited.contains(neighbour))
				{
					visited.add(neighbour);
					q.add(neighbour);
					count++;
				}
			}
		}
		return count;
		
	}
}
