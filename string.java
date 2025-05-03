import java.util.Scanner; // 导入Scanner类用于用户输入

public class string { // 定义主类string
    public static void main(String[] args) { // 主方法入口
        Scanner sc = new Scanner(System.in); // 创建Scanner对象用于接收用户输入
        String str = sc.nextLine(); // 读取用户输入的一行文本，保存为String对象
        
        // 使用StringBuilder进行字符串操作（非线程安全但性能更高）
        StringBuilder str1 = new StringBuilder(str); // 基于原始字符串创建StringBuilder
        str1.append(" bo"); // 在StringBuilder末尾追加字符串" bo"
        
        // 使用StringBuffer进行字符串操作（线程安全）
        StringBuffer str2 = new StringBuffer(str1); // 基于StringBuilder创建StringBuffer
        str2.append(" kai"); // 在StringBuffer末尾追加字符串" kai"
       
        // 输出各种字符串对象的内容
        System.out.println("String: " + str); // 输出原始String对象
        System.out.println("StringBuilder: " + str1); // 输出StringBuilder对象
        System.out.println("StringBuffer: " + str2); // 输出StringBuffer对象
        
        // 输出各字符串的长度
        System.out.println("String length: " + str.length()); // 原始String长度
        System.out.println("StringBuilder length: " + str1.length()); // StringBuilder长度
        System.out.println("StringBuffer length: " + str2.length()); // StringBuffer长度
        
        sc.close(); // 关闭Scanner对象释放资源
    }
}