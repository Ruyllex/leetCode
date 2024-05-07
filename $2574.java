import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
/*
Left and Right Sum Differences

Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:
    answer.length == nums.length.
    answer[i] = |leftSum[i] - rightSum[i]|.
Where:
    leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
    rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
Return the array answer.
*/

public class $2574{
    public static int sumLeft(int[] nums, int i){
        int ans = 0;
        if(i == 0){
            return 0;
        }
        for(int j = 0; j != i;j++){
            ans += nums[j];
        }
        return ans;
    } 
    public static int sumRight(int[] nums, int i){
        int ans = 0;
        if(i == nums.length){
            return 0;
        }
        for(int j = i + 1; j != nums.length;j++){
            ans += nums[j];
        }
        return ans;
    } 
    public static int[] leftRightDifference(int[] nums) {
        List<Integer> ansList = new ArrayList<>();  
        for(int i = 0; i != nums.length; i++){
            ansList.add(Math.abs(sumLeft(nums,i) - sumRight(nums,i)));
        }   
        int[] ans = ansList.stream().mapToInt(i -> i).toArray();
        return ans; 
    }
    @Test
    public void testLeftRightDifference(){
        int[] nums = {10,4,8,3};
        int[] ans = {15,1,11,22};
        assertArrayEquals(ans, $2574.leftRightDifference(nums));
    }
    @Test
    public void testLeftRightDifference2(){
        int[] nums = {1};
        int[] ans = {0};
        assertArrayEquals(ans, $2574.leftRightDifference(nums));
    }
    
}
