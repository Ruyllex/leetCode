
import static org.junit.Assert.assertArrayEquals;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
/*
Intersection of Two Arrays

Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must be unique and you may return the result in any order.
*/


public class $349  {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>(); 
        for(int i : nums1){
            for(int j : nums2){
                if(i == j){
                    set.add(i);
                }
            }
        }
        int k = 0;
        int[] ans = new int[set.size()];
        for(Integer x : set){
            ans[k] = x;
            k++;
            }
        return ans;
        }
         
    @Test
    public void testItersection(){
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] ans = {2};
        assertArrayEquals(ans,$349.intersection(nums1, nums2));
    }
    @Test
    public void testItersection2(){
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] ans = {4,9};
        assertArrayEquals(ans,$349.intersection(nums1, nums2));
    }

}
