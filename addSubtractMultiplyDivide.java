import java.util.*;  // 导入Java工具包

public class addSubtractMultiplyDivide {  // 定义主类
    public static void main(String[] args) {  // 主方法入口
    
    long StartTime = System.currentTimeMillis();  // 获取当前系统时间(毫秒)


    int count = 0;  // 初始化计数器
    
    Scanner input = new Scanner(System.in);  // 创建Scanner对象用于接收用户输入

    System.out.println("how many you want do?");  // 打印提示信息询问用户要做的题目数量

    int Number_Of_Question = input.nextInt();  // 读取用户输入的题目数量

    for(int i=0;i<Number_Of_Question;i++)  // 循环生成指定数量的题目
    {
        char[] operators = {'+', '-', '*', '/'};  // 定义运算符数组
        int randomIndex = (int) (Math.random() * 4);  // 生成0-3的随机数用于选择运算符
        char operator = operators[randomIndex];  // 获取随机选择的运算符

        int num1 = (int)(Math.random()*10);  // 生成第一个0-9的随机数
        int num2 = (int)(Math.random()*10);  // 生成第二个0-9的随机数

        if (num1<num2) {  // 确保num1不小于num2
            int t;  // 临时变量用于交换值
            t=num1;  // 保存num1的值
            num1=num2;  // 将num2的值赋给num1
            num2=t;  // 将原num1的值赋给num2
        }

        if (operator == '+') {  // 处理加法运算
            System.out.println("what is "+num1+"+"+num2+"?");  // 打印加法题目
            int answer = input.nextInt();  // 读取用户答案
            if (answer == num1+num2) {  // 检查答案是否正确
                System.out.println("correct!");  // 正确提示
                count++;  // 增加正确计数
            }
            else{
                System.out.println("wrong!");  // 错误提示
                System.out.println("the answer is "+(num1+num2));  // 显示正确答案
            }
        }
        else if (operator == '-') {  // 处理减法运算
            System.out.println("what is "+num1+"-"+num2+"?");  // 打印减法题目
            int answer = input.nextInt();  // 读取用户答案
            if (answer == num1-num2) {  // 检查答案是否正确
                System.out.println("correct!");  // 正确提示
                count++;  // 增加正确计数
            }
            else{
                System.out.println("wrong!");  // 错误提示
                System.out.println("the answer is "+(num1-num2));  // 显示正确答案
            }
        }
        else if (operator == '*') {  // 处理乘法运算
            System.out.println("what is "+num1+"*"+num2+"?");  // 打印乘法题目
            int answer = input.nextInt();  // 读取用户答案
            if (answer == num1*num2) {  // 检查答案是否正确
                System.out.println("correct!");  // 正确提示
                count++;  // 增加正确计数
            }
            else{
                System.out.println("wrong!");  // 错误提示
                System.out.println("the answer is "+(num1*num2));  // 显示正确答案
            }
        }
        else if (operator == '/') {  // 处理除法运算
            if(num2==0)  // 确保除数不为0
            {
                num2 = (int)(Math.random()*10);  // 重新生成除数
            }
            if (num1%num2!=0) {  // 确保能整除
                num1=num1*num2;  // 调整被除数
            }
            System.out.println("what is "+num1+"/"+num2+"?");  // 打印除法题目
            int answer = input.nextInt();  // 读取用户答案
            if (answer == num1/num2) {  // 检查答案是否正确
                System.out.println("correct!");  // 正确提示
                count++;  // 增加正确计数
            }
            else{
                System.out.println("wrong!");  // 错误提示
                System.out.println("the answer is "+(num1/num2));  // 显示正确答案
            }
        input.close();  // 关闭Scanner对象
        }
    }
    long EndTime = System.currentTimeMillis();  // 获取结束时间
    long Time = (EndTime - StartTime)/1000;  // 计算用时(秒)
    int get = count/Number_Of_Question*100;  // 计算正确率百分比
    System.out.println("you got"+count+"questions right,"+"you get "+get+" cents");  // 打印成绩
    System.out.println("you use "+Time+" seconds");  // 打印用时
        
}
}