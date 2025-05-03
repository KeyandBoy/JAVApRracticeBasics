public class Calculation_Equation {
    public static void main(String[] args){
        
        // 打印方程组信息
        System.out.print("you now:\n");  // 提示信息
        System.out.print("3.4x +50.2y = 44.5\n");  // 第一个方程
        System.out.print("2.1x + .55y = 5.9\n");   // 第二个方程（注意.55等同于0.55）

        // 使用克莱姆法则求解二元一次方程组
        // 计算公式：
        // x = (d1*b2 - d2*b1)/(a1*b2 - a2*b1)
        // y = (a1*d2 - a2*d1)/(a1*b2 - a2*b1)
        // 其中方程组形式为：
        // a1*x + b1*y = d1
        // a2*x + b2*y = d2
        
        // 计算x的值
        double x = (44.5 * .55 - 50.2 * 5.9) / (3.4 * .55 - 50.2 * 2.1);
        // 计算y的值
        double y = (3.4 * 5.9 - 44.5 * 2.1) / (3.4 * .55 - 50.2 * 2.1);

        // 输出结果
        System.out.print("so:\n");  // 结果提示
        System.out.println("x = " + x);  // 输出x的解
        System.out.print("y = " + y);   // 输出y的解
    }
}