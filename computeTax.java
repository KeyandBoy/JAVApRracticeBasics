import java.util.*;  // 导入工具类

public class computeTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // 创建Scanner对象用于输入
        
        // 税率表（6个税率等级）
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        
        // 不同申报状态的税收区间（单位：美元）
        int[][] brackets = {
            {0, 8350, 33950, 82250, 171550, 372950},    // 1-单身
            {0, 16700, 67900, 137050, 208850, 372950},  // 2-已婚共同申报
            {0, 8350, 33950, 68525, 104425, 186475},    // 3-已婚分开申报
            {0, 11950, 45500, 117450, 190200, 372950},  // 4-户主
        };
        
        // 显示申报状态菜单
        System.out.print("请选择申报状态: \n" +
                "1 - 单身\n" +
                "2 - 已婚共同申报\n" +
                "3 - 已婚分开申报\n" +
                "4 - 户主\n" +
                "请输入选择: ");
        int status = input.nextInt();  // 读取用户选择的申报状态
        
        System.out.print("请输入应纳税所得额: ");
        double income = input.nextDouble();  // 读取应纳税所得额
        
        double tax = 0;  // 初始化应纳税额
        
        // 根据申报状态选择对应的税率区间
        if (status == 1) {
            tax = calculateTax(income, brackets[0], rates);
        } 
        else if (status == 2) {
            tax = calculateTax(income, brackets[1], rates);
        } 
        else if (status == 3) {
            tax = calculateTax(income, brackets[2], rates);
        } 
        else if (status == 4) {
            tax = calculateTax(income, brackets[3], rates);
        } 
        else {
            System.out.println("错误: 无效的申报状态");
            System.exit(1);  // 非正常退出程序
        }
        
        System.out.printf("应缴税款: $%.2f\n", tax);  // 输出计算结果
        input.close();  // 关闭Scanner
    }

    
    //  修复后的正确计税方法
    //  income 应纳税所得额
    //  brackets 当前申报等级的税收区间
    //  rates 税率表
    //  计算后的应纳税额
     
    public static double calculateTax(double income, int[] brackets, double[] rates) {
        double tax = 0;  // 初始化总税款
        
        // 从最低税率等级开始计算（0级到5级）
        for (int i = 1; i < brackets.length; i++) {
            // 如果收入超过当前区间的上限
            if (income > brackets[i]) {
                // 计算当前区间的差额税款
                tax += (brackets[i] - brackets[i-1]) * rates[i-1];
            } else {
                // 计算剩余部分的税款
                tax += (income - brackets[i-1]) * rates[i-1];
                break;  // 已计算完所有需要纳税的部分
            }
        }
        
        // 处理超过最高税率区间的情况
        if (income > brackets[brackets.length - 1]) {
            tax += (income - brackets[brackets.length - 1]) * rates[rates.length - 1];
        }
        
        return tax;
    }
}