/**
 * 字面值
 */
public class Const{
    public static void main() throws Exception {
        System.out.println("Const类执行了 (字面值)");
        String[] str = {
            "字面值",
            "字面值是java的源程序的组成部分之一,包括标识符和关键字都是java的源程序的组成部分",
            "10, 100            属于整数型字面值",
            "3.14               属于浮点型字面值",
            "true, false        属于布尔型字面值",
            "\"abc\"              属于布字符串型字面值",
            "'a'                属于字符型字面值",
            "*注意:",
            "   java语言当中所有的字符串型字面值必须使用双引号括起来",
            "   java语言当中所有的字符型字面值必须使用单引号括起来"
        };
        for (String i: str ) System.out.println(i);
    }
}