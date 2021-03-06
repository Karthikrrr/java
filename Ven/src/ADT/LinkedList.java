package ADT;

char x=int(10);

class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		next=null;
	}
}

public class LinkedList {
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
	
	LinkedList()
	{
		head=null;
	}
	
	Node reverse(Node node)
	{
		System.out.println("nexttts");
		 Node prev = null;
	        Node current = node;
	        Node next = null;
	        while (current != null) {
	        	
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }
	        node = prev;
	        return node;
	}
	
	
	
	void printy(Node node)
	{
		while(node!=null)
		{
			System.out.print(node.data + " ");
			node=node.next;
		}
	}
	
	
	public void sortList()
    {
  
        // Node current will point to head
        Node current = head, index = null;
  
        int temp;
  
        if (head == null) {
            return;
        }
        else {
            while (current != null) {
                // Node index will point to node next to
                // current
                index = current.next;
  
                while (index != null) {
                    // If current node's data is greater
                    // than index's node data, swap the data
                    // between them
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
  
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
  
 
	
	public static void main(String[] args)
	{
		LinkedList l= new LinkedList();
		l.head=new Node(10);
		l.head.next=new Node(20);
		l.head.next.next= new Node(30);
		l.printy(head);
		System.out.println("ASD ASD");
		head=l.reverse(head);
		l.printy(head);
		System.out.println("ASD ASD");
		
		l.sortList();
		l.printy(head);
		
	}

}
