/**
 * Created by yamahachou on 2018/11/19.
 */

import java.util.HashMap;
import java.util.Map;
public class ConstrucBinary_Tree_from_Inorder_and_Postorder_Traversal {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }

    }
    public TreeNode build(int[] inorder, int InStart, int InEnd, int[] postorder, int PostStart, int PostEnd, Map<Integer, Integer> hashmap){
        if(InStart>InEnd || PostStart>PostEnd){
            return null;
        }
        TreeNode root = new TreeNode(postorder[PostEnd]);
        int middle = hashmap.get(postorder[PostEnd]);
        root.left = build(inorder, InStart, middle-1, postorder, PostStart, PostStart+middle-InStart-1, hashmap);
        root.right = build(inorder, middle+1, InEnd, postorder, PostStart+middle-InStart, PostEnd-1, hashmap);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder){
        Map<Integer, Integer> hashmap = new HashMap<>();
        for(int i = 0 ; i< inorder.length; i++){
            hashmap.put(inorder[i], i);
        }
        return build(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1, hashmap);
    }
}
