import java.util.*;  // 导入java.util包，包含Scanner类

public class numberTimesOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // 创建Scanner对象用于获取用户输入
        
        // // 提示用户输入字符串和数字
        // System.out.println("Enter the String and number: ");
        // String input = scanner.nextLine();  // 读取整行输入，例如 "Hello World"
        
        // // 按空格分割字符串（支持多个空格）
        // String[] parts = input.split("\\s+"); 
        
        // // 提取第一个和第二个字符串
        // String str = parts[0];  // 获取输入的主字符串
        // String n = parts.length > 1 ? parts[1] : "";  // 获取要查找的字符（如果存在）

        System.out.println("Enter the String and number: ");
        String str = scanner.next();  // 读取字符串
        char n = scanner.next().charAt(0);  // 读取第一个字符作为查找目标

        // 检查字符是否存在于字符串中
        if (nInStr(str,String.valueOf(n))) {
            int k = TimesOfString(str,String.valueOf(n));  // 计算字符出现次数
            System.out.println("The number of occurrences is " +k +".");
        }
        else{
            System.out.println("Zero number in occurrences.");
        }
        scanner.close();  // 关闭Scanner对象
    }

    // 检查字符是否存在于字符串中
    public static boolean nInStr(String str, String n) {
        // 处理空字符情况
        // if (n.isEmpty()) {
        //     return false;
        // }
        // 遍历字符串检查字符是否存在
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == n.charAt(0)) {
                return true;
            }
        }
        return false;
    }

    // 计算字符在字符串中出现的次数
    public static int TimesOfString(String str,String n) {
        int count = 0;
        // 处理空字符情况
        // if (n.isEmpty()) {
        //     return 0;
        // }
        // 遍历字符串统计字符出现次数
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == n.charAt(0)) {
                count++;
            }
        }     return count;
    }
}