package word8;

public class homework03 {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    //给出两个 非空 的链表用来表示两个非负的整数。
// 其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
    //如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newHead=new ListNode(-1);
        ListNode prev=newHead;
        int i=0;
        while(l1!=null||l2!=null||i!=0){
            if(l1!=null){
                i+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                i+=l2.val;
                l2=l2.next;
            }
            prev.next=new ListNode(i%10);
            prev=prev.next;
            i/=10;
        }
        return newHead.next;
    }

    //给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
    // 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
    public ListNode swapPairs(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode newHead=new ListNode(-1);//傀儡节点
        ListNode cur=head;
        newHead.next=head;
        ListNode prev=newHead;
        while(cur!=null&&cur.next!=null){
            ListNode tmp=cur.next;
            cur.next=cur.next.next;
            tmp.next=cur;
            prev.next=tmp;
            prev=cur;
            cur=cur.next;
        }
        return newHead.next;
    }
}
