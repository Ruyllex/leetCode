import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/*
ascal's Triangle
  
Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown: 
*/
public class $118{
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if(numRows == 0){
            return ans;
        }
        ans.add(List.of(1));
        for(int i = 1; i != numRows;i++){
            List<Integer> aux = new ArrayList<>(i + 1);
            aux.add(1 );
            for(int j = 1; j != i; j++){
                aux.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
            }
            aux.add(1);
            ans.add(aux);
        }
        return ans;
    }
    @Test
    public void testPascalTriangle(){
        int numRows = 5;
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>(List.of(1)));
        ans.add(new ArrayList<>(List.of(1,1)));
        ans.add(new ArrayList<>(List.of(1,2,1)));
        ans.add(new ArrayList<>(List.of(1,3,3,1)));
        ans.add(new ArrayList<>(List.of(1,4,6,4,1)));
        assertEquals(ans, $118.generate(numRows));
    }
}