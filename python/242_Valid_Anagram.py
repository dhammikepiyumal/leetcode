# Solution 01

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        
        sorted_s = sorted(s)
        sorted_t = sorted(t)
        
        if (sorted_s == sorted_t):
            return True
        
        return False

# Solution 02

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        return Counter(s) == Counter(t)

# Solution 03

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
       
        if (len(s) != len(t)):
            return False
        
        count_s, count_t = {}, {}
        
        for i in range(len(s)):
            count_s[s[i]] = 1 + count_s.get(s[i], 0)
            count_t[t[i]] = 1 + count_t.get(t[i], 0)
            
        for j in count_s:
            if (count_s[j] != count_t.get(j, 0)):
                return False
            
        return True