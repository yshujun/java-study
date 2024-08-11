/**
 * while循环
 * */
public class While{
    public static void main() throws Exception {
        System.out.println("While类执行了 (循环语句)");
        String[] str = {
            "while循环语句",
            "1、while循环的语法结构: ",
            "   while(布尔表达式){循环体};",
            "2、while循环执行原理:",
            "   先判断布尔表达式的结果:",
            "   * true",
            "       - 执行循环体",
            "           * 判断布尔表达式的结果:",
            "   *   false",
            "       - 循环结束",
            "3、while循环的循环次数",
            "   0 ~ N次",
            "   * 注意while可能执行0次",
        };
        for (String i: str) System.out.println(i);
        int a = 1;
        while(a <= 10) {
            System.out.println(a);
            a++;
        }
    }
}