import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;
/*
Relative Sort Array

Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. 
Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.
*/

public class $1122 {
    public static boolean check(int[] x, int n){
        for(int i = 0; i != x.length; i++){
            if(n == x[i]){
                return true;
            }
        }
        return false;
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int count = 0;
        int[] ans = new int[arr1.length];
        for(int i = 0; i != arr2.length; i++){
            int temp = arr2[i];
            for(int j = 0; j != arr1.length; j++){
                if(arr1[j] == temp){
                    ans[count] = temp;
                    count++;
                }
            }   
        }
        int x = 0;
        int[] notInArr2 = new int[arr1.length - count]; 
        for(int j = 0; j != arr1.length; j++){
            int temp = arr1[j];
            if(!check(arr2, temp)){
                notInArr2[x] = temp;
                x++;
            }
        }
        Arrays.sort(notInArr2);
        for(int k = 0; k != notInArr2.length; k++){
            ans[count] = notInArr2[k];
            count++;
        }
        return ans;
    }
    @Test
    public void testRelativeSortArray(){
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        int[] ans = {2,2,2,1,4,3,3,9,6,7,19};
        assertArrayEquals(ans, $1122.relativeSortArray(arr1,arr2));
    }
    @Test
    public void testRelativeSortArray2(){
        int[] arr1 = {28,6,22,8,44,17};
        int[] arr2 = {22,28,8,6};
        int[] ans = {22,28,8,6,17,44};
        assertArrayEquals(ans, $1122.relativeSortArray(arr1,arr2));
    }
    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("$1122");
    }

}