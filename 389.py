import collections

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
    


        