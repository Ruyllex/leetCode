import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

/*
Create Target Array in the Given Order

Given two arrays of integers nums and index. Your task is to create target array under the following rules:

Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.

Return the target array.
It is guaranteed that the insertion operations will be valid.

*/
public class $1389  {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int Large = index.length;
        List<Integer> aux = new ArrayList<>();
        for(int i = 0; i != Large;i++){
            aux.add(index[i], nums[i]);
        }
        int[] ans = new int[Large];
        for (int i = 0; i != Large; i++) {
            ans[i] = aux.get(i);
        }
        return ans;
    }
    @Test
    public void testCreateTargetArray(){
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] ans = {0,4,1,3,2};
        assertArrayEquals(ans, $1389.createTargetArray(nums,index));
    }
    @Test
    public void testCreateTargetArray2(){
        int[] nums = {1,2,3,4,0};
        int[] index = {0,1,2,3,0};
        int[] ans = {0,1,2,3,4};
        assertArrayEquals(ans, $1389.createTargetArray(nums, index));
    }
    @Test
    public void testCreateTargetArray3(){
        int[] nums = {1};
        int[] index = {0};
        int[] ans = {1};
        assertArrayEquals(ans, $1389.createTargetArray(nums, index));
    }
}
