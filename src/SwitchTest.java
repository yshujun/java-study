/**
 * 控制语句 Switch
 * */
public class SwitchTest {
    public static void main() throws Exception {
        System.out.println("SwitchTest类执行了 (控制语句 Switch)");
        String[] str = {
                "1、关于Switch语句",
                "2、switch语句语法结构",
                "一个比较完整的switch语句应该这样编写",
                "   switch(int或String类型的字面值或者变量){",
                "       case int或String类型的字面值或者变量 :",
                "           java语句;",
                "           ...",
                "           break;",
                "       case int或String类型的字面值或者变量 :",
                "           java语句;",
                "           ...",
                "           break;",
                "       case int或String类型的字面值或者变量 :",
                "           java语句;",
                "           ...",
                "           break;",
                "       ...",
                "       default :",
                "           java语句;",
                "           ...",
                "   }",
                "3、switch语句的执行原理",
                "   switch后面小括号内的数据和case后面的数据进行一一匹配, 匹配成功的分支执行。按照自上而下的顺序匹配",
                "4、匹配成功的分支执行, 分支当中最后有”break;“语句的话, 整个switch语句终止。",
                "5、匹配成功的分支执行, 分支当中最后没有”break;“语句的话, 直接进入下一分支执行(不进行匹配)。",
                "   这种现象被称为case穿透现象。【提供break;语句可以避免穿透】",
                "6、所有匹配都没有成功, 当有default语句的话, 会执行default分支当中的程序。",
                "7、switch后面和case后面只能是int和String类型的数据, 不能是其他数据类型。",
                "   * 当然byte、short、char类型也可以直接写到switch和case后面, 因为它们可以进行自动类型转换, byte、short、char类型可以自动转换为int类型",
                "   * JDK6, switch和case只能探测int",
                "   * JDK7之后包含JDK7版本在内, 引入新特性, switch和case后面可以探测int和String类型的数据",
                "8、case可以合并:",
                "   int i = 10;",
                "   switch(i) {",
                "       case 1: case2: case3:",
                "           System.out.println(\"Test Code!\");",
                "   }",

        };
        for (String i: str) System.out.println(i);
        switch (10) {
            case 1 :
                System.out.println(1);
                break;
            case 10 :
                System.out.println(10);
                break;
            default:
                System.out.println("switch默认输出");
        }
    }
}