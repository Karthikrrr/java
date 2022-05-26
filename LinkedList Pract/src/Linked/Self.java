package Linked;

public class Self {
	static Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	void print(Node node)
	{
		while(node!=null)
		{
			System.out.print(node.data);
			node=node.next;
		}
	}
	
	public static void main(String[] args)
	{
		Self l=new Self();
		l.head=new Node(10);
		l.head.next=new Node(14320);
		l.print(head);
	}
}
