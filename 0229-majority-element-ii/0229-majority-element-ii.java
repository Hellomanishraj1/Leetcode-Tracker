class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int n=nums.length/3;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele:nums){
            if(map.containsKey(ele)){
                int freq=map.get(ele);
                map.put(ele,freq+1);
            }
            else map.put(ele,1);
        }
        for(int ele:map.keySet()){
            int freq=map.get(ele);
            if(freq>n){
                list.add(ele);
            }
        }
        return list;
    }  
}