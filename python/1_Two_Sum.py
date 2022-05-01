# Solution 01

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        indices = []
        
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if (nums[i] + nums[j] == target):
                    indices.append(i)
                    indices.append(j)
                    
                    return indices

# Solution 02

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        hashMap = {}
    
        for i, n in enumerate(nums):
            
            difference = target - n
            
            if difference in hashMap:
                return [hashMap[difference], i]
            
            hashMap[n] = i
            
        return
        