import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
/*
Special Array I

An array is considered special if every pair of its adjacent elements contains two numbers with different parity.
You are given an array of integers nums. Return true if nums is a special array, otherwise, return false.
*/

public class $3151 {
    public static boolean isArraySpecial(int[] nums) {
        int large = nums.length;
        if(large == 1){
           return true; 
        }
        boolean ans = true;
        for(int i = 0; i != large - 1; i++){
            if(nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 || nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 ){
                ans = false;
            }
        }
        return ans;
    }
    @Test
    public void testIsArraySpecial(){
        int[] nums = {1};
        assertTrue($3151.isArraySpecial(nums));
    }
    @Test
    public void testIsArraySpecial2(){
        int[] nums = {2,1,4};
        assertTrue($3151.isArraySpecial(nums));
    }
    @Test
    public void testIsArraySpecial3(){
        int[] nums = {4,3,1,6};
        assertFalse($3151.isArraySpecial(nums));
    }

}