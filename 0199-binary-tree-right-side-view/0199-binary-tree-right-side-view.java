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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        // i will traverse entire traversal and i have to just add last node val in my list
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode CurrentNode=queue.poll();
                if(i==size-1){
                    list.add(CurrentNode.val);
                }
                // add left and right node in the queue
                if(CurrentNode.left!=null){
                    queue.offer(CurrentNode.left);
                }
                if(CurrentNode.right!=null){
                    queue.offer(CurrentNode.right);
                }
            }
        }
        return list;
    }
}