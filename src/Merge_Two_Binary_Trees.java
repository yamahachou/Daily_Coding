/**
 * Created by yamahachou on 2018/11/21.
 */
public class Merge_Two_Binary_Trees {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }

    public static TreeNode merge(TreeNode head, TreeNode t1, TreeNode t2){

        if(t1 == null && t2 == null){
            return null;
        }

        if(t1 == null){
            return new TreeNode(t2.val);
        }
        if(t2 == null){
            return new TreeNode(t1.val);
        }
        if(t1 != null && t2 != null) {
            return new TreeNode(t1.val + t2.val);
        }

        head.left = mergeTrees(t1.left, t2.left);
        head.right = mergeTrees(t1.right, t2.right);
        return head;
    }

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2){
        if(t1 == null){
            return t2;
        }
        if(t2 == null){
            return t1;
        }

        t1.val += t2.val;

        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);

        return t1;

    }
    public static void main(String[] avg){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(7);
        root.right = new TreeNode(8);

        TreeNode root1 = new TreeNode(5);
        root1.left = new TreeNode(6);
        TreeNode res = mergeTrees(root, root1);
        System.out.println(res.val);

    }
}
