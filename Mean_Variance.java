import java.util.*;  // 导入java.util包，包含Scanner类

public class Mean_Variance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // 创建Scanner对象用于获取用户输入
        
        // 提示用户输入10个数字
        System.out.println("Enter 10 numbers:");
        
        // 读取用户输入的10个数字
        double a = input.nextDouble();  // 读取第1个数字
        double b = input.nextDouble();  // 读取第2个数字
        double c = input.nextDouble();  // 读取第3个数字
        double d = input.nextDouble();  // 读取第4个数字
        double e = input.nextDouble();  // 读取第5个数字
        double f = input.nextDouble();  // 读取第6个数字
        double g = input.nextDouble();  // 读取第7个数字
        double h = input.nextDouble();  // 读取第8个数字
        double i = input.nextDouble();  // 读取第9个数字
        double j = input.nextDouble();  // 读取第10个数字
        
        // 计算平均值（算术平均数）
        double mean = (a + b + c + d + e + f + g + h + i + j) / 10;
        
        // 计算方差（样本方差，分母为n-1=9）
        double variance = ((a - mean) * (a - mean) + 
                          (b - mean) * (b - mean) + 
                          (c - mean) * (c - mean) + 
                          (d - mean) * (d - mean) + 
                          (e - mean) * (e - mean) + 
                          (f - mean) * (f - mean) + 
                          (g - mean) * (g - mean) + 
                          (h - mean) * (h - mean) + 
                          (i - mean) * (i - mean) + 
                          (j - mean) * (j - mean)) / 9;
        
        // 计算标准差（方差的平方根）
        variance = Math.pow(variance, 0.5);
        
        // 输出计算结果
        System.out.println("The mean is " + mean);  // 输出平均值
        System.out.println("The variance is " + variance);  // 输出标准差
        
        input.close();  // 关闭Scanner对象
    }
}