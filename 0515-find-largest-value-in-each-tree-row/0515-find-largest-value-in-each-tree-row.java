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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
               int max=Integer.MIN_VALUE;
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode CurrentNode =queue.poll();
                if(CurrentNode.val>max){
                    max=CurrentNode.val;
                }
                // insert left and right
                if(CurrentNode.left!=null){
                queue.offer(CurrentNode.left);
                }
                 if(CurrentNode.right!=null){
                queue.offer(CurrentNode.right);
                }
            }
            list.add(max);
        }
        return list;
    }
}