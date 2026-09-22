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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<Integer> treep = new ArrayList<>();
        ArrayList<Integer> treeq = new ArrayList<>();

        toArrayList(p, treep);
        toArrayList(q, treeq);
        return treep.equals(treeq);
        
    }
    private ArrayList<Integer> toArrayList(TreeNode curr, ArrayList<Integer> list) {
        if(curr == null) {
            list.add(null);
            return null;
        }
        
        list.add(curr.val);
        toArrayList(curr.left, list);
        toArrayList(curr.right, list);

        return list;
    }
}
