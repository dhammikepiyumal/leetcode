# Solution 01

class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        nums.sort()
        
        for i in range(1, len(nums)):
            if (nums[i] == nums[i -1]):
                return True
            
        return False

# Solution 02

class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        hashset = set()
        
        for n in nums:
            if n in hashset:
                return True
            
            hashset.add(n)
            
        return False