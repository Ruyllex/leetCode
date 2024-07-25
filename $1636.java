import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Map.Entry;

/*
 Sort Array by Increasing Frequency

Given an array of integers nums, sort the array in increasing order based on the frequency of the values. 
If multiple values have the same frequency, sort them in decreasing order.

Return the sorted array.
*/

public class $1636{
    public static LinkedHashMap<Integer, Integer> sortByValueAndKey(HashMap<Integer, Integer> map) {
        // Crear una lista de las entradas del HashMap
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        // Ordenar la lista con un comparador personalizado
        Collections.sort(list, (e1, e2) -> {
            int valueComparison = e1.getValue().compareTo(e2.getValue());
            if (valueComparison != 0) {
                return valueComparison; // Ordenar por valor en orden ascendente
            } else {
                return e2.getKey().compareTo(e1.getKey()); // Ordenar por clave en orden descendente en caso de empate
            }
        });

        // Mantener el orden en un LinkedHashMap
        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
    public static int[] frequencySort(int[] nums) {

        int[] ans = new int[nums.length];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i != nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i]) + 1);
            }
        }
        Map<Integer, Integer> sortedMap = sortByValueAndKey(map);
        for(int j = 0; j != nums.length;j++){
            for (Integer key : sortedMap.keySet()) {
                Integer value = sortedMap.get(key);
                if (value > 0) {
                    ans[j] = key;
                    sortedMap.put(key, value - 1);
                    break;
                }
            }
        }  
        return ans;
    }
    @Test
    public void testFrequencySort(){
        int[] nums = {1,1,2,2,2,3};
        int[] result = {3,1,1,2,2,2};
        assertArrayEquals(result, $1636.frequencySort(nums));
    }
    @Test
    public void testFrequencySort2(){
        int[] nums = {-1,1,-6,4,5,-6,1,4,1};
        int[] result = {5,-1,4,4,-6,-6,1,1,1};
        assertArrayEquals(result, $1636.frequencySort(nums));
    }
}
