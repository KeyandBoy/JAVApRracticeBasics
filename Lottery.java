import java.util.*;  // 导入java.util包，包含Scanner类

public class Lottery {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);  // 创建Scanner对象用于获取用户输入
        
        // 生成两个随机数字作为中奖号码
        int num1 = (int)(System.currentTimeMillis()%10);  // 使用当前时间毫秒数生成第一个随机数(0-9)
        int num2 = (int)(Math.random()*10);  // 使用Math.random()生成第二个随机数(0-9)
        
        // 获取用户猜测的两个数字
        System.out.println("input your guess:");  // 提示用户输入猜测数字
        int guess1 = input.nextInt();  // 读取第一个猜测数字
        int guess2 = input.nextInt();  // 读取第二个猜测数字
        
        // 判断中奖情况
        if (num1 == guess1 && num2 == guess2) {
            // 完全匹配（顺序和数字都正确）
            System.out.println("congratulations!\nyou get 10000 dollar!");  // 一等奖
        }
        else if (num1 == guess2 && num2 == guess1) {
            // 数字正确但顺序相反
            System.out.println("congratulations!\nyou get 3000 dollar!");  // 二等奖
        }
        else if(num1 == guess1 || num1 == guess2 || num2 == guess1 || num2 == guess2){
            // 只猜中一个数字
            System.out.println("congratulations!\nyou get 1000 dollar!");  // 三等奖
        }
        else{
            // 没有猜中任何数字
            System.out.println("sorry,it is too bad");  // 未中奖
        }

        input.close();  // 关闭Scanner对象
    }
}