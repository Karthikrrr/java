package Link;
import java.util.*;
public class Tagetsum 
{
	static Node head;
	static class Node
	{
	int data;
	Node next;
	Node(int data)
	{
	this.data=data;
	next=null;
	}
	}
	static void tag(Node node,int x)
	{
	HashMap<Integer,Integer> hm=new HashMap<>();
	Node temp=head;
	Node tempi=head;
	System.out.print(x);
	while(temp!=null)
	{ 
		tempi=temp.next;
		while(tempi!=null)
		{
			int g=temp.data+tempi.data;
			//System.out.print("  now "+g);
			if(g==x)
			{
				System.out.print(temp.data+" and "+tempi.data);;
			}
			tempi=tempi.next;
		}
		temp=temp.next;
//		int y=x-temp.data;
//		if(hm.containsKey(y))
//		{
//		System.out.print("x is"+x +"y is"+y);	
//		}
//		hm.put(y,temp.data);
//		temp=temp.next;
	}
	
	}
	
	public static void main(String[] args)
	{
		Tagetsum t=new Tagetsum();
		t.head=new Node(1);
		t.head.next=new Node(2);
		t.head.next.next=new Node(3);
		int x=5;
		t.tag(head, x);
	}
	
}
