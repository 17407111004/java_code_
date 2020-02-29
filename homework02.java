package word6;

public class homework02 {
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
    //编写一个程序，找到两个单链表相交的起始节点。
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
int size1=size(headA);
int size2=size(headB);
int steps;
if(size1>size2){
    steps=size1-size2;
    for(int i=0;i<steps;i++){
        headA=headA.next;
    }
}else{
    steps=size2-size1;
    for(int i=0;i<steps;i++){
        headB=headB.next;
    }
}
  while(headA!=null&&headB!=null){
      if(headA==headB){
          return headA;
      }
      headA=headA.next;
      headB=headB.next;
  }
     return null;
    }
    //给定一个链表，判断链表中是否有环。
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    //给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
    public ListNode detectCycle(ListNode head) {
ListNode fast=head;
ListNode slow=head;
while(fast!=null&&fast.next!=null){
    slow=slow.next;
    fast=fast.next.next;
    if(slow==fast){
        break;
    }
    }
if(fast==null||fast.next==null){//链表不带环
    return null;
}
ListNode cur1=head;
ListNode cur2=slow;
while(cur1!=cur2){
    cur1=cur1.next;
    cur2=cur2.next;
}
return cur1;
}
}
