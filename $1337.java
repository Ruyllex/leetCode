import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Test;
/*
The K Weakest Rows in a Matrix

You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). 
The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.

A row i is weaker than a row j if one of the following is true:

    The number of soldiers in row i is less than the number of soldiers in row j.
    Both rows have the same number of soldiers and i < j.

Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.
*/


public class $1337 {
    public static Map<Integer, Integer> sortByValues(Map<Integer, Integer> map) {
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((entry1, entry2) -> {
            int valueComparison = Integer.compare(entry1.getValue(), entry2.getValue());
            if (valueComparison == 0) {
                return Integer.compare(entry1.getKey(), entry2.getKey());
            } else {
                return valueComparison;
            }
        });
        Map<Integer, Integer> sortedMap = entryList.stream()
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1,
                LinkedHashMap::new
            ));

        return sortedMap;
    }
    public static int countOnes(int[] x){
        int count = 0;
        for(int i = 0; i != x.length; i++){
            if(x[i] == 1) count++;
        }
        return count;
    }
    public static int[] kWeakestRows(int[][] mat, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[k];
        for(int j = 0; j != mat.length; j++){
            map.put(j, countOnes(mat[j]));
        }
        Map<Integer, Integer> sortedMap = sortByValues(map);
        Set<Integer> sortedKeySet = sortedMap.keySet();
        int index = 0;
        for (Integer element : sortedKeySet) {
            if (index >= k) break; 
            ans[index++] = element;
        }
        return ans;
    }
    @Test
    public void testKWeakestRows(){
        int[][] mat = {{1,1,0,0,0},
            {1,1,1,1,0},
            {1,0,0,0,0},
            {1,1,0,0,0},
            {1,1,1,1,1}};
        int k = 3;
        int[] ans = {2,0,3};
        assertArrayEquals(ans, $1337.kWeakestRows(mat,k));
    }
    @Test
    public void testKWeakestRows2(){
        int[][] mat = {{1,0,0,0},
            {1,1,1,1},
            {1,0,0,0},
            {1,0,0,0}};
        int k = 2;
        int[] ans = {0,2};
        assertArrayEquals(ans, $1337.kWeakestRows(mat, k));
    }
    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("$1337");
    }
}
