import java.util.Scanner;  // 导入Scanner类用于获取用户输入

public class BMI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);  // 创建Scanner对象用于读取控制台输入

        // 读取整行输入并按逗号分割
        String line = input.nextLine().trim();  // 读取用户输入并去除首尾空格
        String[] parts = line.split(",");       // 按逗号分割字符串得到字符串数组
        
        // 解析数值（处理可能的格式问题）
        double high = Double.parseDouble(parts[0]);   // 将第一个元素转换为double类型作为身高(米)
        double weight = Double.parseDouble(parts[1]);  // 将第二个元素转换为double类型作为体重(千克)

        // 计算BMI值
        double BMI = weight / (high * high);  // BMI公式：体重(kg)除以身高(m)的平方

        // 输出BMI数值（保留2位小数）
        System.out.printf("BMI数值为：%.2f",BMI);  // 格式化输出BMI值
        System.out.printf("\n");                  // 换行
        
        // 国际BMI标准判断
        if( BMI>0 && BMI<18.5) {
            System.out.print("BMI指标为：国际'偏瘦'，");  // 国际标准偏瘦范围
        }
        else if ( BMI<25) {
            System.out.print("BMI指标为：国际'正常'，");  // 国际标准正常范围
        }
        else if ( BMI<30) {
            System.out.print("BMI指标为：国际'偏胖'，");  // 国际标准偏胖范围
        }
        else {
            System.out.print("BMI指标为：国际'肥胖'，");  // 国际标准肥胖范围
        }    
        
        // 国内BMI标准判断
        if( BMI>0 && BMI<18.5) {
            System.out.print("国内'偏瘦'");  // 国内标准偏瘦范围
        }
        else if ( BMI<24) {
            System.out.print("国内'正常'");  // 国内标准正常范围
        }
        else if ( BMI<28) {
            System.out.print("国内'偏胖'");  // 国内标准偏胖范围
        }
        else {
            System.out.print("国内'肥胖'");  // 国内标准肥胖范围
        }
        
        input.close();  // 关闭Scanner对象释放资源
    }
}