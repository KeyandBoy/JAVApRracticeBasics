// 导入Java工具包，包含Arrays和Scanner等工具类
import java.util.*;

// 定义主类，类名使用小驼峰命名法更规范（应改为BinarySearch）
public class binarySearch {
    
    // 主方法，程序入口
    public static void main(String[] args) {
        
        // 创建一个长度为100万的双精度浮点数组
        double[] arry = new double[(int)Math.pow(10, 6)];
        
        // 用随机数填充数组（范围0.0~100000.0）
        for (int i = 0; i < arry.length; i++) {
            arry[i] = Math.random() * 100000; // 生成随机数并赋值
        }
        
        // 创建Scanner对象用于接收用户输入
        Scanner input = new Scanner(System.in);
        
        // // 提示用户输入要查找的值
        // System.out.println("Input the key of the array:");
        // double key = input.nextDouble(); // 读取用户输入的双精度值
        
        long startTime = System.currentTimeMillis(); // 记录开始时间
        double key = arry[(int)(Math.random() * 10)];

        // 对数组进行排序（二分查找的前提条件）
        Arrays.sort(arry);
        // for(double d : arry) {
        //     System.out.print(d + "\t"); // 输出排序后的数组元素
        // }
        long endTime = System.currentTimeMillis(); // 记录结束时间

        // 调用二分查找方法并输出结果
        System.out.println("The key is :"+key+"\n"+"The index of the key is: " + performBinarySearch(arry, key));

        // 输出排序所用时间
        System.out.println("The time of sorting the array is: " + (endTime - startTime) + "ms");

        
        // 关闭Scanner对象释放资源
        input.close();
    }
    

    public static int performBinarySearch(double[] arry, double key) {
        int low = 0;              // 查找范围下限（初始为数组起始）
        int high = arry.length - 1; // 查找范围上限（初始为数组末尾）
        int mid;                  // 中间位置索引
        
        // 当查找范围有效时循环
        while (low <= high) {
            mid = (low + high) / 2; // 计算中间位置
            
            if (key < arry[mid]) {
                high = mid - 1;    // 如果key小于中间值，调整上限
            } 
            else if (key > arry[mid]) {
                low = mid + 1;     // 如果key大于中间值，调整下限
            } 
            else {
                return mid;        // 找到key，返回当前索引
            }
        }
        
        return -1; // 循环结束未找到，返回-1
    }
}