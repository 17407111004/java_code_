package word20;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;

public class SeqList<E> {
    //当前这个data的类型是啥。可以就当成一个Object[].Object具体代表的是
    //需要最终在实例化SeqList的时候才能确定下来
    //E这样的泛型参数是不能被直接实例化的，当前还不知道E是啥类型

    private E[] data=(E[]) new Object[10];
    private int size;

   public void add(E elem){
       data[size]=elem;
       size++;
   }
   public E get(int index){
       return data[index];
   }

    public static void main(String[] args) {
       /*
        SeqList<String> seqList=new SeqList<>();
        seqList.add("aaa");
        seqList.add("bbb");
        String str=seqList.get(0);
        SeqList<Animal> animals=new SeqList<>();
        animals.add(new Animal());
        animals.add(new Animal());
        Animal animal=animals.get(0);

        */
       SeqList<Integer>integerSeqList=new SeqList<>();
       //这个操作相当于把int=>Integer:装箱（boxing）
        //Integer num=new Integer(10);
        //Integer num=Integer.valueOf(10);//value是一个静态方法
        Integer num=10;//可以直接把int赋值给Integer.自动装箱
        integerSeqList.add(num);
        //把Integer=>int:拆箱（unboxing）
        num=integerSeqList.get(0);
        int value=num.intValue();//手动拆箱
        //int value=num//自动拆箱
    }
}
