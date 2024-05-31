import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

/*
Find Common Elements Between Two Arrays

You are given two integer arrays nums1 and nums2 of sizes n and m, respectively. Calculate the following values:

    answer1 : the number of indices i such that nums1[i] exists in nums2.
    answer2 : the number of indices i such that nums2[i] exists in nums1.

Return [answer1,answer2].
*/

public class $2956{
    public static boolean ifExists(int[] nums, int i){
        for(int j=0; j<nums.length; j++){
            if(nums[j] == i){
                return true;
            }
        }
        return false;
    }
    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] ans = new int[2];
        int count1 = 0, count2 = 0;
        for(int i = 0;i != nums1.length;i++){
            if( ifExists(nums2, nums1[i]) ){
                count1++;
                }
            }
        for(int i = 0;i != nums2.length;i++){
            if( ifExists(nums1, nums2[i]) ){
                count2++;
                }
            }
        ans[0] = count1;
        ans[1] = count2;
        return ans;
    }
                
    @Test
    public void testFindIntersectionValues() {
        int[] nums1 = {2,3,2};
        int[] nums2 = {1,2};
        int[] ans = {2,1};
        assertArrayEquals(ans, $2956.findIntersectionValues(nums1, nums2));
    }
    @Test
    public void testFindIntersectionValues2() {
        int[] nums1 = {4,3,2,3,1};
        int[] nums2 = {2,2,5,2,3,6};
        int[] ans = {3,4};
        assertArrayEquals(ans, $2956.findIntersectionValues(nums1, nums2));
    }
    @Test
    public void testFindIntersectionValues3() {
        int[] nums1 = {3,4,2,3};
        int[] nums2 = {1,5};
        int[] ans = {0,0};
        assertArrayEquals(ans, $2956.findIntersectionValues(nums1, nums2));
    }
}
