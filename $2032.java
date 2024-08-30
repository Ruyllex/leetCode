import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
/*
Two Out of Three

Given three integer arrays nums1, nums2, and nums3, return a distinct array containing all the values 
that are present in at least two out of the three arrays. 
You may return the values in any order. 
*/

public class $2032 {
        public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        return result;
    }
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> ans = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();      
        for(int i = 0; i != nums1.length; i++){
            if(!set.contains(nums1[i])){
                set.add(nums1[i]);
            }
        }
        nums2 = removeDuplicates(nums2);
        for(int i = 0; i != nums2.length; i++){
            if(!set.contains(nums2[i])){
                set.add(nums2[i]);
            }else{
                if(!ans.contains(nums2[i])){
                    ans.add(nums2[i]);
                }
            }
        }
        nums3 = removeDuplicates(nums3);
        for(int i = 0; i != nums3.length; i++){
            if(!set.contains(nums3[i])){
                set.add(nums3[i]);
            }else{
                if(!ans.contains(nums3[i])){
                    ans.add(nums3[i]);
                }
            }
        }
        return ans;
    }
    @Test
    public void testTwoOutOfTheee() {
        int[] nums1 = {1,1,3,2};
        int[] nums2 = {2,3};
        int[] nums3 = {3};
        List<Integer> ans = List.of(3,2);
        assertEquals(ans,$2032.twoOutOfThree(nums1,nums2,nums3));
        }
    @Test
    public void testTwoOutOfTheee2() {
        int[] nums1 = {3,1};
        int[] nums2 = {2,3};
        int[] nums3 = {1,2};
        List<Integer> ans = List.of(2,3,1);
        assertEquals(ans,$2032.twoOutOfThree(nums1,nums2,nums3));
        }
        @Test
    public void testTwoOutOfTheee3() {
        int[] nums1 = {1,2,2};
        int[] nums2 = {4,3,3};
        int[] nums3 = {5};
        List<Integer> ans = List.of();
        assertEquals(ans,$2032.twoOutOfThree(nums1,nums2,nums3));
        }
    
}
