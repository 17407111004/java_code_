package word16;

public class Text {
    public static void main(String[] args) {

        //字符串切割split中的参数是正则表达式
        /*
        String str="hello:world:hehe:haha";
        String [] result=str.split(":");
        for(String x:result){
            System.out.println(x);
        }
        System.out.println("原来字符串："+str);
         */
        /*
        //   |  .  +  *  是特殊字符需要转义
        String str = "192.168.1.0";
        String[] result = str.split("\\.");
        for (String x : result) {
            System.out.println(x);
        }
 */



        /*
String str="name=zhangsan&age=18&sex=male";
String[] result=str.split("&");
for(String tmp:result){
    String[] tokens=tmp.split("=");
    if(tokens.length!=2){
        continue;
    }
    System.out.println(tokens[0]+":"+tokens[1]);
}
*/



        /*
       String str="Hello world";
  //实现方法 indexOf, 能够找出字符串子串存在的位置
        System.out.println(str.indexOf("wor"));
        // 截取字符串 前闭后开区间
        System.out.println(str.substring(4));
        System.out.println(str.substring(6,9));

         */



        /*
        //实现方法 replace, 能够替换字符串中的某个部分
        String Str=new String("hello");
        System.out.println("返回值："+Str.replace('o','l'));
        */


        /*
        //实现方法 contains, 能够判定字符串中是否包含子串
        String str="abcddtfhg";
        System.out.println(str.contains("bcd"));
         */



          /*
         //去掉字符串左右 空白 字符
        String str="     hello   world  ";
        System.out.println("["+str.trim()+"]");
        */


          /*
          //字符串转全大写，转全小写
        String str="hello";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        //字符串首字母大写其余小写
        //先处理首字母 在处理后面
       String result= str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
        System.out.println(result);
        System.out.println(str);

 */
          /*
          //判断字符串是否为空
        //注意空和null（空引用）的区别
          String str="";
        System.out.println(str.isEmpty());
         */

          /*
          //为了解决String str="hello";  str+="x"(创建新的对象）这样的问题引入StringBuffer和StringBuilder
        //StringBuilder是可变对象，因此在append拼接字符串的时候。修改对象本身
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("hello");
        stringBuilder.append(" ");
        stringBuilder.append("w");
        stringBuilder.append("o");
        stringBuilder.append("r");
        stringBuilder.append("l");
        stringBuilder.append("d");
        //支持链式调用（append返回值是this)
        stringBuilder.append(" ").append("x").append("x").append("x");
        System.out.println(stringBuilder);

          //逆置一个字符串   reverse的返回值也是自身
          StringBuilder stringBuilder=new StringBuilder("abcdefg");
          stringBuilder.reverse();
        System.out.println(stringBuilder);

          //插入删除操作
        StringBuilder stringBuilder=new StringBuilder("abcd");
        stringBuilder.insert(1,"hehe");
        System.out.println(stringBuilder);
        stringBuilder.delete(1,4);
        System.out.println(stringBuilder);

        //针对String下标为1的位置插入"hehe"
        String str="abcd";
        String result=str.substring(0,1)+"hehe"+str.substring(1);
        System.out.println(result);

          //针对String删除操作
        String str="abcd";
        String result=str.substring(0,1)+str.substring(2);
        System.out.println(result);
        */
          //StringBuilder:线程不安全
          //StringBuffer:线程安全（同步机制）枷锁
    }
}
