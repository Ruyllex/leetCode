import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/*
Sort Array By Parity II

Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
Return any answer array that satisfies this condition.
*/

public class $922  {
    public static int[] sortArrayByParityII(int[] nums) {
        int numsLarge = nums.length;
        int[] ans = new int[numsLarge];
        int aux1 = 0;
        int aux2 = 1;
        for(int i = 0; i != numsLarge;i++){
            if(nums[i] % 2 == 0){
                ans[aux1] = nums[i];
                aux1 += 2;
            }
            else{
                ans[aux2] = nums[i];
                aux2 += 2;
            }
        }
        return ans;
    }
    @Test
    public void testSortArrayByParity(){
        int[] nums = {4,2,5,7};
        int[] ans = {4,5,2,7};
        assertArrayEquals(ans, $922.sortArrayByParityII(nums));
    }
    @Test
    public void testSortArrayByParity2(){
        int[] nums = {2,3};
        int[] ans = {2,3};
        assertArrayEquals(ans, $922.sortArrayByParityII(nums));
    }

}
