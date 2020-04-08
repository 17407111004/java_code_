package word24;

import java.util.Stack;

class TreeNode1{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode1(int val) {
        this.val = val;
    }
}
public class Interview2Tree {
    public static TreeNode build() {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.left = g;
        c.right = f;
        return a;
    }

    public static void preOrderByLoop(TreeNode root) {
        // 非递归的方式来完成遍历了
        // 需要一个栈来辅助
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode top = stack.pop();
            // 访问这个节点
            System.out.print(top.val + " ");
            // 把右子树和左子树分别入栈
            if (top.right != null) {
                stack.push(top.right);
            }
            if (top.left != null) {
                stack.push(top.left);
            }
        }
    }

    public static void inOrderByLoop(TreeNode root) {
        if (root == null) {
            return;
        }
        // 准备一个栈起到辅助效果
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (true) {
            // 1. 循环往左找, 把路径上遇到的节点都入栈
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            // 2. 如果当前栈为空, 遍历就结束了
            if (stack.isEmpty()) {
                break;
            }
            // 3. 取栈顶元素并访问
            TreeNode top = stack.pop();
            System.out.print(top.val + " ");

            // 4. 从当前节点的右子树再出发继续刚才的过程
            cur = top.right;
        }
    }

    public static void postOrderByLoop(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        // prev 记录了当前已经访问过的节点中的最后一个节点. (即将被访问的元素的前一个节点)
        TreeNode prev = null;
        while (true) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            if (stack.isEmpty()) {
                break;
            }
            // 拿出栈顶元素的值, 看看能不能访问
            TreeNode top = stack.peek();
            if (top.right == null || prev == top.right) {
                // 此时说明这个栈顶元素是可访问的.
                // 这个条件就对应了刚才写的 a) b) 这两个条件
                System.out.print(top.val + " ");
                stack.pop();
                prev = top;  // 时刻维护好 prev 指向已经遍历完元素的最后一个.
            } else {
                cur = top.right;
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = build();
        postOrderByLoop(root);
    }
}
