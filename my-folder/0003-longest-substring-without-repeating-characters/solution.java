class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int maxLengthSubString = 0;

        Set<Character> charSet = new HashSet<>();
        int left = 0;

        for (int right = 0; right < len; right++) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                maxLengthSubString = Math.max(maxLengthSubString, right - left + 1);
            } else {
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }
        return maxLengthSubString;        
    }
}
