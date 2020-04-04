package word22;
class node{
    int val;
    node next;
    public node(int val) {
        this.val = val;
    }
    public node(int val,node next) {
        this.val = val;
        this.next = next;
    }
}

public class MyLinkedList {
    node dummy;   //哑节点，，哨兵
    node tail;         //尾节点
    int size;            //链表大小

    public MyLinkedList() {
        dummy = new node(0);
        size = 0;
        tail = dummy;
    }


    public int get(int index) {
        if(index<0||index>=size)
            return -1;
        node cur = dummy;
        while(index>=0) {
            cur = cur.next;
            index--;
        }
        return cur.val;
    }


    public void addAtHead(int val) {
        node temp = dummy.next;
        dummy.next = new node(val,temp);
        if(size==0)
            tail = dummy.next;
        size++;
    }


    public void addAtTail(int val) {
        tail.next = new node(val);
        tail = tail.next;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if(index>size)
            return;
        if(index<0) {           //题目中，如果index<0在头部插入节点
            addAtHead(val);
            return;
        }
        if(index==size) {
            addAtTail(val);
            return;
        }
        node cur = dummy;
        while(index>0) {
            cur = cur.next;
            index--;
        }
        cur.next = new node(val,cur.next);
        size++;
    }


    public void deleteAtIndex(int index) {
            if(index<0 || index>=size)
            return;
        node cur = dummy;
        while(index>0) {
            cur = cur.next;
            index--;
        }
        if(cur.next==tail)        //删除的如果是尾节点，要更新tail
            tail = cur;
        cur.next = cur.next.next;
        size--;
    }
}
