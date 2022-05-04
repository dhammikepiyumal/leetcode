# Solution 01

class Solution:
    def isPalindrome(self, s: str) -> bool:
        new_string = ""
        
        for c in s:
            if c.isalnum():
                new_string += c.lower()
                
        return new_string == new_string[::-1]
        
# Solution 02

class Solution:
    def isPalindrome(self, s: str) -> bool:
        left, right = 0, len(s) - 1
        
        while left < right:
            while left < right and not self.alphanumeric(s[left]):
                left += 1
            while left < right and not self.alphanumeric(s[right]):
                right -= 1
                
            if s[right].lower() != s[left].lower():
                return False
            
            right -= 1
            left += 1
            
        return True
        
    def alphanumeric(self, c) -> chr:
        return(ord('A') <= ord(c) <= ord('Z') or 
              ord('a') <= ord(c) <= ord('z') or
              ord('0') <= ord(c) <= ord('9'))
        