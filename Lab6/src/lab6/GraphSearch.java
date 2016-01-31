/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author maxrenet
 */
import java.io.IOException;

public class GraphSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException 
	{
		
//		Lets create nodes as given as an example in the article
		Node nA=new Node("A");
		Node nB=new Node("B");
		Node nC=new Node("C");
		Node nD=new Node("D");
//		Node nE=new Node("E");
//		Node nF=new Node("F");
//
//		//Create the graph, add nodes, create edges between nodes
//		Graph g=new Graph();
//		g.addNode(nA);
//		g.addNode(nB);
//		g.addNode(nC);
//		g.addNode(nD);
//		g.addNode(nE);
//		g.addNode(nF);
//		g.setRootNode(nA);
//		
//		g.connectNode(nA,nB);
//		g.connectNode(nA,nC);
//		g.connectNode(nA,nD);
//		g.connectNode(nB,nE);
//		g.connectNode(nB,nF);
//		g.connectNode(nC,nF);
            
                
                Graph g = new Graph();
                g.addNode(nA);
                g.addNode(nB);
                g.setRootNode(nA);
                g.connectNode(nA, nB);
                g.loadInformation("/Users/maxrenet/Documents/Friendship.net");
                int rootnodeid = 1;
                g.setRootNode(rootnodeid);
		//Perform the traversal of the graph
		System.out.println("BFS Traversal of a tree is ------------->");
		g.bfs();
		
		System.out.println("\nDFS Traversal of a tree is ------------->");
		g.dfs();
		
	}

}
