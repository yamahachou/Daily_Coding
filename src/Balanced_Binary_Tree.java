/**
 * Created by yamahachou on 2018/11/21.
 */
public class Balanced_Binary_Tree {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }

    public static boolean result = true;

    public static int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        if(Math.abs(left - right)>1){
            result = false;
        }
        return Math.max(left, right) + 1;
    }

    public static boolean isBalanced(TreeNode root){
        maxDepth(root);
        return result;
    }

    public static void main(String[] avg){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(7);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(13);
        root.left.right = new TreeNode(12);
//        root.right.left = new TreeNode(9);
//        root.right.right = new TreeNode(10);
        System.out.println(isBalanced(root));
    }
}
