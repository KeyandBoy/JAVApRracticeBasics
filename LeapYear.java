import java.util.Scanner;  // 导入Scanner类用于获取用户输入

public class LeapYear {
    public static void main(String[] args){
        // 创建Scanner对象读取用户输入
        Scanner input = new Scanner(System.in);
        
        // 提示用户输入年份
        System.out.println("Enter the year: ");
        int year = input.nextInt();  // 读取用户输入的年份
        
        // 闰年判断逻辑：
        // 1. 能被4整除但不能被100整除，或者
        // 2. 能被400整除
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");  // 是闰年
        }
        else {
            System.out.println(year + " is not a leap year.");  // 不是闰年
        }

        // 关闭Scanner对象释放资源
        input.close();
    }
}