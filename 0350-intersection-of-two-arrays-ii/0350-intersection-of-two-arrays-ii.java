class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int ele : nums1){
            if(map1.containsKey(ele)){
                int freq=map1.get(ele);
                map1.put(ele,freq+1);
            }
            else map1.put(ele,1);
        }
        for(int ele : nums2){
            if(map2.containsKey(ele)){
                int freq=map2.get(ele);
                map2.put(ele,freq+1);
            }
            else map2.put(ele,1);
        }
        for(int ele:map1.keySet()){
            if(map2.containsKey(ele)){
                int freq1=map1.get(ele);
                int freq2=map2.get(ele);
                int ans =Math.min(freq1,freq2);
                for(int i=1;i<=ans;i++){
                     list.add(ele);
                }
            }
        }
        int [] ans =new int [list.size()];
        for(int i=0;i< list.size();i++){
            ans [i]= list.get(i);
        }
        return ans ;
        
    }
}