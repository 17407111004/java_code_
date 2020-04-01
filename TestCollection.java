package word20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TestCollection {
    public static void main(String[] args) {
        //1.创建Collection
        Collection<String> collection=new ArrayList<>();
        //2.使用size方法
        System.out.println(collection.size());
        //3.使用isEmpty方法
        System.out.println(collection.isEmpty());
        //4.使用add方法
        collection.add("我");
        collection.add("爱");
        collection.add("Java");
        //5.再次使用size方法和isEmpty方法
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
        //6.遍历
        //可以toArray把Collection转换成数组
        //得到的结果是Object[]
        Object[] array=collection.toArray();
        System.out.println(Arrays.toString(array));
        //7.也可以使用for循环来遍历集合中的元素
        for(String s:collection){
            //s就会分别指向collection中的每一个元素
            System.out.println(s);
        }
        //8.使用contains方法判定元素是否存在
        System.out.println(collection.contains("我"));
        //9.使用remove来删除元素
        collection.remove("我");
        System.out.println("删除之后：");
        for(String s:collection){
            System.out.println(s);
        }
        //10.清空所有元素用clear方法
        collection.clear();
        System.out.println("清空元素之后:");
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());
    }
}
