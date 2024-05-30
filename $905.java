import org.junit.Test;
import java.util.Arrays;
/*
Sort Array By Parity

Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
Return any array that satisfies this condition.
*/



public class $905  {
    public static int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int even = 0;
        int odd = nums.length - 1;
        for(int i = 0; i != nums.length;i++){
            if(nums[i] % 2 == 0){
                result[even] = nums[i];
                even++;
                }
            else{
                result[odd] = nums[i];
                odd--;
                }
        }
        return result;
    }
    @Test
    public void testSortArrayByParity(){
        int[] nums = {3,1,2,4};
        int[] ans = {2,4,1,3};
        assert Arrays.equals(sortArrayByParity(nums), ans);
    }
}
