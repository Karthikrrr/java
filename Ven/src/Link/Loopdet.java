package Link;
import java.util.*;

public class Loopdet 
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

static void dect(Node node)
{
	HashSet<Integer> s=new HashSet<Integer>();
	Node temp=head;
	while(temp!=null)
	{
		if(s.contains(temp.data))
		{
			System.out.print("loop founf");
			temp=temp.next;
			
		}else {
		s.add(temp.data);
		temp=temp.next;
		}
	}

}

public static void main(String[] args)
{
Loopdet l=new Loopdet();
l.head=new Node(1);
l.head.next=new Node(2);
l.head.next.next=new Node(10);
l.head.next.next.next=new Node(1123);
l.head.next.next.next.next=new Node(1);
l.dect(head);

}

}
