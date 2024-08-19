import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;
import java.util.ArrayList;

/*
Convert an Array Into a 2D Array With Conditions

You are given an integer array nums. You need to create a 2D array from nums satisfying the following conditions:

    The 2D array should contain only the elements of the array nums.
    Each row in the 2D array contains distinct integers.
    The number of rows in the 2D array should be minimal.

Return the resulting array. If there are multiple answers, return any of them.
Note that the 2D array can have a different number of elements on each row.
*/

public class $2610 {
    public static boolean check(List<List<Integer>> vec, int n){
        for(int i = 0; i < vec.size() - 1; i++){
            if(vec.get(i).contains(n)){
                return true;
                }
            }
            return false;
    }
    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        for (int num : nums) {
            if (cur.isEmpty() || !cur.contains(num) ) {
                cur.add(num);
                } 
            else {
                res.add(cur);
                cur = new ArrayList<>();
                cur.add(num);
                }
            }
            res.add(cur);
            return res;
    }
    @Test
    public void testFindMatrix(){
        int[] nums = {1,3,4,1,2,3,1};
        List<List<Integer>> ans  = List.of(List.of(1,3,4,2),List.of(1,3),List.of(1));
        List<List<Integer>> actualList = findMatrix(nums);
        assertTrue(ans.size() == actualList.size() && ans.containsAll(actualList) && actualList.containsAll(ans));
    }
}

