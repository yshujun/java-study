/***
 * 循环语句 for
 */
public class ForTest{
    public static void main() throws Exception{
        System.out.println("ForTest类执行了 (循环语句)");
        String[] str = {
            "1、循环结构:",
            "   在程序当中总有一些需要反复的/重复的执行的代码, 假设没有循环结构, 那么这段需要重复执行的代码是需要重复编写的, 代码无法得到重复使用。所以多数编程语言都是支持循环结构的, 将需要重复执行的的代码片段放到”循环体“, 再联合”计数器“, 共同控制这段需要反复执行的代码",
            "2、基本上所有的循环语言支持的循环包括三种:",
            "   * for循环",
            "   * while循环",
            "   * do...while循环",
            "3、for循环的语法结构是什么?",
            "   语法结构:",
            "       for(初始化表达式; 布尔表达式; 更新表达式){需要重复执行的代码片段【循环体由java语句构成】}",
            "4、for循环执行过程/执行原理?[****]",
            "   4.1、初始化表达式、布尔表达式、更新表达式都不是必须的【但是两个分号是必须的】",
            "   4.2、初始化表达式最先执行, 并且在整个for循环中只执行一次。",
            "   4.3、布尔表达式必须是true/false, 不能是其它值。",
            "   4.4、for的执行过程",
            "       * 先执行初始化表达式, 并且该表达式只执行一次",
            "       * 判断布尔表达式的结果是true还是false",
            "           - 布尔表达式true",
            "               * 执行循环体",
            "               * 执行更新表达式",
            "               * 判断布尔表达式的结果是true还是false",
            "           - 布尔表达式false",
            "               * 结束循环",
        };
        for (String i: str) System.out.println(i);
        System.out.println("for循环输出99乘法表");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i*j + "    ");
            }
            System.out.println("");
        }
        System.out.println("for循环输出1~10000质数");
        int count = 0;
        for (int i = 1; i <= 10000; i++){
            boolean isPrime = true;
            int num = (int) Math.sqrt(i);
            for (int j = 2; j <= num; j++){
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                if(i < 1000) {
                    System.out.print(i+"\t\t");
                } else {
                    System.out.print(i+"\t");
                }

                if(count % 20 == 0) System.out.println();
            }
        }
    }
}