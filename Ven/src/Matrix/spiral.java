package Matrix;
import java.util.*;
public class spiral 
{
	public ArrayList<Integer> check(int[][] matrix)
	{
	ArrayList<Integer> nums=new	ArrayList<Integer>();
	if(matrix==null|| matrix.length==0)
	{
		return nums;
	}
	int bottom=matrix.length-1;
	int right=matrix[0].length-1;
	int top=0;
	int left=0;
//	int bottom=row-1;
	int siz=bottom*right;
	while(nums.size()-1<siz)
	{
		for(int i=left;i<=right;i++)
		{
			nums.add(matrix[top][i]);
			//[o][n]//3
		}
		top++;
		for(int i=top;i<=bottom;i++)
		{
			nums.add(matrix[i][right]);
		}
		right--;
		
		for(int i=right;i>=left;i--)
		{
			nums.add(matrix[bottom][i]);
		}
		bottom--;
		for(int i=bottom;i>=top;i--)
		{
			nums.add(matrix[i][left]);
		}
		left++;
	}
	return nums;
	}
public static void main(String[] args)
{
int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
spiral s=new spiral();
System.out.print(s.check(matrix));
}
}

