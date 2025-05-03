public class TestBooleanOperators {  // 修正类名拼写错误
    public static void main(String[] args){
        // 生成0-9的随机整数
        int num1 = (int)(Math.random()*10);  // Math.random()生成[0,1)的随机数
        System.out.println("input "+num1);  // 打印生成的随机数
        
        // 使用布尔运算符进行多重条件判断
        if (num1 % 2 == 0 && num1 % 3 == 0) {  // 同时能被2和3整除（即能被6整除）
            System.out.println("can 2");  // 输出能被2个数整除
        }
        else if (num1 % 2 == 0 ^ num1 % 3 == 0) {  // 异或运算：只能被其中一个数整除
            System.out.println("can 1");  // 输出能被1个数整除
        }
        else{  // 既不能被2整除也不能被3整除
            System.out.println("no can");  // 输出不能被这两个数整除
        }
    }
}