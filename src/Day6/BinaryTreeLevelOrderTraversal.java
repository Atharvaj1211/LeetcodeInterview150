package Day6;

import java.util.ArrayList;
import java.util.*;

public class BinaryTreeLevelOrderTraversal {
    // LeetCode 102: Binary Tree Level order Traversal
    // https://leetcode.com/problems/binary-tree-level-order-traversal/description/?envType=study-plan-v2&envId=top-interview-150
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

    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();
            if(root==null){
                return result;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while(!queue.isEmpty()){
                int levelSize = queue.size();
                List<Integer> currentLevel = new ArrayList<>(levelSize);
                for(int i=0;i<levelSize;i++){
                    TreeNode currentNode = queue.poll();
                    currentLevel.add(currentNode.val);
                    if(currentNode.left!=null){
                        queue.offer(currentNode.left);
                    }
                    if(currentNode.right!=null){
                        queue.offer(currentNode.right);
                    }
                }
                result.add(currentLevel);
            }
            return result;
        }
    }
}
