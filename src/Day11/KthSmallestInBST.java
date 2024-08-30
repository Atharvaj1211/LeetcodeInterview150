package Day11;

public class KthSmallestInBST {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    // LeetCode 230 : Kth Smallest Element in Binary Search Tree
    //https://leetcode.com/problems/kth-smallest-element-in-a-bst/?envType=study-plan-v2&envId=top-interview-150
    int count=0;
    public int kthSmallest(TreeNode root, int k) {
        return helper(root,k).val;
    }
    public TreeNode helper(TreeNode root,int k){
        if(root==null) return null;

        TreeNode left = helper(root.left,k);
        if(left!=null){
            return left;
        }
        count++;
        if(count==k){
            return root;
        }
        return helper(root.right,k);
    }
}
