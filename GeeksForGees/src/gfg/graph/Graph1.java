package gfg.graph;

import java.util.LinkedList;

public class Graph1 {

	static class Graph{
		int v;
		LinkedList<Integer> adjListArray[];
		
		Graph(int v){
			this.v = v;
			adjListArray = new LinkedList[5];
			for(int i = 0; i<v; i++){
				adjListArray[i] = new LinkedList<>();
			}
		}
	}
	
	static void pintGraph(Graph graph){
		for(int i=0;i<graph.v; i++){
			System.out.println("Adjancency list of Vertex"+ i);
			System.out.println("Head ");
			for(Integer pCrawl: graph.adjListArray[i] ){
				System.out.println("-> "+pCrawl);
			}
			System.out.println("\n");
		}
	}
	
	static void addEdge(Graph graph, int src, int dest){
		graph.adjListArray[src].addFirst(dest);
		graph.adjListArray[dest].addFirst(src);
	}
	
	public static void main(String[] args) {
		int v = 5;
		Graph graph = new Graph(v);
		addEdge(graph, 0, 1);
		addEdge(graph, 0, 4);
		addEdge(graph, 1, 2);
		addEdge(graph, 1, 3);
		addEdge(graph, 1, 4);
		addEdge(graph, 2, 3);
		addEdge(graph, 3, 4);
		
		pintGraph(graph);
	}

}
