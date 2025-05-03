import java.util.*;  // 导入java.util包，包含Scanner类

public class DisPlayTime {
    public static void main(String[] args){
        // 定义常量：1分钟=60秒
        final int Sec = 60;  // 使用全大写命名常量，表示不可修改的值

        // 创建Scanner对象获取用户输入
        Scanner input = new Scanner(System.in);
        
        // 提示用户输入秒数
        System.out.print("input the time:");  // 提示信息
        int seconds = input.nextInt();  // 读取用户输入的秒数

        // 计算分钟和秒数
        int min = seconds / Sec;  // 计算完整分钟数（整除60）
        int second = seconds % Sec;  // 计算剩余的秒数（取模60）

        // 输出转换结果
        System.out.println(seconds + " is " + min +" minutes and " +second +" seconds");
        
        // 关闭Scanner对象释放资源
        input.close();
    }
}