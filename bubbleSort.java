import java.util.*; // 导入java.util包，包含Scanner等工具类

public class bubbleSort {
    public static void main(String[] args) {
        System.out.print("chose the type:\n1.double\n2.char\n3.string\nyou chose: "); // 提示用户选择排序对象类型
        // 提示用户输入排序对象类型
        Scanner input = new Scanner(System.in); // 创建Scanner对象用于接收用户输入
        int type = input.nextInt(); // 读取用户输入的排序对象类型
        switch (type) {
            case 1:bubbleSortDouble(); // 调用排序方法对double型数组进行排序
                break;
            case 2:
                bubbleSortChar(); // 调用排序方法对char型数组进行排序
                break;
            case 3:
                bubbleSortString(); // 调用排序方法对String型数组进行排序
                break;
            default:
                break;
        }
        input.close(); // 关闭Scanner对象释放资源
    }
    public static void bubbleSortDouble() {
        System.out.println("Please input the length of the array:");
        Scanner input = new Scanner(System.in); // 创建Scanner对象用于接收用户输入
        int length = input.nextInt(); // 读取用户输入的数组长度
        Double[] arry = new Double[length]; // 创建一个指定长度的双精度浮点数组
        System.out.println("Please input the elements of the array:");
        for (int i = 0; i < length; i++) {
            arry[i] = input.nextDouble(); // 读取用户输入的数组元素
        }
        long startTime = System.currentTimeMillis(); // 记录开始时间
        BUBBLESORT(arry); // 调用选择排序方法对数组进行排序
        long endTime = System.currentTimeMillis(); // 记录结束时间
        System.out.println("The sorted array is:");
        for (Double d : arry) {
            System.out.print(d + "\t"); // 输出排序后的数组元素
        }
        System.out.println("\nThe time of sorting the array is: " + (endTime - startTime) + "ms"); // 输出排序所用时间
        input.close(); // 关闭Scanner对象释放资源
    }
    public static void bubbleSortChar() {
        System.out.println("Please input the length of the array:");
        Scanner input = new Scanner(System.in); // 创建Scanner对象用于接收用户输入
        int length = input.nextInt(); // 读取用户输入的数组长度
        Character[] arry = new Character[length]; // 创建一个指定长度的双精度浮点数组
        System.out.println("Please input the elements of the array:");
        for (int i = 0; i < length; i++) {
            arry[i] = input.next().charAt(0); // 读取用户输入的数组元素
        }
        long startTime = System.currentTimeMillis(); // 记录开始时间
        BUBBLESORT(arry); // 调用选择排序方法对数组进行排序
        long endTime = System.currentTimeMillis(); // 记录结束时间
        System.out.println("The sorted array is:");
        for (Character d : arry) {
            System.out.print(d + "\t"); // 输出排序后的数组元素
        }
        System.out.println("\nThe time of sorting the array is: " + (endTime - startTime) + "ms"); // 输出排序所用时间
        input.close(); // 关闭Scanner对象释放资源
    }
    public static void bubbleSortString() {
        System.out.println("Please input the length of the array:");
        Scanner input = new Scanner(System.in); // 创建Scanner对象用于接收用户输入
        int length = input.nextInt(); // 读取用户输入的数组长度
        String[] arry = new String[length]; // 创建一个指定长度的双精度浮点数组
        System.out.println("Please input the elements of the array:");
        for (int i = 0; i < length; i++) {
            arry[i] = input.nextLine(); // 读取用户输入的数组元素
        }
        long startTime = System.currentTimeMillis(); // 记录开始时间
        BUBBLESORT(arry); // 调用选择排序方法对数组进行排序
        long endTime = System.currentTimeMillis(); // 记录结束时间
        System.out.println("The sorted array is:");
        for (String d : arry) {
            System.out.print(d + "\t"); // 输出排序后的数组元素
        }
        System.out.println("\nThe time of sorting the array is: " + (endTime - startTime) + "ms"); // 输出排序所用时间
        input.close(); // 关闭Scanner对象释放资源
    }
    public static <T extends Comparable<T>> void BUBBLESORT(T[] arry) {
        for (int i = 0; i < arry.length-1; i++) {
           for (int j = 0; j < arry.length-1-i; j++) {
                if (arry[j].compareTo(arry[j+1])==1) { // 判断是否需要交换
                    T temp = arry[j]; // 交换元素
                    arry[j] = arry[j+1];
                    arry[j+1] = temp;
                }
           }
            }
        }
          
}
