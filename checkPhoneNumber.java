import java.util.Scanner;

public class checkPhoneNumber {
    public static void main(String[] args) {
        // 创建Scanner对象获取用户输入
        Scanner input = new Scanner(System.in);
        System.out.println("please input the phone number:");  // 提示用户输入电话号码
        String number = input.nextLine();  // 读取用户输入的电话号码
        input.close();  // 关闭Scanner对象
        
        // 验证电话号码有效性并输出结果
        if (isValidPhoneNumber(number)) {
            System.out.println("Yes");  // 有效电话号码
        } else {
            System.out.println("No");   // 无效电话号码
        }
    }

    // /?**?
    //  * 综合验证电话号码有效性
    //  * @param number 待验证的电话号码字符串
    //  * @return 有效返回true，否则返回false
    //  */
    public static boolean isValidPhoneNumber(String number) {
        // 必须同时满足三个条件：正确长度、纯数字、首位为1
        return trueLongNumber(number) && 
               onlyNumber(number) && 
               firstNumber(number);
    }

    // /?**?
    //  * 验证电话号码长度是否为11位
    //  * @param number 待验证的电话号码
    //  * @return 是11位返回true，否则false
    //  */
    public static boolean trueLongNumber(String number) {
        return getSize(number) == 11;  // 直接返回长度比较结果
    }

    // /?**?
    //  * 计算字符串长度
    //  * @param number 输入字符串
    //  * @return 字符串长度
    //  */
    public static int getSize(String number) {
        return number.length();  // 返回字符串长度
    }

    // /?**?
    //  * 验证是否只包含数字
    //  * @param number 待验证字符串
    //  * @return 纯数字返回true，否则false
    //  */
    public static boolean onlyNumber(String number) {
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            if (!Character.isDigit(c)) {
                return false;  // 发现非数字字符立即返回false
            }
        }
        return true;  // 全部字符检查通过
    }

    // /?**?
    //  * 验证首位数字是否为1
    //  * @param number 待验证电话号码
    //  * @return 首位为1返回true，否则false
    //  */
    public static boolean firstNumber(String number) {
        return number.charAt(0) == '1';  // 直接返回首位比较结果
    }
}