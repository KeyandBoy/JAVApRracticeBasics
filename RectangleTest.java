import java.util.Scanner; // 导入Scanner类用于用户输入

class Rectangle { // 定义Rectangle类表示矩形
    private double w; // 私有属性：矩形的宽度
    private double h; // 私有属性：矩形的高度
    
    public Rectangle(double w, double h) { // 构造方法
        this.w = w; // 初始化宽度
        this.h = h; // 初始化高度
    }
    
    public double getArea() { // 计算面积的方法
        return w * h; // 返回宽度乘以高度的结果
    }
    
    public double getPerimeter() { // 计算周长的方法
        return 2 * (w + h); // 返回2倍(宽度+高度)的结果
    }
}

public class RectangleTest { // 测试类
    public static void main(String[] args) { // 主方法
        Scanner input = new Scanner(System.in); // 创建Scanner对象
        double w = input.nextDouble(); // 读取用户输入的宽度
        double h = input.nextDouble(); // 读取用户输入的高度
        Rectangle myRectangle = new Rectangle(w, h); // 创建Rectangle对象
        System.out.println(myRectangle.getArea()); // 输出面积
        System.out.println(myRectangle.getPerimeter()); // 输出周长
        input.close(); // 关闭Scanner
    }
}