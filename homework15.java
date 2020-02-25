package word3;

public class homework15 {
    //给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
    /*
    //第一种方法
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            int count = 0;
            ListNode cur = head;
            while(cur!=null){
                count++;
                cur = cur.next;
            }
            int index = count - n;
            if(index==0) {
                return head.next;
            }
            cur = head;
            for(int i=1;i<index;i++){
                cur = cur.next;
            }
            cur.next = cur.next.next;
            return head;
        }
    }

     */
    /*
    //第二种方法
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode slow = head;
            ListNode fast = head;
            ListNode  temp = new ListNode(-1);
            temp.next = head;
            ListNode pre = temp;
            int i = 1;
            while(fast.next != null){
                if(i < n){
                    i ++;
                } else {
                    pre = pre.next;
                    slow = slow.next;
                }
                fast  = fast.next;
            }
            pre.next = slow.next;
            return temp.next;
        }
    }
    */
}
