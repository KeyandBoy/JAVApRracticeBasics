import java.util.*; // 导入java.util包，包含Scanner类

public class findTheBiggestNumberInArry_Mark { // 定义主类
    public static void main(String[] args) { // 主方法入口
        double[] arry; // 声明double类型数组
        Scanner input = new Scanner(System.in); // 创建Scanner对象用于接收用户输入
        System.out.println("Input the length"); // 提示用户输入数组长度
        int n = input.nextInt(); // 读取用户输入的数组长度
        arry = new double[n]; // 根据用户输入的长度初始化数组
        
        // 循环读取数组元素
        for (int i = 0; i < arry.length; i++) { // 遍历数组
            System.out.println("Input the " + i + " number:"); // 提示输入第i个数字
            arry[i] = input.nextDouble(); // 读取用户输入的double值并存入数组
        }
        
        // 输出结果
        System.out.println("the max number is :" + Max(arry)); // 调用Max方法并输出最大值
        System.out.println("the mark is number " + Mark(arry, Max(arry))); // 调用Mark方法并输出最大值的位置
        input.close(); // 关闭Scanner对象释放资源
    }
    
    // 查找数组最大值的方法
    public static double Max(double arry[]) { // 接收double数组参数
        double Max = arry[0]; // 假设第一个元素为最大值
        for (int i = 0; i < arry.length; i++) { // 遍历数组
            if (Max < arry[i]) { // 如果当前元素大于Max
                Max = arry[i]; // 更新Max值
            }
        }
        return Max; // 返回最大值
    }
    
    // 查找最大值位置的方法
    public static int Mark(double arry[], double Max) { // 接收数组和最大值参数
        int Mark = 0; // 初始化位置标记
        for (int i = 0; i < arry.length; i++) { // 遍历数组
            if (Max == arry[i]) { // 找到最大值
                Mark = i + 1; // 记录位置（从1开始计数）
            }
        }
        return Mark; // 返回最大值的位置
    }
}