import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
/*
Count Common Words With One Occurrence

Given two string arrays words1 and words2, return the number of strings that appear exactly once in each of the two arrays.
*/

public class $2085 {
        public static String[] removeAllDuplicates(String[] arr) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String str : arr) {
            countMap.put(str, countMap.getOrDefault(str, 0) + 1);
        }
        List<String> uniqueList = new ArrayList<>();
        for (String str : arr) {
            if (countMap.get(str) == 1) {
                uniqueList.add(str);
            }
        }
        String[] result = new String[uniqueList.size()];
        return uniqueList.toArray(result);
    }
    public static int countWords(String[] words1, String[] words2) {
        int ans = 0;
        String[] uniqueWords1 = removeAllDuplicates(words1);
        String[] uniqueWords2 = removeAllDuplicates(words2);
        for(String word1: uniqueWords1){
            int count = 0;
            for(String word2: uniqueWords2){
                if(word1.equals(word2)){
                    count++;
                }
            }
            if(count == 1){
                ans++;
            }
        }
        return ans;
    }
    @Test
    public void testCountWords(){
        String[] words1 = {"leetcode","is","amazing","as","is"};
        String[] words2 = {"amazing","leetcode","is"};
        int ans = 2;
        assertEquals(ans, $2085.countWords(words1,words2));
    }
    @Test
    public void testCountWords2(){
        String[] words1 = {"b","bb","bbb"};
        String[] words2 = {"a","aa","aaa"};
        int ans = 0;
        assertEquals(ans, $2085.countWords(words1,words2));
    }
    @Test
    public void testCountWords3(){
        String[] words1 = {"a","ab"};
        String[] words2 = {"a","a","a","ab"};
        int ans = 1;
        assertEquals(ans, $2085.countWords(words1,words2));
    }
}
