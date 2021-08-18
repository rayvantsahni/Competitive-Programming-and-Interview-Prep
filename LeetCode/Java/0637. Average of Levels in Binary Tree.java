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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        ArrayList<Double> averages = new ArrayList<>();
        double sum;
        int size;
        TreeNode currentNode;
        
        while (!queue.isEmpty()) {
            size = queue.size();
            sum = 0;
            
            for (int i = 0; i < size; i++) {
                currentNode = queue.remove();
                sum += currentNode.val;
                
                if (currentNode.left != null)
                    queue.add(currentNode.left);
                if (currentNode.right != null) 
                    queue.add(currentNode.right);
            }
            averages.add(sum / size);
        }
        
        return averages;
    }
}
