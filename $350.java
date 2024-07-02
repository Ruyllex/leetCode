import static org.junit.Assert.assertArrayEquals;
import java.util.ArrayList;
import org.junit.Test;

/*
Intersection of Two Arrays II

Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
*/
public class $350  {
    public int[] intersect(int[] nums1, int[] nums2) {
        int large;
        ArrayList<Integer> ans = new ArrayList<>();
        if(nums1.length < nums2.length){
            large = nums1.length;
            for(int i = 0; i != large;i++){
                for(int j = 0; j != nums2.length;j++){
                    if(nums1[i] == nums2[j]){
                        ans.add(nums1[i]);
                        nums2[j] = -1;
                        j = nums2.length - 1;
                    }
                }
            }
        }
        else{
            large = nums2.length;
            for(int i = 0; i != large;i++){
                for(int j = 0; j != nums1.length;j++){
                    if(nums1[j] == nums2[i]){
                        ans.add(nums2[i]);
                        nums1[j] = - 1;
                        j = nums1.length - 1;
                    }
                }
            }
        }
        int[] result = new int[ans.size()];
        int index = 0;
        for(int i : ans){
            result[index] = i;
            index++;
            }
        return result;
    }
    @Test
    public void testIntersect(){
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] result = intersect(nums1, nums2);
        int[] ans = {2,2};
        assertArrayEquals(result, ans);
    }
    @Test
    public void testIntersect2(){
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] result = intersect(nums1, nums2);
        int[] ans = {4,9};
        assertArrayEquals(result, ans);
    }
}
