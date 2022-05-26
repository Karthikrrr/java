package Link;
import java.util.*;


public class Reversell
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

static void rec(Node node)
{
Stack<Integer> s=new Stack<>();
Node temp=head;
while(temp!=null)
{
s.add(temp.data);	
temp=temp.next;
}
while(!s.isEmpty())
{
System.out.print(s.pop());
}
}


static void display(Node node)
{
Node temp=head;
while(temp!=null)
{
System.out.print(temp.data);
temp=temp.next;
}
}



public static void main(String[] args)
{
Reversell	r=new Reversell();

r.head=new Node(1);
r.head.next=new Node(2);
r.head.next.next=new Node(3);
r.head.next.next.next=new Node(3);
r.display(head);
System.out.println("rec");
r.rec(head);
}
}
