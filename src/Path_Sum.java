/**
 * Created by yamahachou on 2018/11/21.
 */
public class Path_Sum {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static boolean hasPathSum(TreeNode root, int sum){
        if(root == null){
            return false;
        }
        if(root.val == sum && root.left == null && root.right == null){
            return true;
        }

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    public static void main(String[] avg){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(7);
        root.right = new TreeNode(8);

        System.out.println(hasPathSum(root, 11));

    }
}
