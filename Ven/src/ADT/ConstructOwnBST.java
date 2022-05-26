package ADT;

public class ConstructOwnBST {
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
	 class index
	{
		int index=0;
	}
	ConstructOwnBST()
	{
		root=null;
	}
	void Construct(int arr[],int size)
	{
				return constructTreeUtil(arr, index, 0, size - 1,size);
	}
	
	public static void main(String[] args)
	{
		int[] arr=new int[] {1,241,5,15,14,1424,51,10};
		ConstructOwnBST tree=new ConstructOwnBST();
		int size=arr.length;
		tree.Construct(arr,size);
	}
}
