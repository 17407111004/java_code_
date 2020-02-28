package word6;
public class homework01 {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public int size(ListNode head) {
        int size = 0;
        ListNode cur = head;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        return size;
    }

    //对于一个链表，请设计一个时间复杂度为O(n),额外空间复杂度为O(1)的算法，
    // 判断其是否为回文结构。
    //给定一个链表的头指针A，请返回一个bool值，代表其是否为回文结构。
    // 保证链表长度小于等于900。
    public boolean chkPalindrome(ListNode A) {
        //先找中间节点
        int size = size(A);
        int steps = size / 2;
        ListNode B = A;
        for (int i = 0; i < steps; i++) {
            B = B.next;
        }
        //翻转后半部分
        ListNode prev = null;
        ListNode cur = B;
        while (cur != null) {
            ListNode next = cur.next;
            if (next == null) {
                B = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        //比较A中与B中对应的值是否相等
        while (B != null) {
            if (A.val != B.val) {
                return false;
            }
            A = A.next;
            B = B.next;
        }
        return true;
    }
    //在一个排序链表中，存在重复元素，删除重复元素，返回链表头指针
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode newHead = new ListNode(-1);
        ListNode newTail = newHead;
        ListNode cur = pHead;
        while (cur != null) {
            if (cur.next != null && cur.val == cur.next.val) {
                while (cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                cur = cur.next;
            } else {
                newTail.next = new ListNode(cur.val);
                newTail = newTail.next;
            }
        }
        return newHead.next;
    }
    }
