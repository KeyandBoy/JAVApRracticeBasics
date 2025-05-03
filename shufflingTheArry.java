import java.util.*; // 导入java.util包，包含Scanner和Random等工具类

public class shufflingTheArry { // 定义主类shufflingTheArry
    public static void main(String[] args) { // 主方法入口
        double[] arry ; // 声明double类型数组
        Scanner input = new Scanner(System.in); // 创建Scanner对象用于接收用户输入
        System.out.println("Input the length"); // 提示用户输入数组长度
        int n = input.nextInt(); // 读取用户输入的数组长度
        arry = new double[n]; // 根据用户输入的长度初始化数组
        
        // 循环读取数组元素
        for (int i = 0; i < arry.length; i++) { // 遍历数组
            arry[i] = input.nextDouble(); // 读取用户输入的double值并存入数组
        }
        
        arry = shuffling(arry); // 调用shuffling方法打乱数组顺序
        System.out.println("Out put the shuffling arry  :"); // 输出提示信息
        
        // 输出打乱后的数组
        for (int i = 0; i < arry.length; i++) { // 遍历数组
            System.out.print(arry[i]+"\t"); // 输出数组元素，用制表符分隔
        }
        input.close(); // 关闭Scanner对象释放资源
    }
    
    // 数组洗牌方法
    public static double[] shuffling(double arry[]) { // 接收double数组参数
        for (int i = 0; i < arry.length; i++) { // 遍历数组
            int j = (int)(Math.random()*arry.length); // 生成随机索引
            double temp = arry[j]; // 临时变量保存arry[j]的值
            arry[j] = arry[i]; // 交换元素
            arry[i] = temp; // 完成交换
        }
        return arry; // 返回打乱后的数组
    }
}