import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Arrays;
/*
Height Checker

A school is trying to take an annual photo of all the students. 
The students are asked to stand in a single file line in non-decreasing order by height. 
Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.

You are given an integer array heights representing the current order that the students are standing in. 
Each heights[i] is the height of the ith student in line (0-indexed).

Return the number of indices where heights[i] != expected[i].
*/

public class $1051{
    public static int heightChecker(int[] heights) {
        int[] aux =  Arrays.copyOf(heights, heights.length);
        int ans = 0;
        Arrays.sort(aux);
        for(int i = 0; i != heights.length; i++){
            if(aux[i] != heights[i]){
                ans++;
            }
        }
        return ans;
    }
    @Test
    public void testHeightChecker(){
        int[] height = {1,1,4,2,1,3};
        int ans = 3;
        assertEquals(ans, $1051.heightChecker(height));
    }
    @Test
    public void testHeightChecker2(){
        int[] height = {5,1,2,3,4};
        int ans = 5;
        assertEquals(ans, $1051.heightChecker(height));
    }
    @Test
    public void testHeightChecker3(){
        int[] height = {1,2,3,4,5};
        int ans = 0;
        assertEquals(ans, $1051.heightChecker(height));
    }
}