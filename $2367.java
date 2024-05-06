import org.junit.Test;
import static org.junit.Assert.assertEquals;
/*
Number of Arithmetic Triplets

You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff. 
A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:
*/

import java.util.HashMap;

class $2367 {
    public static int arithmeticTriplets(int[] nums, int diff) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            seen.put(nums[i], i);
        }
        for (int num : nums) {
            if (seen.containsKey(num + diff) && seen.containsKey(num + 2 * diff)) {
                counter++;
            }
        }
        return counter;
    }
    @Test
    public void testArithMeticTriplets(){
        int[] nums = {0,1,4,6,7,10};
        int diff = 3;
        int ans = 2;
        assertEquals(ans, $2367.arithmeticTriplets(nums,diff));
    }
    @Test
    public void testArithMeticTriplets2(){
        int[] nums = {4,5,6,7,8,9};
        int diff = 2;
        int ans = 2;
        assertEquals(ans, $2367.arithmeticTriplets(nums,diff));
    }

}