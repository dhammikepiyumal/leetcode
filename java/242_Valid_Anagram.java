import java.util.Arrays;

// Solution 01

class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] tempArrayOne = s.toCharArray();
        char[] tempArrayTwo = t.toCharArray();
        
        Arrays.sort(tempArrayOne);
        Arrays.sort(tempArrayTwo);
        
        String sortedS = new String(tempArrayOne);
        String sortedT = new String(tempArrayTwo);
        
        if(sortedS.equals(sortedT)) {
            return true;
        }
            
        return false;
    }
}

// Solution 02

class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) {
            return false;
        }
        
        if (s.equals(t)) {
            return true;
        }
        
        Map<Character, Integer> sHashMap = new HashMap<>();
        Map<Character, Integer> tHashMap = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            sHashMap.merge(s.charAt(i), 1, Integer::sum);
            tHashMap.merge(t.charAt(i), 1, Integer::sum);
        }
        
        for (Character i : sHashMap.keySet()) {
            if(!sHashMap.get(i).equals(tHashMap.get(i))) {
                return false;
            }
        }
        
        return true;
    }
}