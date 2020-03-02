package word9;
import java.util.Arrays;
public class homework05 {


/*
    //给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素最多出现两次，
    // 返回移除后数组的新长度。不要使用额外的数组空间，
    //你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
    public static int removeDuplicates(int[] nums) {
        if(nums.length<=2){
            return nums.length;
        }
        int index=2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[index-2]){
                nums[index++]=nums[i];
            }
        }
        return index;
    }
    public static void main(String[] args) {
         int[] nums={1,1,1,2,2,2,2,3,4};
        System.out.println(removeDuplicates(nums));//{1,1,2,2,3,4}
    }
    }
 */
    //假设按照升序排序的数组在预先未知的某个点上进行了旋转。
    //( 例如，数组 [0,0,1,2,2,5,6] 可能变为 [2,5,6,0,0,1,2] )编写一个函数来判断
    //给定的目标值是否存在于数组中。若存在返回 true，否则返回 false
    public static  boolean search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return true;
            }
        }
        return false;
    }

public static void main(String[] args) {
        int[] nums={2,5,6,0,0,1,2};
    System.out.println(search(nums,0));
    System.out.println(search(nums,4));
    }
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
//反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。1 ≤ m ≤ n ≤ 链表长度
    public ListNode reverseBetween(ListNode head, int m, int n){
        if (head == null) {
            return null;
        }
        ListNode newHead=new ListNode(-1);
        newHead.next=head;
        ListNode prev=newHead;
        ListNode left=prev;
        int count=0;
        while(count<m-1){
            prev=prev.next;
            count++;
            left=prev;
        }
//count和head都移动到了要翻转的位置
        count++;
        prev=prev.next;
        ListNode right=prev;
//重新建立一个虚拟节点用来存翻转的节点
        ListNode newHead1=new ListNode(-1);
        while(count<=n){
            ListNode tmp=prev.next;
            prev.next=newHead1.next;
            newHead1.next=prev;
            prev=tmp;
            count++;
        }
//将两个链表合并
        left.next=newHead1.next;
        right.next=prev;
        return newHead.next;
    }
    //给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的
    //  节点都在大于或等于 x 的节点之前. 你应当保留两个分区中每个节点的初始相对位置。
    public ListNode partition(ListNode head, int x) {
        if(head==null){
            return null;
        }

        ListNode left=new ListNode(-1);
        ListNode leftTail=left;
        ListNode right=new ListNode(-1);
        ListNode rightTail=right;
        ListNode cur=head;
        while(cur!=null){
            if(cur.val>=x){
                rightTail.next=cur;
                cur=cur.next;
                rightTail=rightTail.next;
                rightTail.next=null;
            }else{
                leftTail.next=cur;
                cur=cur.next;
                leftTail=leftTail.next;
                leftTail.next=null;
            }
        }
        leftTail.next=right.next;
        return left.next;
    }
}
