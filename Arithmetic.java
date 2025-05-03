// 导入Java工具包（包含Scanner等工具类）
import java.util.*;

// 主类定义：实现复杂算术表达式计算
public class Arithmetic {
    // 主程序入口
    public static void main(String[] args) {

        // 创建Scanner对象用于读取用户输入
        Scanner input = new Scanner(System.in);

        // 提示用户输入x的值
        System.out.println("Enter the x number: ");
        // 读取用户输入的x值（double类型）
        double x = input.nextDouble();

        // 提示用户输入y的值
        System.out.println("Enter the y number: ");
        // 读取用户输入的y值（double类型）
        double y = input.nextDouble();

        // 提示用户输入a的值
        System.out.println("Enter the a number: ");
        // 读取用户输入的a值（double类型）
        double a = input.nextDouble();

        // 提示用户输入b的值
        System.out.println("Enter the b number: ");
        // 读取用户输入的b值（double类型）
        double b = input.nextDouble();

        // 提示用户输入c的值
        System.out.println("Enter the c number: ");
        // 读取用户输入的c值（double类型）
        double c = input.nextDouble();

        // 计算复杂算术表达式：
        // (3 + 4x)/5 - 10(y-5)(a+b+c)/x + 9(4/x + (9+x)/y)
        double result = (3 + 4 * x) / 5 - 10 * (y - 5) * (a + b + c) / x + 9 * (4 / x + (9 + x) / y);

        // 输出最终计算结果
        System.out.println("The result is: " + result);

        // 关闭Scanner对象（释放资源）
        input.close();
    }
}