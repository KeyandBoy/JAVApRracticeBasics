import java.util.Scanner;  // 导入Scanner类用于获取用户输入

public class Camel_to_snake {
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  // 创建Scanner对象读取控制台输入
        System.out.print("camel -> snake (e.g.: thisIsCamelCase): ");  // 提示用户输入驼峰命名字符串
        String str1 = scanner.nextLine();  // 读取用户输入的字符串
        scanner.close();  // 关闭Scanner对象释放资源

        // 遍历字符串中的每个字符
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);  // 获取当前位置的字符
            
            // 判断字符是否为大写字母
            if (Character.isUpperCase(c)) {
                // 如果是大写字母，先输出下划线，再输出小写形式
                System.out.print("_" + Character.toLowerCase(c));
            } 
            else {
                // 如果不是大写字母，直接输出原字符
                System.out.print(c);
            }
        }
    }
}