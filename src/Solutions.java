public class Solutions {

    /* Problem 104. Maximum Depth of Binary Tree  #Easy#
     * https://leetcode.com/problems/maximum-depth-of-binary-tree/
     *  Problem description:
     *  Given the root of a binary tree, return its maximum depth.
     *  A binary tree's maximum depth is the number of nodes along the longest path from
     *  the root node down to the farthest leaf node.
     */

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    /* Problem 559. Maximum Depth of N-ary Tree  #Easy#
     * https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
     *  Problem description:
     *  Given a n-ary tree, find its maximum depth.
     *  The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
     *  Nary-Tree input serialization is represented in their level order traversal, each group of children is separated
     *  by the null value (See examples).
     */

    public int maxDepth(Node root) {
        if (root == null) return 0;
        int maxDepth = 0;
        for (int i = 0; i < root.children.size(); i++) {
            int currentDepth = maxDepth(root.children.get(i));
            if (currentDepth > maxDepth) {
                maxDepth = currentDepth;
            }
        }
        return maxDepth + 1;
    }

    /* Problem 111. Minimum Depth of Binary Tree  #Easy#
     * https://leetcode.com/problems/minimum-depth-of-binary-tree/
     *  Problem description:
     *  Given a binary tree, find its minimum depth.
     *  The minimum depth is the number of nodes along the shortest path from the root node down
     *  to the nearest leaf node.
     *  Note: A leaf is a node with no children.
     */

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        if (leftDepth == 0 || rightDepth == 0) {
            return Math.max(leftDepth, rightDepth) + 1;
        } else {
            return Math.min(leftDepth, rightDepth) + 1;
        }
    }
}
