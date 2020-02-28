package word6;

public class homework18 {
    static class ListNode {
        int val;
        LinkedList.ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    //在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留
    // 返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
    public LinkedList.ListNode deleteDuplication(LinkedList.ListNode pHead) {
        LinkedList.ListNode newHead = new LinkedList.ListNode(-1);
        LinkedList.ListNode newTail = newHead;
        LinkedList.ListNode cur = pHead;
        while (cur != null) {
            if (cur.next != null && cur.val == cur.next.val) {
                while (cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
            } else {
                newTail = new LinkedList.ListNode(cur.val);
                newTail = newTail.next;
                cur = cur.next;
            }
        }
        return newHead.next;
    }
}
