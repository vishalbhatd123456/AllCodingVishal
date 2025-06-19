class Solution
{
    public int rangeSumBST(TreeNode root, int low, int high)
    {
        if(root == null) return 0;

        if(root.value > high)
        {
            return rangeSumBST(root.left, low, high);
        }
        if(root.value < low)
        {
            return rangeSumBST(root.right, low, high);
        }
        //inclusive ranges
        return root.value + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
}