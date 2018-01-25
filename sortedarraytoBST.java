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
    int[] myArray = {};

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length ==0)
            return null;
        
        int low =0,high = nums.length-1;
        
        myArray = nums;
        return arrayToBST(low,high);
    }
    
    public TreeNode arrayToBST(int low, int high){
        int mid = (low+high)/2;
        if(low==high)
            return new TreeNode(myArray[low]);
        if(mid ==low){
            TreeNode root = new TreeNode(myArray[high]);
            root.left = new TreeNode(myArray[low]);
            root.right = null;
            return root;
        }
        TreeNode root = new TreeNode(myArray[mid]);
        root.left = arrayToBST(low,mid-1);
        root.right = arrayToBST(mid+1,high);
        return root; 
    }
    
    
    
}
