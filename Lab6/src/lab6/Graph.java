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
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Graph 
{
	public Node rootNode;
	public ArrayList nodes=new ArrayList();
	public int[][] adjMatrix;//Edges will be represented as adjacency Matrix
	int size;
	public void setRootNode(Node n)
	{
		this.rootNode=n;
	}
        
        public void setRootNode(int i)
        {
            this.rootNode = (Node)nodes.get(i-1);
        }
	
	public Node getRootNode()
	{
		return this.rootNode;
	}
	
	public void addNode(Node n)
	{
		nodes.add(n);
	}
	
	//This method will be called to make connect two nodes
	public void connectNode(Node start,Node end)
	{
		if(adjMatrix==null)
		{
			size=nodes.size();
			adjMatrix=new int[size][size];
		}

		int startIndex=nodes.indexOf(start);
		int endIndex=nodes.indexOf(end);
		adjMatrix[startIndex][endIndex]=1;
		adjMatrix[endIndex][startIndex]=1;
	}
        
        public void loadInformation(String filename) throws FileNotFoundException, IOException {
        
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String line;
            Boolean getNodeInformation = false;
            Boolean getRelationshipInformation = false;

            //begin read information
            while ((line = br.readLine()) != null) {
                if (line.startsWith("*")) {// change the control parameter
                    if (line.startsWith("*Vertices")) {
                        getNodeInformation = true;
                        getRelationshipInformation = false;
                    }
                    if (line.startsWith("*Edges")) {
                        getNodeInformation = false;
                        getRelationshipInformation = true;
                        size = nodes.size();
                        adjMatrix = new int[nodes.size()][nodes.size()];
                    }
                } else {//update the related parameter
                    if (getNodeInformation) {
                        String name = line.substring(line.indexOf(" ") + 1);
                        Node newnode = new Node(name);
                        nodes.add(newnode);
                    }
                    if (getRelationshipInformation) {
                        String[] index = line.split(" ");
                        adjMatrix[Integer.parseInt(index[0]) - 1]
                                [Integer.parseInt(index[1]) - 1] = 1;
                        adjMatrix[Integer.parseInt(index[1]) - 1]
                                [Integer.parseInt(index[0]) - 1] = 1;
                    }
                }
            }
            //end read information 
        }
	
	private Node getUnvisitedChildNode(Node n)
	{
		
		int index=nodes.indexOf(n);
		int j=0;
		while(j<size)
		{
			if(adjMatrix[index][j]==1 && ((Node)nodes.get(j)).visited==false)
			{
				return (Node)nodes.get(j);
			}
			j++;
		}
		return null;
	}
	
	//BFS traversal of a tree is performed by the bfs() function
	public void bfs()
	{
		
		//BFS uses Queue data structure
		Queue q=new LinkedList();
		q.add(this.rootNode);
		printNode(this.rootNode);
		rootNode.visited=true;
		while(!q.isEmpty())
		{
			Node n=(Node)q.remove();
			Node child=null;
			while((child=getUnvisitedChildNode(n))!=null)
			{
				child.visited=true;
				q.add(child);
                                printNode(child);
			}
		}
		//Clear visited property of nodes
		clearNodes();
	}
	
	//DFS traversal of a tree is performed by the dfs() function
	public void dfs()
	{
		//DFS uses Stack data structure
		Stack s=new Stack();
		s.push(this.rootNode);
		rootNode.visited=true;
		printNode(rootNode);
		while(!s.isEmpty())
		{
			Node n=(Node)s.peek();
			Node child=getUnvisitedChildNode(n);
			if(child!=null)
			{
				child.visited=true;
				printNode(child);
				s.push(child);
			}
			else
			{
				s.pop();
			}
		}
		//Clear visited property of nodes
		clearNodes();
	}
	
	
	//Utility methods for clearing visited property of node
	private void clearNodes()
	{
		int i=0;
		while(i<size)
		{
			Node n=(Node)nodes.get(i);
			n.visited=false;
                        n.dis = 0;
			i++;
		}
	}
	
	//Utility methods for printing the node's label
	private void printNode(Node n)
	{
		System.out.print(n.label + " ");
	}

	
	
	

}
