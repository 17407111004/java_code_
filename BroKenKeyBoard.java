package word29;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BroKenKeyBoard {
    public static void main(String[] args) {
        // 题目中的主要任务是判定预期输出的哪些字符在实际输出的字符串中没有存在.
        // 先搞一个 Set 把实际输出的每个字符都存进去. 就可以遍历预期输出字符串, 看看哪个字符在这个 Set 中不存在
        // [注意事项] 预期字符串: 7_This_is_a_test    实际字符串: _hs_s_a_es.
        // 可以看到 预期字符串 中有三次出现了 T 这个键, 都是在实际字符串中不存在. 但是最后给的示例结果中 T 就只出现一次
        // 最后还得对坏掉的键进行去重(同样可以使用 Set 来去重)
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            // 1. 循环读入两个字符串. 第一个字符串是预期输出的内容; 第二个字符串是实际输出的内容
            String expected = scanner.next();
            String actual = scanner.next();
            // 2. 把读入的两个字符串全都转成大写(根据题目的输出示例).
            expected = expected.toUpperCase();
            actual = actual.toUpperCase();
            // 3. 创建一个 Set 保存实际哪些字符输出了
            Set<Character> actualSet = new HashSet<>();
            for (int i = 0; i < actual.length(); i++) {
                // 注意, Set 中的元素不能重复. 如果 add 的时候发现这个元素已经存在, add 就失败了.
                // 没有任何负面影响(不会因为失败就抛出个异常啥的, 也不会影响到原有 Set 中的内容)
                actualSet.add(actual.charAt(i));
            }
            // 4. 遍历预期输出的字符串, 看看哪个字符没有被实际输出
            Set<Character> brokenKeySet = new HashSet<>();
            for (int i = 0; i < expected.length(); i++) {
                char c = expected.charAt(i);
                if (actualSet.contains(c)) {
                    // 当前字符已经被输出了, 就是一个好的键.
                    continue;
                }
                // 当前这个键没被实际输出, 就是坏了的键.
                // 输出格式非常重要, 要不要空格, 要不要换行, 这些细节都很重要.
                // 这里还要考虑一个问题, 当前的坏键去重问题.
                if (brokenKeySet.contains(c)) {
                    // 此处的 brokenKeySet 用于辅助去重. 防止同一个坏键被打印多次
                    continue;
                }
                System.out.print(c);
                brokenKeySet.add(c);
            }   // end for
        }  // end while
    }
}
