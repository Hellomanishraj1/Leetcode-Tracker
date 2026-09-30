class Solution {
    public int mostFrequentEven(int[] nums) {
     HashMap<Integer,Integer> map=new HashMap<>();
     int ans =-1;
     int max_freq=0;
     for(int ele:nums){
        if(map.containsKey(ele)){
            int freq=map.get(ele);
            map.put(ele,freq+1);
        }
        else map.put(ele,1);
     }
     for(int ele:map.keySet()){
        if(ele%2==0){
            int freq=map.get(ele);
            if(freq==max_freq){
                if(ans>ele){
                    ans =ele;
                }
            }
            if(freq>max_freq){
                ans =ele;
                max_freq=freq;
            }
        }
     }    
     return ans ;
    }
}