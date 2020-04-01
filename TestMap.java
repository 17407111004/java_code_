package word20;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        //1.创建Map实例。泛型参数有两个。第一个是key的类型,第二个是value的类型
        //key value这种结构最主要的目的就是通过key找到对应的value
        Map<String,String> map=new HashMap<>();
        //2.使用size获取到元素个数（键值对个数）
        System.out.println(map.size());
        //3.使用isEmpty查看是否为空
        System.out.println(map.isEmpty());
        //4.使用put方法把一些键值对存放进去
        map.put("及时雨","宋江");
        map.put("玉麒麟","卢俊义");
        map.put("智多星","吴用");
        map.put("入云龙","公孙胜");
        //5.get方法根据key来查找对应的value
        //getOrDefault 方法，如果key不存在，返回默认是值
        System.out.println(map.get("及时雨"));
        System.out.println(map.get("大刀"));
        System.out.println(map.getOrDefault("行者","武松"));
        //6.通过containsKey和containsValue来判定某个值是否存在
        //containsKey执行效率高containsValue的执行效率底
        System.out.println(map.containsKey("智多星"));
        System.out.println(map.containsValue("公孙胜"));
        //8.foreach遍历Map中所有键值对
        //Entry 表示一个“条目”，也就是一个键值对
        //map.entrySet获取到所有的键值对
        //Map中的元素顺序和插入顺序无关
        for(Map.Entry<String ,String >entry:map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        //9.删除键值对
        map.remove("入云龙");
        System.out.println("删除元素之后：");
        for(Map.Entry<String ,String >entry:map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }

}
