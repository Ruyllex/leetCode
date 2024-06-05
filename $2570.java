import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/*
Merge Two 2D Arrays by Summing Values

You are given two 2D integer arrays nums1 and nums2.

    nums1[i] = [idi, vali] indicate that the number with the id idi has a value equal to vali.
    nums2[i] = [idi, vali] indicate that the number with the id idi has a value equal to vali.

Each array contains unique ids and is sorted in ascending order by id.
Merge the two arrays into one array that is sorted in ascending order by id, respecting the following conditions:

    Only ids that appear in at least one of the two arrays should be included in the resulting array.
    Each id should be included only once and its value should be the sum of the values of this id in the two arrays. 
    If the id does not exist in one of the two arrays then its value in that array is considered to be 0.

Return the resulting array. The returned array must be sorted in ascending order by id.
 */



public class $2570  {
    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;
        while (index1 < nums1.length && index2 < nums2.length) {
            int[] arr1 = nums1[index1];
            int[] arr2 = nums2[index2];
            if (arr1[0] < arr2[0]) {
                ans.add(List.of(arr1[0], arr1[1]));
                index1++;
            } else if (arr1[0] > arr2[0]) {
                ans.add(List.of(arr2[0], arr2[1]));
                index2++;
            } else { 
                ans.add(List.of(arr1[0], arr1[1] + arr2[1]));
                index1++;
                index2++;
            }
        }
    
        while (index1 < nums1.length) {
            ans.add(List.of(nums1[index1][0], nums1[index1][1]));
            index1++;
        }
        
        while (index2 < nums2.length) {
            ans.add(List.of(nums2[index2][0], nums2[index2][1]));
            index2++;
        }
        int[][] result = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            result[i][0] = ans.get(i).get(0);
            result[i][1] = ans.get(i).get(1);
        }
        return result;
    }
    @Test
    public void testMergeArrays(){
        int[][]nums1 = {{1,2},{2,3},{4,5}};
        int[][]nums2 = {{1,4},{3,2},{4,1}};
        int[][] ans = {{1,6},{2,3},{3,2},{4,6}};
        assertArrayEquals(ans, $2570.mergeArrays(nums1,nums2));
    }
    @Test
    public void testMergeArrays2(){
        int[][]nums1 = {{2,4},{3,6},{5,5}};
        int[][]nums2 = {{1,3},{4,3}};
        int[][] ans = {{1,3},{2,4},{3,6},{4,3},{5,5}};
        assertArrayEquals(ans, $2570.mergeArrays(nums1,nums2));
    }

}
