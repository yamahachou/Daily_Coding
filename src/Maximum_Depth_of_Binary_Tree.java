/**
 * Created by yamahachou on 2018/11/19.
 */
public class Maximum_Depth_of_Binary_Tree {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right)+1;
    }

    public static void main(String[] avg){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(7);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(13);
        root.left.right = new TreeNode(12);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(10);
        System.out.println(maxDepth(root));
    }
}
