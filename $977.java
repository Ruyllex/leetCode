
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import java.util.Arrays;

/*
Squares of a Sorted Array

Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
*/


public class $977  {
    public static int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i != nums.length; i++){
            ans[i] = nums[i] * nums[i];
        } 
        Arrays.sort(ans);
        return ans;
    }
    @Test
    public void testSortedSquares(){
        int[] nums = {-4,-1,0,3,10};
        int[] ans = {0,1,9,16,100};
        assertArrayEquals(ans, $977.sortedSquares(nums));
    }
    @Test
    public void testSortedSquares2(){
        int[] nums = {-7,-3,2,3,11};
        int[] ans = {4,9,9,49,121};
        assertArrayEquals(ans, $977.sortedSquares(nums));
    }
}
