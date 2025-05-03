// 导入大整数类和Scanner类
import java.math.BigInteger;
import java.util.Scanner;

// 主类定义：计算大整数阶乘
public class Big_Factorial {
    // 主程序入口
    public static void main(String[] args) {
        // 创建Scanner对象用于读取用户输入
        Scanner input = new Scanner(System.in);
        
        // 提示用户输入一个大整数
        System.out.print("Input a BigNumber: ");
        
        // 读取用户输入的大整数
        BigInteger big1 = input.nextBigInteger();
        
        // 初始化结果为1（BigInteger.ONE是1的常量表示）
        BigInteger result = BigInteger.ONE;
        
        // 使用for循环计算阶乘：
        // 从1开始，每次加1，直到等于输入的数字
        for (BigInteger i = BigInteger.ONE; 
             i.compareTo(big1) <= 0;
             i = i.add(new BigInteger("1"))) {
            // 将当前结果与循环变量i相乘
            result = result.multiply(i);
        }
        
        // 输出阶乘结果（格式：n!=result）
        System.out.println(big1 + "!=" + result);
        
        // 关闭Scanner对象（释放资源）
        input.close();
    }
}