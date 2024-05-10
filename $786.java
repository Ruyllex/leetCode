import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

import org.junit.Test;
import java.util.List;
/*
K-th Smallest Prime Fraction

You are given a sorted integer array arr containing 1 and prime numbers, where all the integers of arr are unique.
You are also given an integer k.
For every i and j where 0 <= i < j < arr.length, we consider the fraction arr[i] / arr[j].
Return the kth smallest fraction considered. 
Return your answer as an array of integers of size 2, where answer[0] == arr[i] and answer[1] == arr[j].
*/
import java.util.Map;


public class $786 {
    private static int[] getValueByIndex(HashMap<Float, int[]> map, int index) {
        int i = 0;
        for (Float key : map.keySet()) {
            if (i == index) {
                return map.get(key);
            }
            i++;
        }
        return null; // Si el índice no existe en el mapa
    }
    private static HashMap<Float, int[]> sortByKey(HashMap<Float, int[]> map) {
        List<Map.Entry<Float, int[]>> list = new LinkedList<>(map.entrySet());
        
        Collections.sort(list, new Comparator<Map.Entry<Float, int[]>>() {
            @Override
            public int compare(Map.Entry<Float, int[]> o1, Map.Entry<Float, int[]> o2) {
                return Float.compare(o1.getKey(), o2.getKey());
            }
        });

        HashMap<Float, int[]> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Float, int[]> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        
        return sortedMap;
    }

    public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
        HashMap<Float,int[]> map = new HashMap<>(); 
        int large = arr.length - 1;
        if(k == 1){
            int[] ans = {arr[0],arr[large]};
            return ans;
        }
        for(int i = 0; i != large; i++){
            for(int j = large; j != -1; j--){
                int[] aux = {arr[i],arr[j]};
                Float key = (float)arr[i] / arr[j];
                map.put(key, aux);
            }
        }
        HashMap<Float,int[]> ans = sortByKey(map);
        return getValueByIndex(ans,k - 1);
    }
    @Test
    public void testKthSmallestrPrimeFraction(){
        int[] arr = {1,2,3,5};
        int k = 3;
        int[] ans = {2,5};
        assertArrayEquals(ans, $786.kthSmallestPrimeFraction(arr,k));
    }
    @Test
    public void testKthSmallestrPrimeFraction2(){
        int[] arr = {1,7};
        int k = 1;
        int[] ans = {1,7};
        assertArrayEquals(ans, $786.kthSmallestPrimeFraction(arr,k));
    }

}