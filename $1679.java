import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
/*
Max Number of K-Sum Pairs

You are given an integer array nums and an integer k.
In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
Return the maximum number of operations you can perform on the array.
*/

public class $1679 {
    public static int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> numCounts = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            int complement = k - num;

            if (numCounts.getOrDefault(complement, 0) > 0) {
                count++;
                numCounts.put(complement, numCounts.get(complement) - 1);
            } else {
                numCounts.put(num, numCounts.getOrDefault(num, 0) + 1);
            }
        }
        return count;
    }
    @Test
    public void testMaxOperations(){
        int[] nums = {1,2,3,4};
        int k = 5;
        int ans = 2;
        assertEquals(ans, $1679.maxOperations(nums,k));
    }
    @Test
    public void testMaxOperations2(){
        int[] nums = {3,1,3,4,3};
        int k = 6;
        int ans = 1;
        assertEquals(ans, $1679.maxOperations(nums,k));
    }
}
