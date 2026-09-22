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
    public boolean isBalanced(TreeNode root) {
        boolean tof[] = new boolean[1];
        tof[0] = true;
        getHeight(root, tof);
        return tof[0];
    }

    private int getHeight(TreeNode root, boolean tof[]) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left, tof);
        int rightHeight = getHeight(root.right, tof);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            tof[0] = false;
        } 
    
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
