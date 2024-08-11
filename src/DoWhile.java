/**
 * do...while循环
 * */
public class DoWhile{
    public static void main() throws Exception {
        System.out.println("DoWhile类执行了 (循环语句)");
        String[] str = {
            "do...while循环语句",
            "1、do...while循环的语法结构: ",
            "   do{循环体}while(布尔表达式);",
            "2、do...while循环执行原理:",
            "   先执行循环体:",
            "   判断布尔表达式的结果:",
            "   * true",
            "       - 执行循环体",
            "           * 判断布尔表达式的结果:",
            "   *   false",
            "       - 循环结束",
            "3、do...while循环的循环次数",
            "   1 ~ N次 【至少执行一次】",
        };
        for (String i: str) System.out.println(i);
    }
}