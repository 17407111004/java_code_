package word21;

public class MyQueueByLinkedList {
    //Node这个类叫做“内部类”，定义在某个类或者方法中的类
    //static效果就是：创建Node的实例不依赖MyQueueLinkedList这个类的实例
    static class Node{
       public int val;
       Node next=null;

        public Node(int val) {
            this.val = val;
        }
    }
//创建一个链表，就得有头节点，此处head节点不是傀儡节点
    //基于链表来实现队列，可以入队列从尾部插入，出队列从头部删除，也可以入队列从头部插入，出队列从尾部删除
    //无论那种都最好记录头尾节点
    private Node head=null;
    private Node tail=null;
    //此处按照入队列从尾部插入，出队列从头部删除实现
    //入队列（标准库中的队列，入队列操作叫offer）
    public void offer(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        //当前如果不是空链表
        tail.next=newNode;
        tail=tail.next;
    }
   //出队列；
    public Integer poll(){
        //如果当前队列就是空队列，再去poll不科学；
        if(head==null){
            //如果出队列失败，返回一个错误值
            return null;
        }
        int ret=head.val;
        head=head.next;
        if(head==null){
            //删除当前元素之后，队列就变成了空队列
            tail=null;
        }
        return ret;
    }
    //取队首元素
    public Integer peek(){
        if(head==null){
            return null;
        }
        return head.val;
    }
}
