'''
Assign Cookies

Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.
Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with; 
and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content. 
Your goal is to maximize the number of your content children and output the maximum number.
'''


def findContentChildren(g, s):
    g.sort()
    s.sort()
    child_i = 0
    cookie_i = 0

    while child_i < len(g) and cookie_i < len(s):
        if s[cookie_i] >= g[child_i]:
            child_i += 1
        cookie_i += 1

    return child_i

# Example usage:
g = [1, 2, 3]
s = [1, 1]
print(findContentChildren(g, s))  # Output: 1

g = [1, 2]
s = [1, 2, 3]
print(findContentChildren(g, s))  # Output: 2