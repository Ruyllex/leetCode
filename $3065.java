import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Arrays;

/*
Minimum Operations to Exceed Threshold Value I

You are given a 0-indexed integer array nums, and an integer k.
In one operation, you can remove one occurrence of the smallest element of nums.
Return the minimum number of operations needed so that all elements of the array are greater than or equal to k.
*/


public class  $3065{
    public static int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int large = nums.length;
        while(i < large && nums[i] < k){
            i++;
        }
        return i;
    }
    @Test
    public void testMinOperatios(){
        int[] nums = {2,11,10,1,3};
        int k = 10;
        int ans = 3;
        assertEquals(ans, $3065.minOperations(nums,k)); 
    }
    @Test
    public void testMinOperatios2(){
        int[] nums = {1,1,2,4,9};
        int k = 1;
        int ans = 0;
        assertEquals(ans, $3065.minOperations(nums,k)); 
    }
    @Test
    public void testMinOperatios3(){
        int[] nums = {1,1,2,4,9};
        int k = 9;
        int ans = 4;
        assertEquals(ans, $3065.minOperations(nums,k)); 
    }
}
