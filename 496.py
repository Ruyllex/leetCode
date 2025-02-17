from typing import List
import unittest

"""
Next Greater Element I

The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.
You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. 
If there is no next greater element, then the answer for this query is -1.
Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.        
"""


class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        stack = []
        next_greater = {}
        for num in nums2:
            while stack and stack[-1] < num:
                next_greater[stack.pop()] = num
                stack.append(num)
        while stack:
            next_greater[stack.pop()] = -1
        return [next_greater.get(num, -1) for num in nums1]


class TestNextGreaterElement(unittest.TestCase):
    def test_example_1(self):
        nums1 = [4, 1, 2]
        nums2 = [1, 3, 4, 2]
        expected = [-1, 3, -1]
        self.assertEqual(Solution().nextGreaterElement(nums1, nums2), expected)

    def test_example_2(self):
        nums1 = [2, 4]
        nums2 = [1, 2, 3, 4]
        expected = [3, -1]
        self.assertEqual(Solution().nextGreaterElement(nums1, nums2), expected)

    def test_empty_nums1(self):
        nums1 = []
        nums2 = [1, 2, 3]
        expected = []
        self.assertEqual(Solution().nextGreaterElement(nums1, nums2), expected)

    def test_single_element(self):
        nums1 = [1]
        nums2 = [1]
        expected = [-1]
        self.assertEqual(Solution().nextGreaterElement(nums1, nums2), expected)

    def test_no_greater_elements(self):
        nums1 = [5, 6]
        nums2 = [1, 2, 3, 4, 5, 6]
        expected = [-1, -1]
        self.assertEqual(Solution().nextGreaterElement(nums1, nums2), expected)


if __name__ == "__main__":
    unittest.main()
