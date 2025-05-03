import java.util.Scanner;

public class LegitimateCreditCardNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please input the card ID:"); // 提示用户输入信用卡号
        long number = input.nextLong();  // 输入信用卡号
        if (isValid(number)) {
            System.out.println(    
                number+" is"+" valid");  // 如果有效，输出有效信息
        } 
        else 
        {
            System.out.println(number+" is"+" not valid");
        }
        
        input.close();
    }

    // 检查卡号长度、前缀和算法
    public static boolean isValid(long number) {
        return(getSize(number)<=16&&getSize(number)>=13&&prefixMatched(number,getSize(number))&&(sumOfOddPlace(number)+sumOfDoubleEvenPlace(number))%10==0);
    }

    // 处理偶数位数字：从右往左数，每个数字×2后拆分相加
    // public static int sumOfDoubleEvenPlace(long number) {
    //     int d = getSize(number);
    //     int sumO = 0; // 偶数位数字和
    //     for (int j = 1; j < d; ) {
    //         int digit = (int) (number / Math.pow(10, j)) % 10; // 获取偶数位数字
    //         int temp = digit * 2; // 乘2
    //         while (temp>9) {
    //             temp = getDigit(temp); // 拆分两位数
    //         }
    //         sumO += temp; // 累加
    //         j+=2; // 每次跳过一个数字
    //     }
        
    //     return sumO;// 返回偶数位数字和
    // }
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        number /= 10; // 从右往左，跳过第一位（奇数位）
        while (number > 0) {
            int digit = (int) (number % 10);
            digit *= 2;
            sum += (digit / 10) + (digit % 10); // 拆分两位数为个位数相加
            number /= 100; // 移动到下一个偶数位
        }
        return sum;
    }
    
    // 累加奇数位数字：从右往左数的奇数位直接相加
    // public static int sumOfOddPlace(long number) {
    //     // 待实现：遍历奇数位求和
    //     int d = getSize(number);
    //     int sumJ = 0; // 奇数位数字和
    //     sumJ += number%10;
    //     for (int j = 2; j < d; ) {
    //         int digit = (int) (number / Math.pow(10, j)) % 10; // 获取奇数位数字
    //         sumJ += digit; // 累加
    //         j+=2; // 每次跳过一个数字
    //     }
    //     return sumJ; // 返回奇数位数字和
    // }
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10; // 直接累加奇数位
            number /= 100; // 移动到下一个奇数位
        }
        return sum;
    }

    // 验证卡号是否以指定数字开头
    public static boolean prefixMatched(long number, int d) {
        if (getPrefix(number,1)==4||
            getPrefix(number,1)==5||
            getPrefix(number,1)==6||
            getPrefix(number,2)==37) 
            {
                return true;
            }
        else
            return false;
    }

    // 计算卡号位数：确定输入数字的长度
    public static int getSize(long d) {
        if (d == 0) return 1; // 处理0的特殊情况
        if (d < 0) return 0;  // 处理负数
    
        int length = 0;
        while (d != 0) {
        d /= 10; // 每次除以10消去最后一位
        length++;
    }
    return length;
    //return (String.valueOf(d));
    }

    // 获取卡号前缀：提取前k位数字
    public static long getPrefix(long number, int k) { 
        int head = (int) (number / Math.pow(10, getSize(number)-k)); 
        return head;
    }
}