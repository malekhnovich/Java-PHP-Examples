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
public class Node 
{
	public String label;
	public boolean visited=false;
        public int dis;
	public Node(String l)
	{
		this.label=l;
                this.dis=0;
	}
}
