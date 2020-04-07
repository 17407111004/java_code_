package word24;

import java.sql.SQLOutput;
import java.util.*;

class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Interview1Tree {
    //先序遍历放在List中
    public List<Integer>preorderTraversal(TreeNode root){
        List<Integer>result=new ArrayList<>();
        if(root==null){
            //返回空List（元素个数为0，不是null）
            return result;
        }
        //访问根节点，此处的访问操作，把元素add到List中
        result.add(root.val);
        //递归遍历左子树，把左子树的遍历结果加入到List中
        result.addAll(preorderTraversal(root.left));
        //递归遍历右子树，把右子树的遍历结果加入到List中
        result.addAll(preorderTraversal(root.right));
        return result;
    }
    //中序遍历结果放在List中
    public List<Integer>inorderTraversal(TreeNode root){
        List<Integer>result=new ArrayList<>();
        if(root==null){
            return result;
        }
        result.addAll(inorderTraversal(root.left));
        result.add(root.val);
        result.addAll(inorderTraversal(root.right));
        return result;
    }
    //后序遍历；
    public List<Integer>postorderTraveersal(TreeNode root){
        List<Integer>result=new ArrayList<>();
        if(root==null){
            return result;
        }
        result.addAll(inorderTraversal(root.left));
        result.addAll(inorderTraversal(root.right));
        result.add(root.val);
        return result;
    }
    //层序遍历
    public void levelorder(TreeNode root){
        //不能借助递归，要借助一个队列来完成
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode cur=queue.poll();
            //访问元素
            System.out.print(cur.val+" ");
            //把左，右子树入队列
            if(cur.left!=null){
                queue.offer(cur.left);
            }
            if(cur.right!=null){
                queue.offer(cur.right);
            }
        }

    }
    //检查两棵树是否相同
    public boolean isSameTree(TreeNode p,TreeNode q){
        //可以分为四种情况
        //1.p，q都为null
        //2。p为nullq不为null  或者  q为nullp不为null
        //3.p，q都不为null
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        //先判断根节点是否相同
        if(p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
    //判断一棵树是否为另一棵树的子树
    public boolean isSubtree(TreeNode s,TreeNode t){
        if(s==null&&t==null){
            return true;
        }
        if(s==null||t==null){
            return false;
        }
        boolean ret=false;
        if(s.val==t.val){
            //如果根节点的值相同，进一步判断s和t是不是相同的树
            ret=isSameTree(s,t);
        }
        return ret||isSubtree(s.left,t)||isSubtree(s.right,t);
    }
    //求二叉树的最大深度
    public int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        int leftDepth=maxDepth(root.left);
        int rightDepth=maxDepth(root.right);
        return 1+(Math.max(leftDepth,rightDepth));
    }
    //判断一棵二叉树是否为平衡二叉树
    public boolean isBalanxed(TreeNode root){
        if(root==null){
            return true;
        }
        if(root.left==null&&root.right==null){
            return true;
        }
        //看当前节点对应的子树是否平衡
        int leftDepth=maxDepth(root.left);
        int rightDepth=maxDepth(root.right);
        if(leftDepth-rightDepth>1||leftDepth-rightDepth<-1){
            return false;
        }
        return isBalanxed(root.left)&&isBalanxed(root.right);
    }

    //判断一棵树是否为对称二叉树
    public boolean isSymmetric(TreeNode root){
        if(root==null){
            return true;
        }
        return isMirror(root.left,root.right);
    }
    private boolean isMirror(TreeNode t1,TreeNode t2){
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null ||t2 == null) {
            return false;
        }
        if(t1.val!=t2.val){
            return false;
        }
        return isMirror(t1.left,t2.right)&&isMirror(t1.right,t2.left);
    }
public static TreeNode build(){
        TreeNode A=new TreeNode(1);
    TreeNode B=new TreeNode(2);
    TreeNode C=new TreeNode(3);
    TreeNode D=new TreeNode(4);
    TreeNode E=new TreeNode(5);
    TreeNode F=new TreeNode(6);
    TreeNode G=new TreeNode(7);
    TreeNode H=new TreeNode(8);
    TreeNode I=new TreeNode(9);
    TreeNode J=new TreeNode(10);
    TreeNode K=new TreeNode(11);
    TreeNode L=new TreeNode(12);
    TreeNode Z=new TreeNode(26);
    A.left=B;
    A.right=C;
    B.left=D;
    B.right=E;
    D.left=F;
    D.right=G;
    F.left=Z;
    E.left=H;
    E.right=I;
    C.left=K;
    C.right=L;
    K.left=J;
    return A;

}
    public static void main(String[] args) {
        TreeNode root=build();
        Interview1Tree interview1Tree=new Interview1Tree();
        System.out.println(interview1Tree.preorderTraversal(root));
        System.out.println(interview1Tree.inorderTraversal(root));
        System.out.println(interview1Tree.postorderTraveersal(root));
        interview1Tree.levelorder(root);
        System.out.println();
        System.out.println("这棵二叉树的最大深度为："+interview1Tree.maxDepth(root));
        System.out.println("判断这棵树是否为平衡二叉树"+interview1Tree.isBalanxed(root));
        System.out.println("判断这棵树是否为对称二叉树"+interview1Tree.isSymmetric(root));
    }

}
