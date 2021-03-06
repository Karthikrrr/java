package practice;

public class removeDup {
	public int removeDuplicates(int[] nums)
    {
        int fast = 0, slow = 0;
        
        while(fast < nums.length)
        {
            if(nums[slow] == nums[fast])
            {
                fast++;    //if the value in index slow is == index fast then just skip  to next value
            }
            else
            {
			// otherwise store the value of index fast in index slow and move both the indices to next value
                nums[slow+1] = nums[fast];
                slow++;
                fast++;
            }
            
        }
        
        return slow+1;

    }
public static void main(String[] args)
{
removeDup r=new removeDup();
int[] nums=new int[] {1,1,2};
System.out.print(r.removeDuplicates(nums));
}
}
