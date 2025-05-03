import java.util.*;

public class stringSubstitution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        // 创建Scanner对象读取控制台输入
        System.out.println("Enter the string:");         // 提示用户输入字符串
        String[] stringArray = new String[10];           // 创建长度为10的字符串数组
        int i = 0;                                       // 初始化数组索引计数器
        while (true) {                                   // 无限循环读取输入
            stringArray[i] = scanner.nextLine();        // 读取用户输入的一行字符串
            if (stringArray[i].equals("end")) {          // 检测到结束标记"end"
                break;                                   // 跳出循环
            }
            i++;                                         // 数组索引递增
        }
        int k = i;                                       // 记录实际存储的字符串数量
        String input = scanner.nextLine();               // 读取要被替换的旧字符串
        String output = scanner.nextLine();              // 读取替换使用的新字符串
        Search(stringArray, input, output,k);            // 执行字符串替换操作
        scanner.close();                                 // 关闭输入流
    }
    
    public static void Search(String[] stringArray, String input, String output, int k) {
        for (int i = 0; i < k; i++) {                    // 遍历前k个有效字符串
            if (stringArray[i].contains(input)) {        // 检查是否包含目标子串
                stringArray[i] = stringArray[i].replace(input, output); // 执行字符串替换
            }
        }
        for (int i = 0; i < k; i++) {                   // 遍历输出元素
            String str = stringArray[i];                 // 获取当前索引的字符串
            System.out.println(str);                     // 打印处理后的字符串
        }
    }
}