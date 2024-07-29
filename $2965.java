import static org.junit.Assert.assertArrayEquals;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
/*
Find Missing and Repeated Values
 
You are given a 0-indexed 2D integer matrix grid of size n * n with values in the range [1, n2]. 
Each integer appears exactly once except a which appears twice and b which is missing. The task is to find the 
repeating and missing numbers a and b.
Return a 0-indexed integer array ans of size 2 where ans[0] equals to a and ans[1] equals to b.
*/

public class $2965 {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> set = new HashSet<>();
        int[] ans = new int[2];
        for(int i = 0; i != grid.length; i++){
            for(int j = 0; j != grid[0].length; j++){
                if(set.contains(grid[i][j])){
                    ans[0] = grid[i][j];
                }
                else{
                    set.add(grid[i][j]);
                }
            }
        }
        for(int i = 1; i <= grid.length * grid.length; i++){
            if(!set.contains(i)){
                ans[1] = i;
                }
            }
        return ans;
    }
    @Test    
    public void testFindMissingAndRepeatValues(){
        int[][] grid = {{1,3},{2,2}};
        int[] ans = {2,4};
        assertArrayEquals(ans, $2965.findMissingAndRepeatedValues(grid));
    }
    @Test
    public void testFindMissingAndRepeatValues2(){
        int[][] grid = {{9,1,7},{8,9,2},{3,4,6}};
        int[] ans = {9,5};
        assertArrayEquals(ans, $2965.findMissingAndRepeatedValues(grid));
    }
}
