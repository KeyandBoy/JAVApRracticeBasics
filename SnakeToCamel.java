import java.util.Scanner;  // 导入Scanner类用于获取用户输入

public class SnakeToCamel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // 创建Scanner对象
        
        // 提示用户输入蛇形命名字符串
        System.out.print("snake -> camel (e.g.: this_is_snake_case): ");
        String str1 = scanner.nextLine();  // 读取用户输入的字符串
        
        // 使用StringBuilder构建结果字符串（更高效）
        StringBuilder result = new StringBuilder();

        // 遍历输入字符串的每个字符
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);  // 获取当前字符
            
            // 处理下划线情况（转换为驼峰）
            if (c == '_') {
                i++;  // 跳过下划线，处理下一个字符
                if (i < str1.length()) {  // 确保不越界
                    // 将下划线后的字符转为大写并追加
                    result.append(Character.toUpperCase(str1.charAt(i)));
                }
            } 
            else {
                // 非下划线字符直接追加
                result.append(c);
            }
        }

        // 输出转换结果
        System.out.println(result.toString());
        
        scanner.close();  // 关闭Scanner对象
    }
}