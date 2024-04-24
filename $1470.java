import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/*
Shuffle the Array

Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].
*/

public class $1470 {
    public static int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        for (int i = n; i < len; i++) {
            nums[i] = (nums[i] << 10) | nums[i - n];
        }
        int index = 0;
        for (int i = n; i < len; i++, index += 2) {
            nums[index] = nums[i] & 1023;
            nums[index + 1] = nums[i] >>> 10;
        }
        return nums;
    }

    @Test
    public void testShuffle() {
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        int[] ans = { 2, 3, 5, 4, 1, 7 };
        assertArrayEquals(ans, $1470.shuffle(nums, n));
    }

    @Test
    public void testShuffle2() {
        int[] nums = { 1, 2, 3, 4, 4, 3, 2, 1 };
        int n = 4;
        int[] ans = { 1, 4, 2, 3, 3, 2, 4, 1 };
        assertArrayEquals(ans, $1470.shuffle(nums, n));
    }

    @Test
    public void testShuffle3() {
        int[] nums = { 1, 1, 2, 2 };
        int n = 2;
        int[] ans = { 1, 2, 1, 2 };
        assertArrayEquals(ans, $1470.shuffle(nums, n));
    }

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("$1470");
    }
}
