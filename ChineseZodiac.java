public class ChineseZodiac {
    public static void main(String[] args) {
        // 生成4个随机数字（0-9）
        int num = (int)(Math.random()*10);   // 个位数
        int num1 = (int)(Math.random()*10);  // 千位数
        int num2 = (int)(Math.random()*10);  // 百位数
        int num3 = (int)(Math.random()*10);  // 十位数
        
        // 组合成4位数的年份（可能范围：0000-9999）
        int year = num1 * 1000 + num2 * 100 + num3 * 10 + num;
        System.out.print("The year " + year + " is ");  // 打印年份前缀

        // 根据年份计算生肖（中国生肖12年一个轮回）
        switch (year % 12) {
            case 0:
                System.out.println("monkey");    // 猴年
                break;
            case 1:
                System.out.println("rooster");   // 鸡年
                break;
            case 2:
                System.out.println("dog");       // 狗年
                break;
            case 3:
                System.out.println("pig");       // 猪年
                break;
            case 4:
                System.out.println("rat");       // 鼠年
                break;
            case 5:
                System.out.println("ox");        // 牛年
                break;
            case 6:
                System.out.println("tiger");     // 虎年
                break;                
            case 7:
                System.out.println("rabbit");    // 兔年
                break;
            case 8:
                System.out.println("dragon");    // 龙年
                break;
            case 9:
                System.out.println("snake");     // 蛇年
                break;
            case 10:
                System.out.println("horse");     // 马年
                break;
            case 11:
                System.out.println("sheep");     // 羊年
                break;
            default:
                break;  // 理论上不会执行到此处
        }
    }
}