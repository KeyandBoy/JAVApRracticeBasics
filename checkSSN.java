import java.util.*;  // 导入java.util包，包含Scanner等工具类

public class checkSSN {  // 定义主类，用于验证SSN（社会保险号）格式
    public static void main(String[] args) {  // 主方法，程序入口
        Scanner scanner = new Scanner(System.in);  // 创建Scanner对象，用于读取用户输入
        // StringBuilder sb = new StringBuilder();  // （注释掉的代码）可用于动态构建字符串
        System.out.println("please input the SSN");  // 提示用户输入SSN
        // sb.append(scanner.nextLine());  // （注释掉的代码）将用户输入添加到StringBuilder
        String ssn = scanner.nextLine();  // 读取用户输入的SSN字符串
        
        // 定义SSN的正则表达式格式：
        // ^\d{3}[-/ ]\d{2}[-/ ]\d{4}$ 
        // 解释：
        // ^\d{3}    - 开头是3位数字
        // [-/ ]      - 分隔符（-、/或空格）
        // \d{2}      - 接着是2位数字
        // [-/ ]      - 同上分隔符
        // \d{4}$     - 结尾是4位数字
        String SSN = "^\\d{3}[-/ ]\\d{2}[-/ ]\\d{4}$";
        
        // 检查输入的SSN是否符合格式要求：
        // 1. 长度是否为11字符（如123-45-6789）
        // 2. 是否匹配正则表达式（允许用-/或空格分隔）
        if (ssn.length() == 11 || ssn.matches(SSN)) { 
            System.out.print("yes");  // 格式正确，输出"yes"
        } else {
            System.out.print("no");   // 格式错误，输出"no"
        }
        
        scanner.close();  // 关闭Scanner，释放资源
    }
}