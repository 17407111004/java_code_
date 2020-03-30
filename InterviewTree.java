package word19;

import java.util.ArrayList;
import java.util.List;

class TreeNode{
    public int val;
   public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class InterviewTree {
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer>result=new ArrayList<>();
        if(root==null){
            return result;
        }
        result.add(root.val);
        result.addAll(preorderTraversal(root.left));
        result.addAll(preorderTraversal(root.right));
        return result;
    }
}
