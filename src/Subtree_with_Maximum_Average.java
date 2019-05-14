/**
 * Created by yamahachou on 2019/3/5.
 */
 class ResultType{
    int sum;
    int size;

    ResultType(int sum, int size){
        this.sum = sum;
        this.size = size;
    }
}

 class TreeNode{
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int val) {
         this.val = val;
     }
 }

public class Subtree_with_Maximum_Average {

    private TreeNode subtree = null;
    private ResultType subtreeResult = null;

    public TreeNode findSubTree2(TreeNode root){
        helper(root);
        return subtree;
    }

    private ResultType helper(TreeNode root){

        if(root == null){
            return new ResultType(0,0);
        }

        ResultType left = helper(root.left);
        ResultType right = helper(root.right);
        ResultType result = new ResultType(
                left.sum + right.sum + root.val,
                left.size + right.size + 1);

        if(subtree == null || subtreeResult.sum * result.size < result.sum * subtreeResult.size){
            subtree = root;
            subtreeResult = result;
        }

        return result;
    }

    public static void main(String[] avgs){
        TreeNode root = new TreeNode(180);
        TreeNode left = new TreeNode(130);
        TreeNode right = new TreeNode(150);
        root.left = left;
        root.right = right;
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(10);
        root.right.right = new TreeNode(50);
        Subtree_with_Maximum_Average sb = new Subtree_with_Maximum_Average();
        TreeNode res = sb.findSubTree2(root);
        System.out.println(res.val);

    }

}
