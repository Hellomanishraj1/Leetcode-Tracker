class Solution {
    public int lengthOfLongestSubstring(String s) {
          int left = 0, right = 0, max = 0;
        HashSet<Character> hashSet = new HashSet<>();
        while (right < s.length()) {
            if (!hashSet.contains(s.charAt(right))) {
                hashSet.add(s.charAt(right));
                right++;
                max = Math.max(hashSet.size(), max);
            } else {
                hashSet.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}