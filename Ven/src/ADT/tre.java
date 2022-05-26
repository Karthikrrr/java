package ADT;

public class Node {
 
Node root;

static class Node{
	int data;
	Node left, right;
	public Node(int data)
	{
		this.data=data;
		right=left=null;
	}
}

Node(){
	root=null;
}


///* function to print level order traversal of tree*/
//void printLevelOrder()
//{
//    int h = height(root);
//    int i;
//    for (i=1; i<=h; i++)
//        printCurrentLevel(root, i);
//}
//
//int height(Node root)
//{
//    if (root == null)
//       return 0;
//    else
//    {
//        /* compute  height of each subtree */
//        int lheight = height(root.left);
//        int rheight = height(root.right);
//         
//        /* use the larger one */
//        if (lheight > rheight)
//            return(lheight+1);
//        else return(rheight+1);
//    }
//}
//
///* Print nodes at the current level */
//void printCurrentLevel (Node root ,int level)
//{
//    if (root == null)
//        return;
//    if (level == 1)
//        System.out.print(root.data + " ");
//    else if (level > 1)
//    {
//        printCurrentLevel(root.left, level-1);
//        printCurrentLevel(root.right, level-1);
//    }
//}
public void printLevelOrder(Node node)

public static void main(String[] args)
{	
	tre tree = new tre();
     tree.root= new Node(1);
     tree.root.left= new Node(2);
     tree.root.right= new Node(3);
     tree.root.left.left= new Node(4);
     tree.root.left.right= new Node(5);
      
     System.out.println("Level order traversal o binary tree is ");
     tree.printLevelOrder(node);
}
	
}
