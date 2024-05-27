import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
Maximum Product Difference Between Two Pairs

The product difference between two pairs (a, b) and (c, d) is defined as (a * b) - (c * d).

For example, the product difference between (5, 6) and (2, 7) is (5 * 6) - (2 * 7) = 16.

Given an integer array nums, choose four distinct indices w, x, y, and z such that the product difference between pairs (nums[w], nums[x])
 and (nums[y], nums[z]) is maximized.

Return the maximum such product difference.
*/



public class $1913{
    public static int maxProductDifference(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max1){
                max2 = max1;
                max1 = nums[i];
            }else if(nums[i] > max2){
                max2 = nums[i];
                }
            if(nums[i] < min1){
                min2 = min1;
                min1 = nums[i];
                    }else if(nums[i] < min2){
                        min2 = nums[i];
                        }
            }
        return max1 * max2 - min1 * min2;
    }
    @Test
    public void testMaxProductDifference(){
        int[] nums = {5,6,2,7,4};
        int ans = 34;
        assertEquals(ans, $1913.maxProductDifference(nums));
    }
    @Test
    public void testMaxProductDifference2(){
        int[] nums = {4,2,5,9,7,4,8};
        int ans = 64;
        assertEquals(ans, $1913.maxProductDifference(nums));
    }

}
