// Solution 01

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] indices = {0, 0};
            
        for(int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }
        
        return indices;
    }
}

// Solution 02

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            
            if (hashMap.containsKey(nums[i])) {
                return new int[]{hashMap.get(nums[i]), i};
            }
            
            hashMap.put(target - nums[i], i);
        }
        
        return new int[0];
    }
}