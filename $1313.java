import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/*
Decompress Run-Length Encoded List


We are given a list nums of integers representing a list compressed with run-length encoding.
Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).  
For each such pair, there are freq elements with value val concatenated in a sublist. 
Concatenate all the sublists from left to right to generate the decompressed list.
Return the decompressed list.
*/

public class $1313  {
    public static int[] decompressRLElist(int[] nums){
        List<Integer> aux = new ArrayList<>();
        for(int i = 0; i != nums.length; i += 2){
            for(int j = 0; j != nums[i]; j++){
                aux.add(nums[i + 1]);
            }
        }
        int[] ans = new int[aux.size()];
        for (int i = 0; i < aux.size(); i++) {
            ans[i] = aux.get(i);
        }
        return ans;
    }
    @Test
    public void testDecompressRLElist(){
        int[] nums = {1,2,3,4};
        int[] ans = {2,4,4,4};
        assertArrayEquals(ans, $1313.decompressRLElist(nums));
    }
    @Test
    public void testDecompressRLElist2(){
        int[] nums = {1,1,2,3};
        int[] ans = {1,3,3};
        assertArrayEquals(ans, $1313.decompressRLElist(nums));
    }
}
