// 导入Java工具包（包含Scanner等工具类）
import java.util.*;

// 主类定义：计算三角形面积
public class Alulated_Triangle_Area {
    // 主程序入口
    public static void main(String[] args){
        // 创建Scanner对象用于读取用户输入
        Scanner input = new Scanner(System.in);
        
        // 提示用户输入三个点的坐标
        System.out.println("Enter the coordinates of three point");
        // 指定输入格式说明
        System.out.println("Like x1 y1 x2 y2 x3 y3 :");
        
        // 读取第一个点的x坐标
        double x1 = input.nextDouble();
        // 读取第一个点的y坐标
        double y1 = input.nextDouble();
        // 读取第二个点的x坐标
        double x2 = input.nextDouble();
        // 读取第二个点的y坐标
        double y2 = input.nextDouble();
        // 读取第三个点的x坐标
        double x3 = input.nextDouble();
        // 读取第三个点的y坐标
        double y3 = input.nextDouble();

        // 计算第一条边长度（点1到点2的距离）
        double L1 = Math.pow(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2),0.5);
        // 计算第二条边长度（点2到点3的距离）
        double L2 = Math.pow(Math.pow(x2-x3, 2)+Math.pow(y2-y3, 2),0.5);
        // 计算第三条边长度（点3到点1的距离）
        double L3 = Math.pow(Math.pow(x3-x1, 2)+Math.pow(y3-y1, 2),0.5);

        // 计算三角形半周长
        double s = (L1+L2+L3)/2;
        // 使用海伦公式计算三角形面积
        double S = Math.pow(s*(s-L1)*(s-L2)*(s-L3), 0.5);

        // 输出三角形面积结果
        System.out.println("The area of the triangle is :"+ S);
        // 关闭Scanner对象（释放资源）
        input.close();
    }
}