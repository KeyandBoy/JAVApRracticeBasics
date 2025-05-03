import java.util.*;                                   // 导入Java工具包

public class financialStorm {                         // 定义金融风暴模拟类
    public static void main(String[] args) {         // 主方法
        Scanner input = new Scanner(System.in);      // 创建Scanner对象用于输入
        int n = input.nextInt();                     // 读取银行数量
        double limit = input.nextDouble();           // 读取最低安全资本限额
        
        double[][] borrowers = new double[n][n];     // 创建银行间借贷关系矩阵[n×n]
        double[] balance = new double[n];           // 创建银行余额数组[n]
        boolean[] unsafe = new boolean[n];           // 创建银行安全状态标记数组[n]

        // 读取每个银行的数据
        for (int i = 0; i < n; i++) {                // 遍历每个银行
            balance[i] = input.nextDouble();         // 读取当前银行余额
            int k = input.nextInt();                 // 读取当前银行的借款银行数量
            for (int j = 0; j < k; j++) {           // 遍历每个借款银行
                int bankId = input.nextInt();        // 读取借款银行ID
                borrowers[i][bankId] = input.nextDouble(); // 读取借款金额
            }
        }

        // 动态检测不安全银行
        boolean updated;                             // 标记是否有银行状态更新
        do {                                         // 开始循环检测
            updated = false;                         // 初始化更新标志为false
            double[] assets = new double[n];         // 创建资产计算数组[n]
            
            // 计算每个银行的总资产
            for (int i = 0; i < n; i++) {           // 遍历每个银行
                assets[i] = balance[i];              // 初始化为银行自有余额
                for (int j = 0; j < n; j++) {       // 遍历所有银行
                    assets[i] += borrowers[j][i];    // 加上其他银行对本行的借款
                }
            }

            // 检查并标记不安全银行
            for (int i = 0; i < n; i++) {           // 遍历每个银行
                if (!unsafe[i] && assets[i] < limit) { // 如果银行安全但资产不足
                    unsafe[i] = true;                // 标记为不安全
                    updated = true;                  // 设置更新标志
                    // 清除所有对该银行的借款
                    for (int j = 0; j < n; j++) {   // 遍历所有银行
                        borrowers[j][i] = 0;         // 清零对该银行的借款
                    }
                }
            }
        } while (updated);                          // 继续循环直到没有新发现

        // 输出不安全银行列表
        System.out.print("Unsafe banks are ");       // 输出提示信息
        for (int i = 0; i < n; i++) {               // 遍历所有银行
            if (unsafe[i]) System.out.print(i + " "); // 输出不安全银行编号
        }
        input.close();                             // 关闭Scanner对象
    }
}