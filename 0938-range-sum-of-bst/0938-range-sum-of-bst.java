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
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }

        int sum = 0;

        // If the current node's value is within the range, add it to the sum
        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }

        // If the current node's value is greater than the low bound, explore the left subtree
        if (root.val > low) {
            sum += rangeSumBST(root.left, low, high);
        }

        // If the current node's value is less than the high bound, explore the right subtree
        if (root.val < high) {
            sum += rangeSumBST(root.right, low, high);
        }

        return sum;
    }
}