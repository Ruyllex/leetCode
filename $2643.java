import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
/*
Row With Maximum Ones
 
Given a m x n binary matrix mat, find the 0-indexed position of the row that contains the maximum count of ones,
and the number of ones in that row.
In case there are multiple rows that have the maximum count of ones, the row with the smallest row number should be selected.
Return an array containing the index of the row, and the number of ones in it.
*/

public class $2643 {
    public static int[] rowAndMaximumOnes(int[][] mat) {
        int count = 0;
        int max = 0;
        int index = 0;
        for(int i = 0; i != mat.length;i++){
            for(int j = 0; j != mat[i].length;j++){
                if(mat[i][j] == 1) count++;
                }
                if(count > max){
                    max = count;
                    count = 0;
                    index = i;
                }
                count = 0;
        }   
        return new int[]{index,max};    
    }
    @Test
    public void testRowAnsMaximumOnes(){
        int[][] mat = {{0,1},{1,0}};
        int[] ans = {0,1};
        assertArrayEquals(ans,$2643.rowAndMaximumOnes(mat));
    }
    @Test
    public void testRowAnsMaximumOnes2(){
        int[][] mat = {{0,0,0},{0,1,1}};
        int[] ans = {1,2};
        assertArrayEquals(ans,$2643.rowAndMaximumOnes(mat));
    }
    @Test
    public void testRowAnsMaximumOnes3(){
        int[][] mat = {{0,0},{1,1},{0,0}};
        int[] ans = {1,2};
        assertArrayEquals(ans,$2643.rowAndMaximumOnes(mat));
    }
    @Test
    public void testRowAnsMaximumOnes4(){
        int[][] mat = {{0},{1},{1},{1},{0}};
        int[] ans = {1,1};
        assertArrayEquals(ans,$2643.rowAndMaximumOnes(mat));
    }
}