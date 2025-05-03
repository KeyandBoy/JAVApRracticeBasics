import java.util.Scanner;

public class ComputeAngles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // 创建Scanner对象用于读取用户输入
        System.out.println("Enter three points:");  // 提示用户输入三个点的坐标
        
        // 读取三个点的坐标
        double x1 = input.nextDouble();  // 第一个点的x坐标
        double y1 = input.nextDouble();  // 第一个点的y坐标
        double x2 = input.nextDouble();  // 第二个点的x坐标
        double y2 = input.nextDouble();  // 第二个点的y坐标
        double x3 = input.nextDouble();  // 第三个点的x坐标
        double y3 = input.nextDouble();  // 第三个点的y坐标

        // 计算三角形三条边的长度
        double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));  // 边a的长度(顶点A对边)
        double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));  // 边b的长度(顶点B对边)
        double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));  // 边c的长度(顶点C对边)

        //在Java中，Math.toDegrees() 是一个数学工具方法，用于将弧度（radians）转换为角度（degrees）?。
        //在Java中，Math.acos() 是反余弦函数?（arccosine），用于计算给定值的反余弦值，返回结果为弧度（radians）
        
        // 使用余弦定理计算三个角的角度(转换为度数)
        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));  // 计算角A
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));  // 计算角B
        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));  // 计算角C
        
        System.out.println("The three angles are " + A + " " + B + " " + C);  // 输出三个角度值

        // 使用海伦公式计算三角形面积
        double p = (a + b + c) / 2;  // 计算半周长
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));  // 计算面积
        System.out.println("The area of the triangle is " + area);  // 输出面积值
        
        input.close();  // 关闭Scanner对象
    }
}