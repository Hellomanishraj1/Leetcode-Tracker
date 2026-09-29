class Solution {
    public int majorityElement(int[] nums) {
       int n=nums.length;
       int ans =n/2;
       int list=0;
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int ele:nums){
        if(map.containsKey(ele)){
            int freq=map.get(ele);
            map.put(ele,freq+1);
        }
        else{
            map.put(ele,1);
        }      
         } 
         for(int ele:map.keySet()){
            int freq=map.get(ele);
            if(freq>ans){
                list=ele;
            }
         }
         return list;
    }
}