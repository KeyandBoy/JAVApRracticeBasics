import java.util.*;  // 导入java.util包，包含Scanner类

public class Rounding_off {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);  // 创建Scanner对象用于获取用户输入
        
        // 获取用户输入的浮点数
        double d = input.nextDouble();  // 读取用户输入的double类型数值
        
        // 四舍五入计算（简单实现）
        int k = (int)(d + 0.5);  // 通过加0.5后取整实现四舍五入
        
        // 输出结果
        System.out.println("SSWR is:" + k);  // 显示四舍五入后的整数值
        
        input.close();  // 关闭Scanner对象
    }
}