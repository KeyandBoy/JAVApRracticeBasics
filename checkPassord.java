public class checkPassord {  // 类名建议改为CheckPassword（遵循驼峰命名）
  public static void main(String[] args) {
      // 创建Scanner对象获取用户输入
      java.util.Scanner input = new java.util.Scanner(System.in);
      String s = input.nextLine();  // 读取用户输入的密码字符串
      input.close();  // 关闭Scanner
      
      // 检查密码有效性并输出结果
      if (isValidPassword(s)) {
          System.out.println("Valid password");  // 密码有效
      } else {
          System.out.println("Invalid password"); // 密码无效
      }
  }


  //  * 验证密码是否有效的静态方法
  //  * @param s 待验证的密码字符串
  //  * @return 有效返回true，否则返回false
  public static boolean isValidPassword(String s) {
      // 规则1：只能包含字母和数字
      for (int i = 0; i < s.length(); i++) {
          char c = s.charAt(i);
          if (!Character.isLetter(c) && !Character.isDigit(c)) {
              return false;  // 发现非法字符立即返回false
          }
      }
      
      // 规则2：长度至少8位
      if (s.length() < 8) {
          return false;
      }
      
      // 规则3：至少包含2个数字
      int digitCount = 0;
      for (int i = 0; i < s.length(); i++) {
          if (Character.isDigit(s.charAt(i))) {
              digitCount++;
              // 优化：当数字计数达到2即可提前终止循环
              if (digitCount >= 2) {
                  break;
              }
          }
      }
      
      return digitCount >= 2;  // 最终判断数字数量是否达标
  }
}