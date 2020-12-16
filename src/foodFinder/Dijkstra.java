package foodFinder;

import java.util.LinkedList;

/*
 * class that uses Dijkstra's algorithm
 */
public class Dijkstra {
	private int nodeNum; 
	private int dist[][]; 
	private int shortDist[]; 
	private boolean check[]; 
	private int cycleTable[]; 
	private int graphStartNode;
	
	// constructor, declare array that has one more value than the node has
	public Dijkstra(int num) {
		this.nodeNum = num;
		dist = new int[nodeNum+1][nodeNum+1];
	}
	
	// input the distance between two points
	public void input(int fromNode, int toNode,int value) 
	{
		dist[fromNode][toNode] = value;
	}
	
	/*
	 * function that execute Dijkstra's algorithm
	 */
	public void createGraph(int start) {
		shortDist = new int[nodeNum+1];
		check = new boolean[nodeNum+1];
		cycleTable = new int[nodeNum+1];
		graphStartNode = start;
		
		for(int i=1;i<nodeNum+1;i++) {
			shortDist[i] = Integer.MAX_VALUE;
		}
		for(int i=1;i<nodeNum+1;i++) {
			cycleTable[i] = start;
		}
		
		shortDist[start] = 0;
		check[start] = true;
		
		for(int i=1; i<nodeNum+1; i++) {
			if(!check[i] && dist[start][i]!=0) {
				shortDist[i] = dist[start][i];
			}
		}
		
		for(int a=0; a<nodeNum-1;a++) {
			int min = Integer.MAX_VALUE;
			int min_index = -1;
			
			for(int i=1; i<nodeNum+1; i++) {
				if(!check[i] && shortDist[i]!=Integer.MAX_VALUE)
				{
					if(shortDist[i] < min) {
						min = shortDist[i];
						min_index = i;
					}
				}
			}
			
			check[min_index] = true;
			for(int i=1; i<nodeNum+1; i++) {
				if(!check[i] && dist[min_index][i]!=0) {
					if(shortDist[i]>shortDist[min_index]+dist[min_index][i])
					{
						shortDist[i] = shortDist[min_index]+dist[min_index][i];
						cycleTable[i] = min_index;
					}
				}
			}

		}
	}

	/*
	 * function that gets the path
	 * return the result as LinkedList<Integer> 
	 */
	public LinkedList<Integer> getPath(int start, int end){
		if(start > end) {
			int temp = start;
			start = end;
			end = temp;
		}
		
		if(shortDist[end]==Integer.MAX_VALUE)
			return null;
		
		if(start == graphStartNode) 
			return pathToStartNode(start, end);
		else 
			return pathToAnyNode(start, end);
	}
	
	/*
	 * function that is used to get two points that are not selected to starting point
	 */
	private LinkedList<Integer> pathToAnyNode(int start, int end){
		LinkedList<Integer> prevPath;
		LinkedList<Integer> nextPath;
		
		prevPath = pathToStartNode(graphStartNode, start);
		nextPath = pathToStartNode(graphStartNode, end);
		
		LinkedList<Integer> resultPath = new LinkedList<Integer>();
		for(int i=prevPath.size()-1; i>0; i--) {
			resultPath.add(prevPath.get(i));
		}
		for(int i=0;i<nextPath.size();i++) {
			resultPath.add(nextPath.get(i));
		}
		
		return resultPath;
	}
	
	/*
	 * function that is used to get two points that are selected to starting point
	 * 
	 */
	private LinkedList<Integer> pathToStartNode(int start, int end) {

		LinkedList<Integer> localPath = new LinkedList<Integer>();
		
		int preNode = cycleTable[end];
		while(preNode != start) {
			localPath.addFirst(preNode);
			preNode = cycleTable[preNode];
		}
		localPath.addFirst(start);
		localPath.add(end);
		
		return localPath;
	}
	
	/*
	 * function that output the distance between shortest path
	 */
	public int getDistance(int end) {
		return shortDist[end];
	}
	
}
