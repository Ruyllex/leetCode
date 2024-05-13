import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
Matrix Diagonal Sum

Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal 
that are not part of the primary diagonal.
*/


public class $1572  {
    public static int diagonalSum(int[][] mat) {
        int ans = 0;
        int large = mat[0].length - 1;
        for(int i = 0; i != mat.length; i++){
            if(i == large){
                ans += mat[i][large];
            }
            else{
                ans += mat[i][large];
                ans += mat[i][i];
            }
            large--;
        }
        return ans;
    }
    @Test
    public void testDiagonalSum(){
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int ans = 25;
        assertEquals(ans, $1572.diagonalSum(mat));
    }
    @Test
    public void testDiagonalSum2(){
        int[][] mat = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int ans = 8;
        assertEquals(ans, $1572.diagonalSum(mat));
    }
}
