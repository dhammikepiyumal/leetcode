import java.util.Arrays;

// Solution 01

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1]) {
                return true;
            }
        }
        
        return false;
    }
}

// Solution 02

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<Integer>();
        
        for (int number : nums) {
            if (hashSet.contains(number)) {
                return true;
            }
            
            hashSet.add(number);
        }
        
        return false;
    }
}