package word23;
class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class IntreviewTree1 {
    //ica表示最近公共祖先
    private TreeNode ica=null;
    public  TreeNode lowestCommonAncector(TreeNode root,TreeNode p,TreeNode q){
        if(root==null){
            return null;
        }
        //findNode递归找的过程中，一旦找到了就把结果放到ica这个变量中
        findNode(root,p,q);
        return ica;
        }
        //看从root出发能不能找到p或者q只要找到1个，就返回true，都找不到返回false
    private boolean findNode(TreeNode root,TreeNode p,TreeNode q){
        if(root==null){
            return false;
        }
        //递归按照后序遍历的方式来查找了
        int left=findNode(root.left,p,q)?1:0;
        int right=findNode(root.right,p,q)?1:0;
        int mid=(root==p||root==q)?1:0;
        if(left+right+mid==2){
            ica=root;
        }
        //如果三个位置之和为0表示没有找到，返回false
        //只要能找到1或者以上，都返回true
        return(left+right+mid)>0;
    }
    public TreeNode Convert(TreeNode pRootOfTree){
        //基于递归的方式来完成双向链表构建，为了保证有序性，需要终须遍历
        //二叉搜索树的中序遍历结果是有序
        if(pRootOfTree==null){
            return null;
        }
        if(pRootOfTree.left==null&&pRootOfTree.right==null){
            //当前这个节点没有子树
            return pRootOfTree;
        }
        //最终的链表=》左子树的链表+根节点+右子树链表
        //就需要用左子树链表的尾巴和根节点相连
        //在用右子树的头部和根节点相连

        //1.先递归处理左子树
        //left就是左子树这个链表的根节点
        TreeNode left=Convert(pRootOfTree.left);
        //2.需要找到左子树链表的尾节点
        TreeNode leftTail=left;
        //right相当于链表的next
        while(leftTail!=null&&leftTail.right!=null){
            leftTail=leftTail.right;
        }
        //循环结束之后。leftTail就指向了左侧链表的尾部
        //3.把左子树和当前节点连在一起
        if(left!=null){
            leftTail.right=pRootOfTree;
            pRootOfTree.left=leftTail;
        }
        //4.递归转换右子树，把右子树也变成双向链表
        TreeNode right=Convert(pRootOfTree.right);
        //5.把当前节点和右子树连在一起
        if(right!=null){
            right.left=pRootOfTree;
            pRootOfTree.right=right;
        }
        //6.最u中返回新的链表的头节点
        //如果left为null，链表的头节点就是pRootOfTree
        //如果left非null。头节点就是left
        return left==null?pRootOfTree:left;
    }

    private int index;  // 当前访问到先序遍历中的第几个元素了
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        index = 0;
        return buildTreeHelper(preorder, inorder, 0, inorder.length);
    }

    // [left, right) 这个区间就表示当前 preorder[index] 这个节点对应的子树的中序遍历结果
    private TreeNode buildTreeHelper(int[] preorder, int[] inorder, int left, int right) {
        if (left >= right) {
            // 中序遍历结果为空. 这个树就是空树
            return null;
        }
        if (index >= preorder.length) {
            // 遍历元素结束
            return null;
        }
        // 根据当前根节点的值创建出根节点
        TreeNode root = new TreeNode(preorder[index]);
        index++;  // 节点创建完毕, 就 index ++ 准备处理下一个节点
        // 根据该节点在中序遍历结果中的位置, 把 inorder 数组划分成两个部分
        int pos = find(inorder, left, right, root.val);
        // [left, pos) 表示当前 root 左子树的中序遍历结果.
        // [pos + 1, right) 表示当前 root 右子树的中序遍历结果.
        root.left = buildTreeHelper(preorder, inorder, left, pos);
        root.right = buildTreeHelper(preorder, inorder, pos + 1, right);
        return root;
    }

    private int find(int[] inorder, int left, int right, int toFind) {
        for (int i = left; i < right; i++) {
            if (inorder[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    // 使用 sb 表示最终得到的字符串结果.
    // 递归过程中得到的局部结构都往 sb 中追加即可
    private StringBuilder sb = new StringBuilder();
    public String tree2str(TreeNode t) {
        if (t == null) {
            // 需要返回一个空字符串. 而不是 null
            return "";
        }
        // 借助 helper 方法递归进行先序遍历
        helper(t);
        // 递归得到的字符串最前面和最后面的括号给干掉即可
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private void helper(TreeNode t) {
        if (t == null) {
            return;
        }
        // 访问根节点. 此处的访问操作追加字符串到 sb 中即可
        sb.append("(");
        sb.append(t.val);
        helper(t.left);
        if (t.left == null && t.right != null) {
            // 左子树为空树, 右子树非空.
            // 一定要加上一组 () 来占位
            sb.append("()");
        }
        helper(t.right);
        sb.append(")");
    }

}
