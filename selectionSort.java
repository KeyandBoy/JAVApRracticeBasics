import java.util.*; // 导入工具包，包含Scanner类

public class selectionSort { // 定义选择排序主类
    public static void main(String[] args) { // 主方法入口
        System.out.print("chose the type\n1.double\t2.char\t3.string\n"); // 输出类型选择菜单
        // 注意：菜单项对齐可能因终端设置不同而显示不整齐
        Scanner input = new Scanner(System.in); // 创建输入扫描器
        int type = input.nextInt(); // 读取用户选择的类型编号
        switch (type) { // 根据类型选择分支
            case 1:SELECTIONGSORTDouble(); // 调用double类型排序
                break; // 退出switch
            case 2: // char类型分支
                SELECTIONGSORTChar(); // 调用char类型排序
                break; // 退出switch
            case 3: // string类型分支
                SELECTIONGSORTString(); // 调用string类型排序
                break; // 退出switch
            default: // 无效输入处理
                break; // 直接退出（建议添加错误提示）
        }
        input.close(); // 关闭扫描器（应在所有输入操作完成后调用）
    }

    public static void SELECTIONGSORTDouble() { // double类型排序方法
        System.out.println("Please input the length of the array:"); // 提示输入数组长度
        Scanner input = new Scanner(System.in); // 创建新扫描器（与主方法重复创建）
        int length = input.nextInt(); // 读取数组长度
        Double[] arry = new Double[length]; // 创建Double数组
        System.out.println("Please input the elements of the array:"); // 提示输入数组元素
        for (int i = 0; i < length; i++) { // 遍历数组
            arry[i] = input.nextDouble(); // 读取每个double元素
        }
        long startTime = System.currentTimeMillis(); // 记录开始时间
        SELECTIONGSORT(arry); // 调用泛型排序
        long endTime = System.currentTimeMillis(); // 记录结束时间
        System.out.println("The sorted array is:"); // 输出排序结果提示
        for (Double d : arry) { // 遍历已排序数组
            System.out.print(d + "\t"); // 输出元素（制表符分隔）
        }
        System.out.println("\nThe time of sorting the array is: " + (endTime - startTime) + "ms"); // 输出耗时
        input.close(); // 关闭扫描器
    }

    public static void SELECTIONGSORTChar() { // char类型排序方法
        System.out.println("Please input the length of the array:"); // 同上
        Scanner input = new Scanner(System.in); // 重复创建扫描器
        int length = input.nextInt(); // 读取长度
        Character[] arry = new Character[length]; // 创建Character数组
        System.out.println("Please input the elements of the array:"); // 提示输入
        for (int i = 0; i < length; i++) { // 遍历数组
            arry[i] = input.next().charAt(0); // 读取第一个字符（可能丢失后续字符）
        }
        long startTime = System.currentTimeMillis(); // 记录时间
        SELECTIONGSORT(arry); // 调用排序
        long endTime = System.currentTimeMillis(); // 记录时间
        System.out.println("The sorted array is:"); // 输出提示
        for (Character d : arry) { // 遍历结果
            System.out.print(d + "\t"); // 输出字符
        }
        System.out.println("\nThe time of sorting the array is: " + (endTime - startTime) + "ms"); // 输出耗时
        input.close(); // 关闭扫描器
    }

    public static void SELECTIONGSORTString() { // string类型排序方法
        System.out.println("Please input the length of the array:"); // 提示输入
        Scanner input = new Scanner(System.in); // 创建扫描器
        int length = input.nextInt(); // 读取长度
        String[] arry = new String[length]; // 创建字符串数组
        System.out.println("Please input the elements of the array:"); // 提示输入
        for (int i = 0; i < length; i++) { // 遍历数组
            arry[i] = input.nextLine(); // 读取整行（注意可能读取空行）
        }
        long startTime = System.currentTimeMillis(); // 记录时间
        SELECTIONGSORT(arry); // 调用排序
        long endTime = System.currentTimeMillis(); // 记录时间
        System.out.println("The sorted array is:"); // 输出提示
        for (String d : arry) { // 遍历结果
            System.out.print(d + "\t"); // 输出字符串
        }
        System.out.println("\nThe time of sorting the array is: " + (endTime - startTime) + "ms"); // 输出耗时
        input.close(); // 关闭扫描器
    }

    public static <T extends Comparable<T>> void SELECTIONGSORT(T[] arry) {
        for (int i = 0; i < arry.length - 1; i++) {
            int minIndex = i; // 记录最小值索引
            for (int j = i + 1; j < arry.length; j++) {
                if (arry[minIndex].compareTo(arry[j]) > 0) {
                    minIndex = j; // 更新最小值索引
                }
            }
            // 内层循环结束后，交换当前元素与最小值
            T temp = arry[minIndex];
            arry[minIndex] = arry[i];
            arry[i] = temp;
        }
    }
}