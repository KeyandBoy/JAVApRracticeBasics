import java.util.*;                                   // 导入工具包

public class beanMachine {                           // 定义beanMachine类
    public static void main(String[] args) {         // 主方法
        Scanner sc = new Scanner(System.in);         // 创建Scanner对象用于输入
        System.out.println("请输入小球数量:");         // 提示输入小球数量
        int numBalls = sc.nextInt();                 // 读取小球数量
        System.out.println("请输入钉子层数:");         // 提示输入钉子层数
        int layers = sc.nextInt();                   // 读取钉子层数
        int[] slots = new int[layers + 1];           // 初始化槽数组(层数+1个槽)
        sc.close();                                  // 关闭Scanner
        
        BEANMACHINE(numBalls, layers, slots);        // 调用模拟方法
        OUT(slots);                                  // 调用输出方法
    }

    public static void BEANMACHINE(int numBalls,      // 弹珠机模拟方法
                                   int layers,         // 钉子层数参数
                                   int[] slots) {      // 槽数组参数
        for (int i = 0; i < numBalls; i++) {         // 遍历每个小球
            int way = 0;                             // 初始化小球最终位置
            StringBuilder path = new StringBuilder();// 创建路径记录器
            
            for (int j = 0; j < layers; j++) {       // 遍历每层钉子
                boolean isRight = Math.random() < 0.5;// 随机决定方向(50%右)
                if (isRight) 
                    way++;                  // 向右则最终位置+1
                path.append(isRight ? "R" : "L");     // 记录当前方向
            }
            
            System.out.println(path.toString());      // 打印当前小球路径
            slots[way]++;                            // 对应槽位计数+1
        }
    }
    
    public static void OUT(int[] slots) {            // 结果处理方法
        int max = 0;                                 // 初始化最大值
        // for (int count : slots) {                    // 遍历槽数组
        //     if (count > max) max = count;            // 找出最大小球数
        // }
        for (int i = 0; i < slots.length; i++) {     // 遍历槽数组
            if (slots[i] > max) 
                max = slots[i];      // 找出最大小球数
        }
        
        int[][] SL = new int[max][slots.length];     // 创建可视化数组
        for (int i = 0; i < slots.length; i++) {// 遍历每个槽
            for (int row = 0; row < slots[i]; row++){// 根据小球数填充
                SL[max - row - 1][i] = 1;          // 从底部开始填充
            }
        }
        
        SHOW(SL);                                    // 调用可视化方法
    }
    
    public static void SHOW(int[][] a) {             // 可视化输出方法
        if (a == null) {                             // 空数组检查
            System.out.println("error");              // 错误提示
            return;                                  // 提前返回
        }
        
        for (int i = 0; i < a.length; i++) {         // 遍历行
            for (int j = 0; j < a[i].length; j++) {  // 遍历列
                System.out.print(a[i][j] >= 1 ? "■ " : "  ");// 输出方块或空格
            }
            System.out.println();                    // 换行
        }
    }
}