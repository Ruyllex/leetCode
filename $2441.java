import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;
/*
Largest Positive Integer That Exists With Its Negative

Given an integer array nums that does not contain any zeros, find the largest positive integer k such that -k also exists in the array.
Return the positive integer k. If there is no such integer, return -1.
*/

public class  $2441 {
    public static int findMaxK(int[] nums) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for(int i = 0; i != nums.length; i++){
            if(nums[i] < 0){
                negative.add(nums[i]*(-1));
            }
            else{
                positive.add(nums[i]);
                }
        }
        Collections.sort(positive);
        Collections.sort(negative);
        negative.retainAll(positive);
        if (negative.isEmpty()) {
            return -1; 
        }
        ArrayList<Integer> interseccion = new ArrayList<>(negative);
        Collections.sort(interseccion);
        return interseccion.get(interseccion.size() - 1);
    }
    @Test
    public void testFindMax() {
        int[] nums = {-1,2,-3,3};
        int ans = 3;
        assertEquals(ans, $2441.findMaxK(nums));
    }
    @Test
    public void testFindMax2() {
        int[] nums = {-1,10,6,7,-7,1};
        int ans = 7;
        assertEquals(ans, $2441.findMaxK(nums));
        }
    @Test
    public void testFindMax3() {
        int[] nums = {-10,8,6,7,-2,-3};
        int ans = -1;
        assertEquals(ans, $2441.findMaxK(nums));
        }
}
