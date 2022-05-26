package first;

public class Zigzag {
	void dfs(int[][] grid,int  i,int j)
	{
	if(i<0||j<0||grid[i][j]==0||i>grid.length)
	{
	System.out.print(false); 
	}
	grid[i][j]=0;
	dfs(grid,i+1,j);
	dfs(grid,i,j+1);
	dfs(grid,i-1,j);
	dfs(grid,i,j-1);
	
	}
	public static void main(String[]  args)
	{
	int[][]	grid=new int[2][2];
	grid[0][0]=1;
	grid[0][1]=1;
	grid[1][0]=1;
	grid[1][1]=1;
	Zigzag z=new Zigzag();
	int n=grid.length;
	int count=0;
	if(n==0|| grid==null)
	{
		return;
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<grid[j].length;j++)
		{
			z.dfs(grid,i,j);
			count++;
		}
	}

}
}