import java.util.*;  // 导入java.util包，包含Scanner等工具类

public class sumNumberInStrings {  // 定义主类
    public static void main(String[] args) {  // 主方法，程序入口
        Scanner input = new Scanner(System.in);  // 创建Scanner对象，用于读取用户输入
        int sum = 0;  // 初始化求和变量sum，用于累加数字字符的值
        String str = input.nextLine();  // 读取用户输入的第一行字符串
        
        // 使用while循环，当输入的不是"end"时继续执行
        while (!str.equals("end")) {  
            // 遍历当前字符串的每一个字符
            for (int i = 0; i < str.length(); i++) {  
                char c = str.charAt(i);  // 获取字符串中第i个字符
                if (Character.isDigit(c)) {  // 判断该字符是否是数字
                    sum += Character.getNumericValue(c);  // 如果是数字，将其数值加到sum中
                } 
            }
            
            System.out.println(sum);  // 输出当前字符串中所有数字字符的累加和
            sum = 0;  // 重置sum为0，准备处理下一行输入
            str = input.nextLine();  // 读取下一行输入
        }
        input.close();
    }
}