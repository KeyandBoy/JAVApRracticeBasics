// 斐波那契数列计算类（使用大整数处理大数）
public class Big_Fibonacci {
    // 主程序入口
    public static void main(String[] args) {
        // 创建Scanner对象用于读取用户输入
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // 提示用户输入斐波那契数列的索引位置
        System.out.print("Enter an index for the Fibonacci number: ");
        
        // 读取用户输入的整数值（索引位置）
        int index = input.nextInt();
        
        // 调用fib方法计算结果并输出
        System.out.println("Fibonacci number at index " + index + " is " + fib(index));
        
        // 关闭Scanner对象（释放资源）
        input.close();
    }

    /**
     * 计算斐波那契数列第n项的值（使用BigInteger处理大数）
     * @param n 斐波那契数列的索引位置（从0开始）
     * @return 第n项斐波那契数
     */
    public static java.math.BigInteger fib(long n) {
        // 初始化三个BigInteger变量：
        // a表示F(n-2)，初始为F(0)=0
        java.math.BigInteger a = new java.math.BigInteger("0");
        // b表示F(n-1)，初始为F(1)=1
        java.math.BigInteger b = new java.math.BigInteger("1");
        // c用于临时存储计算结果，初始为F(1)=1
        java.math.BigInteger c = new java.math.BigInteger("1");
        
        // 迭代计算斐波那契数列
        // 从第2项开始计算，直到第n项
        for (int i = 1; i < n; i++) {
            // 计算当前项：F(n) = F(n-1) + F(n-2)
            c = a.add(b);
            // 更新F(n-2)为原来的F(n-1)
            a = b;
            // 更新F(n-1)为当前计算的F(n)
            b = c;
        }
        // 返回第n项斐波那契数（存储在a中）
        return a;
    }
}