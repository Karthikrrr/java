package ADT;
import java.util.Stack;	


class Node{
	int data;
	Node left,right;
	Node(int data)
	{
		this.data=data;
		left=right=null;
	}
}


public class Tre2
{
	Node root;


void printy(Node node)
{
if(node==null)
{
return;	
}
printy(node.right);
printy(node.left);
System.out.print(node.data+ " ");
}
void tprint(){
	printy(root);
}

public static void main(String[] args)
{
Tre2 t=new Tre2();
t.root=new Node(2);
t.root.left=new Node(191);
t.root.right=new Node(1230);

t.tprint();

}
}