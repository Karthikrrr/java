package Treees;
import java.util.*;

class Node
{
int data;
Node left,right;
Node(int data)
{
this.data=data;
left=right=null;
}
}


public class Level {
	Node root;
	public void printy()
	{
		Queue<Node> queue=new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			Node tmp=queue.poll();
			System.out.print(tmp.data + " ");
			if(tmp.left!=null)
			{
				queue.add(tmp.left);
			}
			if(tmp.right!=null)
			{
				queue.add(tmp.right);
			}
		}
	}

	public static void main(String[] args) 
	{
		Level Tree=new Level();
		Tree.root=new Node(1);
		Tree.root.left=new Node(14);
		Tree.root.left.right= new Node(1230);
		Tree.root.right=new Node(210);
		Tree.printy();

	}

}
