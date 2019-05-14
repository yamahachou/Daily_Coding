/**
 * Created by yamahachou on 2018/11/21.
 */

import java.util.ArrayList;
import java.util.List;

public class Path_Sum_II {

    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }

    public static void helper(TreeNode root, int sum, List<List<Integer>> res, List<Integer> cur){
        if(root == null){
            return;
        }
        cur.add(root.val);

        if(root.left == null && root.right == null){
            if(root.val == sum){
                //Why in here we need to use res.add(new ArrayList<>(cur))??
                //Because Java is call by value, so when you need to adjust cur, it would directly affect the value in
                //the res's cur
                res.add(new ArrayList<>(cur));
            }
            cur.remove(cur.size()-1);
            return;
        }

        helper(root.left, sum-root.val, res, cur);
        helper(root.right, sum-root.val, res, cur);

        cur.remove(cur.size()-1);


    }
    public static List<List<Integer>> pathSum(TreeNode root, int sum){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        helper(root, sum, res, cur);
        return res;
    }

    public static void main(String[] avg){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);

        System.out.println(pathSum(root, 22));
    }
}
