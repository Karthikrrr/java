package LinkedList;

class LL
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
public static class Reverse 
{
static void display()
{
Node temp=head;
while(temp.next!=null)
{
System.out.print(temp.data);
temp=temp.next;
}
}

}

public static void main(String[] args)
{
head=null;
head=new Node(1);
head.next=new Node(2);
head.next.next=new Node(3);
}
}
