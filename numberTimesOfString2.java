import java.util.Scanner;

public class numberTimesOfString2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // 获取用户输入：字符串和要查找的字符
        System.out.print("Enter a string and a character to count: ");
        String str = input.next();  // 读取字符串
        char ch = input.next().charAt(0);  // 读取第一个字符作为查找目标

        
        // 调用count方法统计字符出现次数
        int result = count(str, ch);
        
        // 输出统计结果
        System.out.println("The number of occurrences is " + result + ".");
       // System.out.println("The number of occurences is "+result+".");
       input.close();  // 关闭Scanner
    }
    // 统计指定字符在字符串中出现的次数
    // str - 要搜索的字符串
    // a - 要查找的字符
    // 返回字符出现的次数
    public static int count(String str, char a) {
        int num = 0;  // 计数器初始化为0
        
        // 遍历字符串的每个字符
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == a) {  // 如果找到匹配字符
                num++;  // 计数器加1
            }
        }
        
        return num;  // 返回统计结果
    }
}