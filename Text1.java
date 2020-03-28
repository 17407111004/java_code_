package word17;
import word13.Text;
import java.util.Scanner;
public class Text1 {
    public static void main(String[] args) {
        /*
        try{
            String str=null;
            System.out.println(str.length());
            System.out.println("执行完str.length()");
        }catch(NullPointerException e){
            System.out.println("触发空指针异常");
            e.printStackTrace();
            try{
                String str2=null;
                System.out.println(str2.length());
            }catch(NullPointerException e1){
                System.out.println("二次触发空指针异常");
                e1.printStackTrace();
            }
        }
        System.out.println("我是一行日志");



    }

        try {

            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e){
            System.out.println("空指针异常");
        }finally {
            System.out.println("这是finally中的代码");
        }
        System.out.println("我是一行日志");
    }


        Scanner scanner = new Scanner(System.in);
        try {
            int num = scanner.nextInt();
            System.out.println(num);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }

         */
        try(Scanner scanner=new Scanner(System.in)){
            int num=scanner.nextInt();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /*
    //实现一个简单的控制台版用户登陆程序, 程序启动提示用户输入用户名密码.
    // 如果用户名密码出错, 使用自定义异常的方式来处理
    private static String name="张三";
   private static String password="123456";
    public static void main(String[] args) throws NameException, PasswordException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = scanner.next();
        System.out.println("请输入密码");
        String password = scanner.next();
        login(name,password);
    }
    public static void login(String name,String password) throws NameException, PasswordException {
        if(!Text1.name.equals(name)){
            throw new NameException("用户名错误");
        }
        if(!Text1.password.equals(password)){
            throw new PasswordException("密码错误");
        }
        System.out.println("登陆成功");
    }
*/
        /*
        //字符串转字符数组
        String str="hehe";
        char[] data=str.toCharArray();
        for(int i=0;i<data.length;i++){
            System.out.println(data[i]);
        }
        data[0]='a';
        System.out.println(str);
        //字符数组转字符串
        char[] array={'a','b','c'};
        String str=new String(array);
        System.out.println(str);

       // System.out.println(isNumber("1234"));
      // System.out.println(isNumber("abcd"));

        String str="hello";

        byte[] array=str.getBytes();
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        String str2=new String(array);
        System.out.println(str2);
    }

         */
/*
    //实现一个代码，判断某个字符串是否全部由数字构成
    //方法1
    public static boolean isNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c > '9' || c < '0') {
                return false;
            }
        }
        return true;
 }

//方法2
public static boolean isNumber(String str) {
    char[] data=str.toCharArray();
    for(int i=0;i<data.length;i++){
        if(data[i]>'9'||data[i]<'0'){
            return false;
        }
    }
    return true;
}
*/
//字符串转字节数组


}
