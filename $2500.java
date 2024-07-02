import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
Delete Greatest Value in Each Row
 
You are given an m x n matrix grid consisting of positive integers.
Perform the following operation until grid becomes empty:

    Delete the element with the greatest value from each row. If multiple such elements exist, delete any of them.
    Add the maximum of deleted elements to the answer.
*/


public class $2500  {
    public static int deleteGreatestValue(int[][] grid) {
        int end = grid[0].length;
        int ans = 0;
        int auxMax = 0;
        int indexAuxMax = 0;
        int max = 0;
        int x = 0;
        while(x != end){
            for(int i = 0; i != grid.length;i++){
                for(int j = 0; j != grid[0].length;j++){
                if(auxMax < grid[i][j]){
                    auxMax = grid[i][j];
                    indexAuxMax = j;
                }
                if(j == grid[0].length - 1){
                    grid[i][indexAuxMax] = 0;
                }
            }
                if(max < auxMax){
                    max = auxMax;
                }
                auxMax = 0;
                if(i == grid.length - 1){
                    ans += max;
                    max = 0;
                }
            }
            x++;
        }
        return ans;
    }


    @Test
    public void testDeleteGreatestValue() {
    int[][] grid = {{1,2,4},{3,3,1}};
    int ans = 8;
    assertEquals(ans, $2500.deleteGreatestValue(grid));
    }
}

