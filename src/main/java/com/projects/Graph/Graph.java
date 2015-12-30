package com.projects.Graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Graph {
	
	HashMap<String, List<String>> map = new HashMap<String , List<String>>();
	public static void main(String args[])
	{
		Graph graph = new Graph();
		graph.addEdges("A" , "B");
		graph.addEdges("B" , "D");
		graph.addEdges("B" , "C");
		graph.addEdges("C" , "D");
		List<String> neighbours = (List<String>) graph.getNeighbours("B");
		Iterator<String> itr = neighbours.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

	public void addEdges(String src, String vertex) {
		// adds all the edges or vertices to the graph i,e adds given vertex to the src of the graph
		List<String> neigh = map.get(src);
		if(neigh == null)
		{
			map.put(src, neigh = new ArrayList<String>());
		}
		neigh.add(vertex);
		
	}
	public Iterable<String> getNeighbours(String src)
	{
		List<String> neigh = map.get(src);
		if(neigh == null)
		{
			return Collections.emptyList();
		}
		else
		{
			return Collections.unmodifiableList(neigh);
			
		}
		
	}

}
