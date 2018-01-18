/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int pathSum(TreeNode root, int sum) {
        if(root==null)
            return 0;
       return pathSumFrom(root,sum) + pathSum(root.left,sum) +  pathSum(root.right,sum);
    }
    
    private int pathSumFrom(TreeNode root,int sum){
        
        if(root==null)
            return 0;
        if(root.val-sum==0){
            System.out.println(root.val+" "+sum);
           return 1;
        }
            
        
        return pathSumFrom(root.left,sum-root.val) + pathSumFrom(root.right,sum - root.val);
        
        
    }
}
