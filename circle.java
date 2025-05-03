import java.util.*;  // 导入java.util包，主要使用Scanner类

public class circle {  // 定义圆形计算类

    public static void main(String[] args){  // 主程序入口
    
        final double PI = 3.1415926;  // 定义圆周率常量（注意：建议使用Math.PI获取更高精度）
        
        Scanner input = new Scanner(System.in);  // 创建控制台输入扫描器

        System.out.print("put in the r:");  // 提示用户输入半径
        double r = input.nextDouble();  // 读取用户输入的半径值（注意：未做负数校验）
        
        double a = r * r * PI;  // 计算圆面积：πr?
        System.out.println("the area is " + a);  // 输出面积计算结果
        
        input.close();  // 关闭输入流（注意：在IDE中可能触发警告）
    }
}