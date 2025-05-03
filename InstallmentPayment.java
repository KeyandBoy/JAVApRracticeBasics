import java.util.*;  // 导入java.util包，包含Scanner类

public class InstallmentPayment {
    public static void main(String[] args) {
        // 创建Scanner对象获取用户输入
        Scanner input = new Scanner(System.in);
        
        // 获取贷款信息
        System.out.println("Enter the amount of the loan: ");  // 提示输入贷款金额
        double loan = input.nextDouble();  // 读取贷款金额
        System.out.println("Enter the number of year: ");  // 提示输入贷款年限
        int year = input.nextInt();  // 读取贷款年限
        System.out.println("Enter the interest rate: ");  // 提示输入年利率
        double YearRate = input.nextDouble();  // 读取年利率
        
        // 计算月利率
        double MonthRate = YearRate/1200;  // 将年利率转换为月利率(除以12个月和100%)
        
        // 计算每月还款额(等额本息公式)
        double monthlyPayment = loan*(MonthRate*Math.pow(1+MonthRate,year*12))/(Math.pow(1+MonthRate,year*12)-1);
        
        // 计算总还款额(本金+总利息)
        double totalPayment = loan + loan * YearRate;
        
        // 输出还款计划摘要
        System.out.println("Monthly payment: " + monthlyPayment);  // 显示月供
        System.out.println("Total payment: " + totalPayment);  // 显示总还款额
        
        // 初始化贷款余额
        double new_loan = loan;  // 剩余贷款金额初始化为贷款总额
        
        // 打印还款计划表头
        System.out.printf("%-8s %-12s %-12s %-12s%n","Payment#", "Interest", "Principal", "Balance");
        
        // 生成每月还款明细
        for(int i=1; i<=year*12; i++){
            double interest = new_loan*MonthRate;  // 计算当月利息
            double Principal = monthlyPayment-interest;  // 计算当月本金
            new_loan = new_loan - Principal;  // 更新剩余贷款金额
            // 格式化输出每月还款明细(使用绝对值确保余额显示为正数)
            System.out.printf("%-8d %-12.2f %-12.2f %-12.2f%n", i, interest, Principal, Math.abs(new_loan));
        }
        
        // 关闭Scanner对象
        input.close();  // 释放系统资源
    }
}