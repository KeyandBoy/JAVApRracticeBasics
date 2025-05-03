import java.util.*;  // 导入java.util包，包含Scanner类

public class MoneyChange {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);  // 创建Scanner对象用于获取用户输入
        
        // 提示用户输入金额
        System.out.println("input the money :");  // 显示输入提示
        double totalMoney = input.nextDouble();  // 读取用户输入的金额
        
        // 将金额转换为分单位的整数
        int loose_change = (int)(totalMoney*100);  // 乘以100转换为分
        
        // 计算元、角、分的数量
        int yiyuan = loose_change/100;  // 计算元的数量（100分=1元）
        int yimao = (loose_change%100)/10;  // 计算角的数量（100分取余后除以10）
        int yifen = loose_change-yimao*10-yiyuan*100;  // 计算剩余分的数量
        
        // 输出换算结果
        System.out.println("you have "+yiyuan+" yuan "+yimao+" jiao "+yifen+" fen");
        
        input.close();  // 关闭Scanner对象
    }
}