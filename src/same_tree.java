/**
 * Created by yamahachou on 2018/11/18.
 */
public class same_tree {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        return p.val == q.val && isSameTree(p.right, q.right) && isSameTree(p.left, q.left);

    }

    public static void main(String[] avg){

        TreeNode p = new TreeNode(1);
        TreeNode q = null;
        isSameTree(p,q);


    }
}
