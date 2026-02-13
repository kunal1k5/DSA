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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        
        Queue<TreeNode> nodes = new LinkedList<>();
        Queue<Integer> sums = new LinkedList<>();
        
        nodes.add(root);
        sums.add(root.val);
        
        while (!nodes.isEmpty()) {
            TreeNode node = nodes.poll();
            int sum = sums.poll();
            
            // Check leaf
            if (node.left == null && node.right == null && sum == targetSum) {
                return true;
            }
            
            if (node.left != null) {
                nodes.add(node.left);
                sums.add(sum + node.left.val);
            }
            if (node.right != null) {
                nodes.add(node.right);
                sums.add(sum + node.right.val);
            }
        }
        
        return false;
    }
}