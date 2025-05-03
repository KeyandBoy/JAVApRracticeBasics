// 导入Java工具包（包含Scanner等工具类）
import java.util.*;

// 主类定义：实现加法算术题生成和验证
public class additionQuiz {
    // 主程序入口
    public static void main(String[] args){
        // 创建Scanner对象用于读取用户输入
        Scanner input = new Scanner(System.in);

        // 用当前时间戳生成第一个随机数（0-9）
        int num1 = (int)(System.currentTimeMillis() % 10);
        // 用Math.random()生成第二个随机数（0-9）
        int num2 = (int)(Math.random()*10);

        // 通过异或运算检查两数奇偶性是否不同（二进制末位不同）
        if ((num1^num2)==1) {
            // 如果奇偶性不同，不做任何操作
        }
        else{
            // 如果奇偶性相同，将num1减1（确保两数奇偶性不同）
            num1--;
        }

        // 打印加法题目（格式：num1 + num2 = ?）
        System.out.println("What is " +num1 +" + " +num2 +"?");
        // 读取用户输入的答案
        int answer = input.nextInt();
        // 计算正确答案
        int Trueanswer = num1 + num2;

        // 直接输出用户答案是否正确（布尔值）
        System.out.println("your answer is "+(answer == Trueanswer));
        
        // 判断用户答案是否正确
        if (answer != Trueanswer) {
            // 答案错误时显示正确答案
            System.out.println("the real answer is "+Trueanswer);
        }
        else{
            // 答案正确时显示祝贺信息
            System.out.println("congratulations!!");
        }
        // 关闭Scanner对象（释放资源）
        input.close();
    }
}