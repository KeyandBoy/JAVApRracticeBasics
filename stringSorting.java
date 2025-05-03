import java.util.*;  // 导入Java工具包

public class stringSorting {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);  // 创建扫描器对象读取控制台输入
        System.out.println("Enter the string:");    // 提示用户输入字符串
        String input = scanner.nextLine();         // 读取用户输入的一整行字符串
        scanner.close();                           // 关闭扫描器释放资源

        char[] chars = input.toCharArray();        // 将输入字符串转换为字符数组
        // 冒泡排序算法实现
        for (int i = 0; i < chars.length-1; i++) {          // 外层循环控制排序轮次
            for (int j = 0; j < chars.length-1-i; j++) {    // 内层循环控制每轮比较次数
                if (chars[j]>chars[j+1]) {                  // 比较相邻两个字符的ASCII值
                    char temp;               // 声明临时交换变量
                    temp = chars[j];         // 暂存前一个字符
                    chars[j] = chars[j+1];   // 将后一个字符移到前位置
                    chars[j+1] = temp;       // 将暂存字符移到后位置
                }
            }  
        }
        System.out.println(chars);  // 直接打印排序后的字符数组（会自动转换为字符串格式）
    }
}