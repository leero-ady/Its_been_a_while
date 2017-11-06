class Solution {
    public boolean isBalanced(TreeNode root) {
        
        if(root==null)
            return true;
        if(root.left==null && root.right ==null)
            return true;
        
        return (-1<=maxDepth(root.left)-maxDepth(root.right) &&  maxDepth(root.left)-maxDepth(root.right)<=1)&&isBalanced(root.left) &&isBalanced(root.right);
    }
    
    public int maxDepth(TreeNode root) {
        
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return 1;
        else
            return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
        
        
        
    }
}
