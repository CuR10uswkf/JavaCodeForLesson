package pers.wkf.week13;

/**
 * @Description
 * @ClassName TreeNode
 * @Author WKF
 * @Date 2020.11.25 13:57
 */
public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public int val;
    public TreeNode(){}
    public TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public static TreeNode updateToTree(Integer[] nums){
        TreeNode root = createTreeNode(nums, 1);
        return root;
    }
    public static TreeNode createTreeNode(Integer[] nums, int index){
        if (index <= nums.length){
            Integer value = nums[index-1];
            if (value != null){
                TreeNode treenode = new TreeNode(value);
                treenode.left = createTreeNode(nums, index*2);
                treenode.right = createTreeNode(nums, index*2+1);
                return treenode;
            }
        }
        return null;
    }
}