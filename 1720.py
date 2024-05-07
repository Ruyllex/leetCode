from typing import List
import doctest

'''
Decode XORed Array

There is a hidden integer array arr that consists of n non-negative integers.
It was encoded into another integer array encoded of length n - 1, such that encoded[i] = arr[i] XOR arr[i + 1]. 
For example, if arr = [1,0,2,1], then encoded = [1,2,3].
You are given the encoded array. You are also given an integer first, that is the first element of arr, i.e. arr[0].
Return the original array arr. It can be proved that the answer exists and is unique.
'''
class Solution:
    def decode(self, encoded: List[int], first: int) -> List[int]:
        """
        >>> encoded = [1,2,3]
        >>> first = 1
        >>> Solution().decode(encoded, first)
        [1, 0, 2, 1]
        >>> encoded = [6,2,7,3]
        >>> first = 4
        >>> Solution().decode(encoded, first)
        [4, 2, 0, 7, 4]
        """
        res = [first]
        for num in encoded:
            res.append(res[-1] ^ num)
        return res

if __name__ == '__main__':
    doctest.testmod()