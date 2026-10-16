import java.util.*;
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:stones){
            pq.add(ele);
        }
        while(pq.size()>1){
            int x=pq.remove();
            int y=pq.remove();
            if(x!=y){
                int ans =Math.abs(y-x);
                pq.add(ans);
            }
        }
       if(pq.size()==0){
            return 0;
        }
        return pq.peek();
    }
}