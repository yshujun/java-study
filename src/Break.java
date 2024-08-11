/***
 * break语句
 */
public class Break{
    public static void main() throws Exception{
        System.out.println("Break类执行了 (break语句)");
        String[] str = {
            "关于java控制语句当中的break语句",
            "1、break是java语句当中的关键字, 被翻译为”中断/折断“",
            "2、break + ”;“ 可以成为一个单独完整的java语句: break;",
            "3、break语句使用在switch语句当中, 用来终止switch语句执行",
            "4、break语句同样可以使用在循环语句当中用来终止循环语句",
            "5、break;语句使用在for, while, do...while循环语句当中用来跳出循环, 终止循环的执行。因为当程序循环到某个条件的时候, 后续的循环就没必要执行了",
            "6、在默认情况下break;语句终止的是离它最近的循环语句。当然也可以指定终止某个循环, 需要给循环起名, 采用这种语法: break 循环名称;",
        };
        for (String i: str) System.out.println(i);
    }
}