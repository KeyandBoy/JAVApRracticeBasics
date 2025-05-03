import java.util.Scanner;

public class Compute_Tax {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);  // 创建Scanner对象用于控制台输入

        // Prompt user to enter filing status
        System.out.print("0-single filer, 1-married jointly or " +
                "qualifying widow(er), 2-married separately, 3-head of " +
                "household\nEnter the filing status: ");  // 显示报税状态选项
        int status = input.nextInt();  // 读取用户输入的报税状态

        // Prompt user to enter taxable income
        System.out.print("Enter the taxable income: ");  // 提示输入应纳税收入
        double income = input.nextDouble();  // 读取用户输入的收入金额

        // Compute tax
        double tax = 0;  // 初始化税额为0

        switch (status) {  // 根据报税状态计算税额
            case 0:  // 单身纳税人
                if (income <= 8350)
                    tax = income * 0.10;
                else if (income <= 33950)
                    tax = 8350 * 0.10 + (income - 8350) * 0.15;
                else if (income <= 82250)
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
                else if (income <= 171550)
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
                else if (income <= 372950)
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
                else
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + 
                  (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
                break;
            case 1:  // 已婚共同申报
                if (income <= 16700)
                    tax = income * 0.10;
                else if (income <= 67900)
                    tax = 16700 * 0.10 + (income - 8350) * 0.15;  // 注意：此处应为(income - 16700)
                else if (income <= 137050)
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;
                else if (income <= 208850)
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (income - 137050) * 0.28;
                else if (income <= 372950)
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (income - 171550) * 0.33;  // 注意：此处应为(income - 208850)
                else
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + 
                  (208850 - 137050) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;  // 注意：此处应为(372950 - 208850)
                // 注意：此处缺少break语句
            case 2:  // 已婚分开申报
                if (income <= 8350)
                    tax = income * 0.10;
                else if (income <= 33950)
                    tax = 8350 * 0.10 + (income - 8350) * 0.15;
                else if (income <= 68525)
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
                else if (income <= 104425)
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68925 - 33950) * 0.25 + (income - 68925) * 0.28;  // 注意：变量名应为68525
                else if (income <= 186475)
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68925 - 33950) * 0.25 + (104425 - 68925) * 0.28 + (income - 104425) * 0.33;
                else
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68925 - 33950) * 0.25 + (104425 - 68925) * 0.28 + (186475 - 104425) * 0.33 + (income - 186475) * 0.35;
                break;
            case 3:  // 户主
                if (income <= 11950)
                    tax = income * 0.10;
                else if (income <= 45500)
                    tax = 11950 * 0.10 + (income - 11950) * 0.15;
                else if (income <= 117450)
                    tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (income - 45500) * 0.25;
                else if (income <= 190200)
                    tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (income - 117451) * 0.28;  // 注意：此处应为117450
                else if (income <= 372950)
                    tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117451) * 0.28 + (income - 190201) * 0.33;  // 注意：此处应为190200
                else
                    tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117451) * 0.28 + (372950 - 190201) * 0.33 + (income - 372950) * 0.35;  // 注意：此处应为190200
                // 注意：此处缺少break语句
            default:  // 无效状态
                System.out.println("error!!");  // 输出错误信息
                break;
        } 

        System.out.println("Tax is "+ tax);  // 输出计算结果
        input.close();  // 关闭Scanner对象
    }
}