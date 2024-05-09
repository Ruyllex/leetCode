
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

/*
Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
*/


class $1 {
    public static int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 1;
        int[] result = { 0, 0 };

        while (i != nums.length) {
            while (j != nums.length) {
                if ((nums[i] + nums[j]) == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
                j++;
            }
            i++;
            j = i + 1;
        }
        return result;
    }
    @Test
    public void testTwoSum(){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ans = {0,1};
        assertArrayEquals(ans, $1.twoSum(nums,target));
    }
    @Test
    public void testTwoSum2(){
        int[] nums = {3,2,4};
        int target = 6;
        int[] ans = {1,2};
        assertArrayEquals(ans, $1.twoSum(nums,target));
    }
    @Test
    public void testTwoSum3(){
        int[] nums = {3,3};
        int target = 6;
        int[] ans = {0,1};
        assertArrayEquals(ans, $1.twoSum(nums,target));
    }

}
