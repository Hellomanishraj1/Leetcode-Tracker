/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
     List<Double> list=new ArrayList<>();
     Queue<TreeNode> queue=new LinkedList<>();
     queue.offer(root);
     while(!queue.isEmpty()){
        double avg=0;
        double sum=0;
        int size=queue.size();
        for(int i=0;i<size;i++){
            TreeNode CurrentNode =queue.poll();
            sum=sum+CurrentNode.val;
            // insert left and right
            if(CurrentNode.left!=null){
                queue.offer(CurrentNode.left);
            }
             if(CurrentNode.right!=null){
                queue.offer(CurrentNode.right);
            }
        }
        avg=sum/size;
        list.add(avg);

     }   
     return list;
    }
}