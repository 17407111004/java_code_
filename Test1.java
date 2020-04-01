package word20;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
//引用类型都是直接或者间接继承自Object
public static void main(String[] args) {
    Map<String,String > map=new HashMap<>();
    map.put("及时雨","宋江");
    map.put("玉麒麟","卢俊义");
    for(Map.Entry<String ,String >entry:map.entrySet()){
        System.out.println(entry.getKey()+":"+entry.getValue());
    }
    //如果插入的键值对key已经存在，就会覆盖原有的value
    map.put("及时雨","晁盖");
    System.out.println(map);
}
}
