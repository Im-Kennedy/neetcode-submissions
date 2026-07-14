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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();//list to return
        if(root == null){//edge case check
            return output;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);//add first root node

        while(!queue.isEmpty()){
            int length = queue.size();
            List<Integer> level_list = new ArrayList<>();
            for(int i = 0; i < length; i++){
                TreeNode node = queue.poll();//get queue node
                level_list.add(node.val);
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            output.add(level_list);
        }
        return output;
    }
}
