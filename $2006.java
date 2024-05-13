
/*
Count Number of Pairs With Absolute Difference K

Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.

The value of |x| is defined as:

    x if x >= 0.
    -x if x < 0.

*/

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class $2006  {
    public static int countKDifference(int[] nums, int k) {
        int large = nums.length;
        int ans = 0;
        for(int i = 0; i != large; i++){
            for(int j = 0;j != large; j++){
                if((nums[i] - nums[j]) == k){
                    ans++;
                }
            }
        }
        return ans;
    }
    @Test
    public void testCountKDifference(){
        int[] nums = {1,2,2,1};
        int k = 1;
        int ans = 4;
        assertEquals(ans, $2006.countKDifference(nums,k));
    }
    @Test
    public void testCountKDifference2(){
        int[] nums = {1,3};
        int k = 3;
        int ans = 0;
        assertEquals(ans, $2006.countKDifference(nums,k));
    }
    @Test
    public void testCountKDifference3(){
        int[] nums = {3,2,1,5,4};
        int k = 2;
        int ans = 3;
        assertEquals(ans, $2006.countKDifference(nums,k));
    }
}
