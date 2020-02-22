package word4;

public class homework12{
//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的,并且
//它们的每个节点只能存储 一位 数字。如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
/*
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode l = l1;
    while (l1.next != null && l2.next != null) {
        l1.val += l2.val;
        l1 = l1.next;
        l2 = l2.next;
    }
    l1.val += l2.val;
    if (l1.next == null && l2.next != null) {
        l1.next = l2.next;
    }
    l1 = l;
    while (l1 != null) {
        int carry = 0;
        int val = l1.val;
        if (val >= 10) {
            l1.val %= 10;
            carry += 1;
        }
        if (carry > 0) {
            if (l1.next != null) {
                l1 = l1.next;
                l1.val += carry;
            } else {
                l1.next = new ListNode(carry);
                l1 = l1.next;
            }
        } else {
            l1 = l1.next;
        }
    }
    return l;

}

 */
}

