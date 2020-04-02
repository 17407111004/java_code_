package word20;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String >list=new ArrayList<>();
        //2.新增元素
        list.add("c");
        list.add("c++");
        list.add("java");
        list.add("python");
        //3.打印整个List
        System.out.println(list);
        //4.按照下标来访问元素
        System.out.println(list.get(2));
        //5.根据下标来修改元素
        list.set(0,"PHP");
        System.out.println(list);
        //6.使用for循环来访问每个元素
        for(String s:list){
            System.out.println(s);
        }
        //Collection 中的操作，List同样可以使用
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //7.使用subList获取子序列
        System.out.println("获取子序列：");
        System.out.println(list.subList(1,3));
        //8.可以使用构造方法构造出新的list 对象
        List<String >list2=new ArrayList<>(list);
        System.out.println("复制了一份 list2:");
        System.out.println(list2);
        list.set(0,"c#");
        System.out.println(list2);
    }
}
