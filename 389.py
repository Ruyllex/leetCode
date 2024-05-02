import collections

'''
Find the Difference

You are given two strings s and t.
String t is generated by random shuffling string s and then add one more letter at a random position.
Return the letter that was added to t.
'''

def fillDic(s):
    ans = {}
    for i in s:
        if(i not in ans):
            ans[i] = 0
        else:
            ans[i] += 1
    return ans

class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        sDic = collections.OrderedDict(sorted(fillDic(s).items()))
        tDic = collections.OrderedDict(sorted(fillDic(t).items()))
        for key, value in tDic.items():
            if key not in sDic:
                return key
            if sDic[key] != value:
                return key
            

print(Solution.findTheDifference(Solution, "abcd","abcde"))
    


        