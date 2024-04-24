import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*
Combination Sum


Given an array of distinct integers candidates and a target integer target, 
return a list of all unique combinations of candidates where the chosen numbers sum to target. 
You may return the combinations in any order.
The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the
frequency
of at least one of the chosen numbers is different.
The test cases are generated such that 
the number of unique combinations that sum up to target is less than 150 combinations for the given input.
 */

public class $39 {
    public static List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, target, 0);
        return list;
    }

    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int remain, int start) {
        if (remain < 0)
            return;
        else if (remain == 0)
            list.add(new ArrayList<>(tempList));
        else {
            for (int i = start; i < nums.length; i++) {
                tempList.add(nums[i]);
                backtrack(list, tempList, nums, remain - nums[i], i); // not i + 1 because we can reuse same elements
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    @Test
    public void testCombinationSum() {
        int[] candidates = { 2, 3, 6, 7 };
        int target = 7;
        List<List<Integer>> Expected = Arrays.asList(
                Arrays.asList(2, 2, 3),
                Arrays.asList(7));
        assertEquals(Expected, $39.combinationSum(candidates, target));
    }

    @Test
    public void testCombinationSum2() {
        int[] candidates = { 2, 3, 5 };
        int target = 8;
        List<List<Integer>> Expected = Arrays.asList(
                Arrays.asList(2, 2, 2, 2),
                Arrays.asList(2, 3, 3),
                Arrays.asList(3, 5));
        assertEquals(Expected, $39.combinationSum(candidates, target));
    }

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("$39");
    }
}
