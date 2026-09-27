class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(map1.containsKey(ch)){
                int freq=map1.get(ch);
                map1.put(ch,freq+1);
            }
            else map1.put(ch,1);
        }
        for(int i=0;i<t.length();i++){
            char ch =t.charAt(i);
            if(map2.containsKey(ch)){
                int freq=map2.get(ch);
                map2.put(ch,freq+1);
            }
            else map2.put(ch,1);
        }
        for(char ch: map2.keySet()){
            if(!map1.containsKey(ch)){
                return false;
            }
            int freq2=map2.get(ch);
            int freq1=map1.get(ch);
            if(freq1!=freq2){
                return false;
            }
        }
        return true;

    }
}