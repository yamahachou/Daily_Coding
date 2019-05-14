/**
 * Created by yamahachou on 2018/11/19.
 */
public class Minimum_Depth_of_Binary_Tree {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }

    public static int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        int min_depth = Integer.MAX_VALUE;

        if(root.left!=null){
            min_depth = Math.min(minDepth(root.left), min_depth);
        }
        if(root.right!=null){
            min_depth = Math.min(minDepth(root.right), min_depth);
        }
        return min_depth+1;
    }
    public static void main(String[] avg){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(7);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(13);
        root.left.right = new TreeNode(12);
//        root.right.left = new TreeNode(9);
//        root.right.right = new TreeNode(10);
        System.out.println(minDepth(root));
    }
}
