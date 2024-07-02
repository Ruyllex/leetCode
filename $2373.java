import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Test;

/*
Largest Local Values in a Matrix

You are given an n x n integer matrix grid.

Generate an integer matrix maxLocal of size (n - 2) x (n - 2) such that:
maxLocal[i][j] is equal to the largest value of the 3 x 3 matrix in grid centered around row i + 1 and column j + 1.
In other words, we want to find the largest value in every contiguous 3 x 3 matrix in grid.
Return the generated matrix.
*/

public class $2373 {
    public static int[][] largestLocal(int[][] grid) {
        int[][] res = new int[grid.length - 2][grid.length - 2];
        for(int i = 0; i != grid.length - 2;i++){
            for(int j = 0; j != grid.length - 2;j++){
                int max = grid[i][j];
                for(int k = i; k != i + 3; k++){
                    for(int l = j; l != j + 3; l++){
                        if(grid[k][l] > max) max = grid[k][l];
                    }
                }
                res[i][j] = max;
            }
        }
        return res;
    }
    @Test
    public void testLargestLocal1() {
        int[][] grid = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        int[][] expected = {{9,9},{8,6}};
        assertTrue(Arrays.deepEquals(expected, $2373.largestLocal(grid)));
    }
}
