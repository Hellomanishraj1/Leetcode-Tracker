class Solution {
 public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch: s.toCharArray()) {
            if (map.containsKey(ch)) {
                int freq = map.get(ch);
                map.put(ch, freq + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int freq = map.get(ch);

            if (freq == 1) {
                return i;
            }
        }

        return -1;
    }

}