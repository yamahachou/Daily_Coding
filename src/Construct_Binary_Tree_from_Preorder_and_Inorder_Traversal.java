import java.util.HashMap;
import java.util.Map;
/**
 * Created by yamahachou on 2018/11/19.
 */
public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }

    public static TreeNode build(int[] preorder, int PreStart, int PreEnd, int[] inorder, int InStart, int InEnd, Map<Integer, Integer> map){
        if(PreStart>PreEnd || InStart > InEnd){
            return null;
        }
        TreeNode root = new TreeNode(preorder[PreStart]);
        int middle = map.get(preorder[PreStart]);
        root.left = build(preorder, PreStart+1, PreStart+middle-InStart, inorder, InStart, middle-1, map);
        root.right = build(preorder, PreStart+middle-InStart-1, PreEnd, inorder, middle+1, InEnd, map);
        return root;

    }

    public static TreeNode buildTree(int[] preorder, int[] inorder){
        Map<Integer, Integer> hashmap = new HashMap<>();
        for(int i = 0 ; i<inorder.length; i++){
            hashmap.put(inorder[i], i);
        }
        return build(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1, hashmap);
    }
}
