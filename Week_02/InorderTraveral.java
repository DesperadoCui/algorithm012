/**
 * 二叉树的中序遍历
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 */
class Solution {
    public List<Integer> inordertraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        travel(root, res);
        return res;
    }

    public void travel(TreeNode root, List<Integer> res) {
        if (root != null) {
            if (root.left != null) {
                travel(root.left, res);
            }
            res.add(root.val);
            if (root.right != null) {
                travel(root.right, res);
            }
        }
    }
}