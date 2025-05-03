import java.util.*;  // 导入java.util包，包含Scanner类

public class Fahrenheit_To_Celsius {
    public static void main(String[] args){
        // 创建Scanner对象用于获取用户输入
        Scanner input = new Scanner(System.in);
        
        // 提示用户输入华氏温度
        System.out.print("input the Fahrenheit:");  // 显示输入提示
        double f = input.nextDouble();  // 读取用户输入的华氏温度值

        // 华氏温度转摄氏温度计算
        double c;  // 声明摄氏温度变量
        c = (5.0/9)*(f - 32);  // 使用公式 C = (5/9)*(F-32) 进行转换
        
        // 输出转换结果
        System.out.println("output the Celsius:"+ c);  // 显示摄氏温度值

        // 关闭Scanner对象
        input.close();  // 释放系统资源
    }
}