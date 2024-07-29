import static org.junit.Assert.assertEquals;

import org.junit.Test;
/*
Count Negative Numbers in a Sorted Matrix

Given a m x n matrix grid which is sorted in 
non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.
*/

public class $1351 {
    public static int countNegatives(int[][] grid){
        int count = 0;
        for(int i = 0; i != grid.length; i++){
            for(int j = 0; j != grid[0].length;j++){
                if(grid[i][j] < 0){
                    count++;
                }
            }
        }
        return count;
    }
    @Test
    public void testCountNegatives(){
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int ans = 8;
        assertEquals(ans, $1351.countNegatives(grid));
    }
    @Test
    public void testCountNegatives2(){
        int[][] grid = {{3,2},{1,0}};
        int ans = 0;
        assertEquals(ans, $1351.countNegatives(grid));
    }
    
}
