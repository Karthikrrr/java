package ADT;

public class BST {
	Node root;
	

	static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data=data;
			left=right=null;
		}
	}

	
	BST()
	{
		root=null;
	}
	
	void Printy(Node root)
	{
		if(root==null)
		{
			return;
		}
		Printy(root.left);
			System.out.print(root.data+" ");
		Printy(root.right);
	}
    void printys() { Printy(root); }
	
	public static void main(String[] args)
	{
		BST bt=new BST();
		bt.root=new Node(10);
		bt.printys();
	}
	
}
