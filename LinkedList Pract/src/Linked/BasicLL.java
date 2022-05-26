package Linked;

public class BasicLL {
	static Node head;
	static class Node
	{
	int data;
	Node next;
	Node (int d)
	{
	data=d;
	next=null;
	}}
	
	Node reverse(Node node)
	{
	Node	prev=null;
	Node	curr=node;
	Node	next=null;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		node=prev;
		return node;
	}
	void print(Node node)
	{
		while(node!=null)
		{
			System.out.print(node.data+ ",");
			node=node.next;
		}
	}
	


	public static void main(String[]  args)
{
		
		BasicLL l=new BasicLL();
		l.head=new Node(231);
		l.head.next =new Node(12);	
		l.print(head);
		head=l.reverse(head);
		l.print(head);

}
}
