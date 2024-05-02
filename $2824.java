import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

/*
Count Pairs Whose Sum is Less than Target

Given a 0-indexed integer array nums of length n and an integer target,
return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target. 
*/


public class $2824 {
    public static int countPairs(List<Integer> nums, int target) {
        int ans = 0;
        int numsLarge = nums.size();
        for(int i = 0;i != numsLarge; i++){
            for(int j = i + 1;j != numsLarge; j++){
                if( (nums.get(i) + nums.get(j)) < target ){
                    ans++;
                }
            }
        }
        return ans; 
    }
    @Test
    public void testCountPairs(){
        List<Integer> nums = new ArrayList<>(List.of(-1,1,2,3,1));
        int target = 2;
        int ans = 3;
        assertEquals(ans, $2824.countPairs(nums,target));
    }
    @Test
    public void testCountPairs2(){
        List<Integer> nums = new ArrayList<>(List.of(-6,2,5,-2,-7,-1,3));
        int target = -2;
        int ans = 10;
        assertEquals(ans, $2824.countPairs(nums,target));

    }
    
}
