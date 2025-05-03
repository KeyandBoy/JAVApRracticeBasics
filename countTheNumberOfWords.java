import java.util.*;
// 主类定义：计算单词数量

public class countTheNumberOfWords {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); // 创建Scanner对象用于读取用户输入
        System.out.print("Enter: "); // 提示用户输入字符串
        String str = input.nextLine(); // 读取用户输入的字符串
        int count = 0; // 初始化单词计数器

        // 使用正则表达式分割字符串，匹配空格、制表符和换行符
        String[] words = str.split("[\\s]+"); // 分割字符串为单词数组

        // 遍历单词数组，统计非空单词的数量
        for (String word : words) {
            if (!word.isEmpty()) { // 检查单词是否非空
                count++; // 增加计数器
            }
        }

        System.out.println("The number of words is: " + count); // 输出单词数量
        input.close(); // 关闭Scanner对象（释放资源）
    }
}
