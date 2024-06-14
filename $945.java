import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Test;
/*
Minimum Increment to Make Array Unique

You are given an integer array nums. In one move, you can pick an index i where 0 <= i < nums.length and increment nums[i] by 1.
Return the minimum number of moves to make every value in nums unique.
The test cases are generated so that the answer fits in a 32-bit integer.
*/

public class $945{
    public static int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums); 
        int ans = 0; 
        int last = nums[0]; 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= last) { 
                ans += (last + 1) - nums[i]; 
                last++;
            } else {
                last = nums[i]; 
            }
        }
        return ans;
    }
    @Test
    public void testSumCounts(){
        int[] nums = {1,2,2};
        int ans = 1;
        assertEquals(ans, $945.minIncrementForUnique(nums));
    }
    @Test
    public void testSumCounts1(){
        int[] nums = {3,2,1,2,1,7};
        int ans = 6;
        assertEquals(ans, $945.minIncrementForUnique(nums));
    }
}
