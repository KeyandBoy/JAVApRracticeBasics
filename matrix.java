import java.util.*;  // 导入java.util包，用于Scanner等工具类

public class matrix {  // 定义主类matrix_T
    public static void main(String[] args) {  // 主方法入口
        Scanner ip = new Scanner(System.in);  // 创建Scanner对象用于接收输入
        System.out.println("Enter the number of rows and columns of the first matrix:");  // 提示输入第一个矩阵的行列数
        int rows1 = ip.nextInt();  // 读取第一个矩阵的行数
        int cols1 = ip.nextInt();  // 读取第一个矩阵的列数
        double[][] matrix1 = new double[rows1][cols1];  // 初始化第一个矩阵
        System.out.println("Enter the number of rows and columns of the second matrix:");  // 提示输入第二个矩阵的行列数
        int rows2 = ip.nextInt();  // 读取第二个矩阵的行数
        int cols2 = ip.nextInt();  // 读取第二个矩阵的列数
        double[][] matrix2 = new double[rows2][cols2];  // 初始化第二个矩阵
        System.out.println("Enter the elements of the first matrix:");  // 提示输入第一个矩阵的元素
        for(int i =0 ;i<matrix1.length ;i++){  // 外层循环遍历行
            for(int j=0;j<matrix1[i].length;j++){  // 内层循环遍历列
                matrix1[i][j] = ip.nextDouble();  // 读取每个元素值
            } 
        }
        System.out.println("Enter the elements of the second matrix:");  // 提示输入第二个矩阵的元素
        for(int i =0 ;i<matrix2.length ;i++){  // 外层循环遍历行
            for(int j=0;j<matrix2[i].length;j++){  // 内层循环遍历列
                matrix2[i][j] = ip.nextDouble();  // 读取每个元素值
            } 
        }
        System.out.println("the sum of them is:");  // 提示输出矩阵和
        SHOW( SUM(matrix1, matrix2));  // 调用SUM方法并显示结果
        System.out.println("the muliply of them is:");  // 提示输出矩阵积
        SHOW( MULTIPLY(matrix1, matrix2));  // 调用MULTIPLY方法并显示结果
        ip.close();  // 关闭Scanner
        }

    public static double[][] SUM(double[][] a,double[][] b) {  // 矩阵加法方法
        if (a.length != b.length&&a[0].length != b[0].length) {  // 检查矩阵维度是否相同
            return null;  // 维度不同返回null（建议改为抛出异常更合理）
        }
        double[][] result = new double[a.length][a[0].length];  // 初始化结果矩阵
        for (int i = 0; i < a.length; i++) {  // 外层循环遍历行
            for (int j = 0; j < a[0].length; j++) {  // 内层循环遍历列
                result[i][j] = a[i][j] + b[i][j];  // 对应元素相加
            }
        }
        return result;  // 返回结果矩阵
    }

    public static double[][]  MULTIPLY(double[][] a,double[][] b) {  // 矩阵乘法方法
        if (a.length != b[0].length) {  // 检查矩阵是否可乘（条件有误，应为a[0].length != b.length）
            return null;  // 不可乘返回null（建议改为抛出异常更合理）
        }
        double[][] result = new double[a.length][b[0].length];  // 初始化结果矩阵
        // 调整循环顺序提升缓存命中率（实际循环顺序未优化）
        for (int i = 0; i < a.length; i++) {  // 遍历A的行
            for (int k = 0; k < a[0].length; k++) {  // 遍历A的列/B的行
            double aElement = a[i][k];  // 获取A的当前元素
            for (int j = 0; j < b[0].length; j++) {  // 遍历B的列
                result[i][j] += aElement * b[k][j];  // 计算并累加
        }
    }
}
        return result;  // 返回结果矩阵
    }

    public static void SHOW(double[][] a) {  // 矩阵显示方法
        if (a == null) {  // 检查矩阵是否为null
            System.out.println("error");  // 输出错误信息
            return;  // 提前返回
        }
        for (int i = 0; i < a.length; i++) {  // 外层循环遍历行
            for (int j = 0; j < a[i].length; j++) {  // 内层循环遍历列
                System.out.print((int)(a[i][j]) + " ");  // 输出元素（强制转为int会丢失精度）
            }
            System.out.println();  // 换行
        }
    }      
}