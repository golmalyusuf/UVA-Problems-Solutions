package graph;

import java.util.LinkedList;

public class FirstGraph {

	public static void main(String[] args) {
		int V = 5;
		Graph graph = new Graph(V);
		addEdge(graph, 0, 1);
		addEdge(graph, 0, 4);
		addEdge(graph, 1, 2);
		addEdge(graph, 1, 3);
		addEdge(graph, 1, 4);
		addEdge(graph, 2, 3);
		addEdge(graph, 3, 4);
		
		printGraph(graph);
	}
	
	static class Graph {
		int V;
		LinkedList<Integer> adjListArray[];
		
		Graph(int v){
			this.V = v;
			
			adjListArray = new LinkedList[V];
			for(int i=0; i<V; i++){
				adjListArray[i] = new LinkedList<>();
			}
		} 
	}
	
	static void addEdge(Graph graph, int src, int dest) {
		graph.adjListArray[src].addFirst(dest);
		graph.adjListArray[dest].addFirst(src);
	}
	
	static void printGraph(Graph graph){
		for(int i=0; i < graph.V; i++){
			System.out.println("Addjacency List of Vertex "+i);
			System.out.println("head");
			
			for(Integer pCrawl: graph.adjListArray[i]){
				System.out.print("->>"+pCrawl);
			}
			System.out.println();
		}
	}
}
