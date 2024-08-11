/***
 * continue语句
 */
public class Continue{
    public static void main() throws Exception{
        System.out.println("Continue类执行了 (Continue语句)");
        String[] str = {
            "1、continue表示: 继续/go on/下一个",
            "2、continue也是一个continue关键字加一个分号构成一个单独的完整的Java语句, 主要出现在循环语句当中用来控制循环的执行。",
            "3、break和continue的区别?",
            "   * break表示循环不执行了",
            "   * continue表示直接进入下一次循环继续执行",
            "4、continue也可以这样写: ",
            "   continue 循环名称;",
        };
        for (String i: str) System.out.println(i);
    }
}