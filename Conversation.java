import java.util.Scanner;

public class Conversation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("input your number: ");
        int num = input.nextInt();
        binary(num);
        octonary(num);
        hexadecimal(num);
        input.close();
        
    }
    
    // 十进制转二进制方法
    public static void binary(int num) {
        String hex = "";  // 初始化结果字符串
        
        // 通过除2取余法转换二进制
        while (num != 0) {
            int num2 = num % 2;  // 获取当前位的二进制值
            hex = num2 + hex;    // 将结果拼接到字符串前面
            num = num / 2;       // 移除已处理的最低位
        }
        
        System.out.println("the binary number is " + hex);  // 输出二进制结果
    }
    
    // 十进制转八进制方法
    public static void octonary(int num) {
        String hex = "";  // 初始化结果字符串
        
        // 通过除8取余法转换八进制
        while (num != 0) {
            int num2 = num % 8;  // 获取当前位的八进制值
            hex = num2 + hex;    // 将结果拼接到字符串前面
            num = num / 8;       // 移除已处理的最低位
        }
        
        System.out.println("the octonary number is " + hex);  // 输出八进制结果
    }
    
    // 十进制转十六进制方法
    public static void hexadecimal(int num) {
        String hex = "";  // 初始化结果字符串
        
        // 通过除16取余法转换十六进制
        while (num != 0) {
            int hexValue = num % 16;  // 获取当前位的十六进制值
            
            // 将数值转换为对应的字符（0-9或A-F）
            char hexDigit = (0 < hexValue && hexValue <= 9) ? 
                           (char)(hexValue + '0') :  // 0-9转换为数字字符
                           (char)(hexValue - 10 + 'A');  // 10-15转换为字母A-F
                           
            hex = hexDigit + hex;  // 将字符拼接到字符串前面
            num = num / 16;        // 移除已处理的最低位
        }
        
        System.out.println("the hexadecimal number is " + hex);  // 输出十六进制结果
    }
}