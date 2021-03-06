package word6;

public class LinkedList01 {
    //编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
    static class ListNode{
        int val;
        LinkedList.ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }
    public LinkedList.ListNode partition(LinkedList.ListNode pHead, int x) {
        if(pHead==null){
            return null;
        }
        if(pHead.next==null){
            return pHead;
        }
        LinkedList.ListNode bigHead=new LinkedList.ListNode(-1);
        LinkedList.ListNode bigTail=bigHead;
        LinkedList.ListNode smallHead=new LinkedList.ListNode(-1);
        LinkedList.ListNode smallTail=smallHead;
        for(LinkedList.ListNode cur = pHead; cur!=null; cur=cur.next){
            if(cur.val<x){
                smallTail.next= new LinkedList.ListNode(cur.val);
                smallTail=smallTail.next;
            }else{
                bigTail.next=new LinkedList.ListNode(cur.val);
                bigTail=bigTail.next;
            }
        }
        smallTail.next=bigHead.next;
        return smallTail.next;
    }
    //将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
    public LinkedList.ListNode mergeTwoLists(LinkedList.ListNode l1, LinkedList.ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        LinkedList.ListNode newHead=new LinkedList.ListNode(-1);//傀儡头节点
        LinkedList.ListNode newTail=newHead;//末尾节点
        LinkedList.ListNode cur1=l1;
        LinkedList.ListNode cur2=l2;
        while(cur1!=null&&cur2!=null){
            if(cur1.val<cur2.val){
                newTail.next=cur1;
                newTail=newTail.next;
                cur1=cur1.next;
            }else{
                newTail.next=cur2;
                newTail=newTail.next;
                cur2=cur2.next;
            }
        }
        //此时cur1或者cur2肯定有一个已经到null了
        if(cur1==null){
            newTail.next=cur2;
        }else{
            newTail.next=cur1;
        }
        return newHead.next;//因为头节点是傀儡节点，不要傀儡节点
    }
    //输入一个链表，输出该链表中倒数第k个结点
    public LinkedList.ListNode FindKthToTail(LinkedList.ListNode head, int k) {
        if (head == null) {
            return null;
        }
        int size = size(head);
        if (k <= 0 || k > size) {
            return null;
        }
        int steps = size - k;
        LinkedList.ListNode cur = head;
        for (int i = 0; i <= steps; i++) {
            cur = cur.next;
        }
        return cur;
    }

    public int size(LinkedList.ListNode head){
        int size = 0;
        LinkedList.ListNode cur = head;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        return size;
    }
    //给定一个带有头结点 head 的非空单链表，返回链表的中间结点。如果有两个中间结点
// 则返回第二个中间结点
    public LinkedList.ListNode middleNode(LinkedList.ListNode head) {
        int steps = size(head) / 2;
        LinkedList.ListNode cur = head;
        for (int i = 0; i <= steps; i++) {
            cur=cur.next;
        }
        return cur;
    }
    //反转一个单链表
    public LinkedList.ListNode reverseList(LinkedList.ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        LinkedList.ListNode newHead=null;
        LinkedList.ListNode cur=head;
        LinkedList.ListNode prev=null;
        while(cur!=null){
            LinkedList.ListNode next=cur.next;
            if(next==null){
                newHead=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return newHead;
    }
    // 删除链表中等于给定值 val 的所有节点
    public LinkedList.ListNode removeElements(LinkedList.ListNode head, int val) {
        if(head==null){
            return null;
        }
        LinkedList.ListNode prev=head;
        LinkedList.ListNode cur=head.next;
        while(cur!=null){
            if(cur.val==val){
                prev.next=cur.next;
                cur=prev.next;
            }else{
                prev=cur;
                cur=cur.next;
            }
        }
        if(head.val==val){
            head=head.next;
        }
        return head;
    }
}
