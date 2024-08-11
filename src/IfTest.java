
/**
 * 控制语句
 * */
public class IfTest {
    public static void main() throws Exception {
        System.out.println("IfTest类执行了 (控制语句)");
        String[] str = {
            "关于java语言当中的if语句, 属于选择结构, if语句又被称为分支语句/条件控制语句:",
            "   1、if语句的语法结构: 四种编写方式",
            "       第一种: ",
            "           if(布尔表达式){java语句}",
            "       第二种: ",
            "           if(布尔表达式){java语句}else{java语句}",
            "       第三种: ",
            "           if(布尔表达式){java语句}else if(布尔表达式){java语句}",
            "       第三种: ",
            "           if(布尔表达式){java语句}else if(布尔表达式){java语句}else{java语句}",
            "   2、重点: 对于java中的if语句来说, 只要有一个分支执行, 整个if语句全部结束",
            "   3、注意: 以上的第二种编写方式和第四种编写方式都带有else分支, 这两种方式可以保证有分支执行",
            "   4、“所有的控制语句”都是可以嵌套使用的。只要合理嵌套就行。",
            "       * 注意: 嵌套使用的时候, 代码格式要保证完美。【改缩进的时候缩进】",
            "   5、if语句种只有一条java语句的话, 大括号可以省略不写。 不推荐使用",
            "       if(布尔表达式) java语句;",
        };
        for (String i: str) System.out.println(i);

//        第一步: 创建键盘扫描对象
//        java.util.Scanner s = new java.util.Scanner(System.in);
//        第二步: 调用Scanner对象的next()方法开始接收用户键盘输入
//        程序执行到这里就会停下来, 等待用户输入
//        当用户输入的时候, 并且最终敲回车键的时候, 键入的信息会自动赋值给userInputContent
//        程序执行到这里用户输入的信息已经存到内存当中了。
//        接收文本【以字符串形式接收】
//        String userInputConent = s.next();
//        int num = s.nextInt();
//        System.out.println("您输入了:" + userInputConent);
//        System.out.println("您输入了:" + num);
    }
}