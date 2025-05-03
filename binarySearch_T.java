import java.util.*;

public class binarySearch_T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择数据类型:\n1.int\t2.double\t3.string\t4.char");
        int type = sc.nextInt();
        System.out.println("请输入数组长度:");
        int n = sc.nextInt();
        
        // 记录开始时间
        long startTime = System.currentTimeMillis(); 
        
        switch (type) {
            case 1: binarySearchInt(n); break;
            case 2: binarySearchDouble(n); break;
            case 3: binarySearchString(n); break;
            case 4: binarySearchChar(n); break;
            default: System.out.println("无效选择"); break;
        }
        
        // 计算并输出耗时
        long endTime = System.currentTimeMillis();
        System.out.println("总耗时: "+((endTime-startTime)/1000.0)+"秒");
        sc.close();
    }

    // 整型数组的二分查找测试
    public static void binarySearchInt(int n) {
        Integer[] arry = new Integer[n];
        Random random = new Random();
        
        // 用随机数填充数组
        for (int i = 0; i < arry.length; i++) {
            arry[i] = random.nextInt(100);  // 生成0-99的随机整数
        }
        
        // 选择中间元素作为查找目标
        int key = arry[n/2];
        System.out.println("示例查找目标: "+key);
        
        Arrays.sort(arry);  // 必须排序后才能二分查找
        int find = performBinarySearch(arry, key);
        System.out.println("目标元素的索引位置: "+find);
    }

    // 双精度浮点数组的二分查找测试
    public static void binarySearchDouble(int n) {
        Double[] arry = new Double[n];
        
        // 用随机数填充数组
        for (int i = 0; i < arry.length; i++) {
            arry[i] = Math.random()*100;  // 生成0-100的随机浮点数
        }
        
        // 选择中间元素作为查找目标
        double key = arry[n/2];
        System.out.println("示例查找目标: "+key);
        
        Arrays.sort(arry);
        int find = performBinarySearch(arry, key);
        System.out.println("目标元素的索引位置: "+find);
    }

    // 字符数组的二分查找测试
    public static void binarySearchChar(int n) {
        Character[] arry = new Character[n];
        Random random = new Random();
        
        // 用随机字符填充数组
        for (int i = 0; i < arry.length; i++) {
            arry[i] = (char) (32 + random.nextInt(95));  // 生成可打印ASCII字符
        }
        
        // 选择中间元素作为查找目标
        char key = arry[n/2];
        System.out.println("示例查找目标: "+key);
        
        Arrays.sort(arry);
        int find = performBinarySearch(arry, key);
        System.out.println("目标元素的索引位置: "+find);
    }

    // 字符串数组的二分查找测试
    public static void binarySearchString(int n) {
        String[] arry = new String[n];
        Random random = new Random();
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        
        // 生成随机字符串数组
        for (int i = 0; i < arry.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 3; j++) {
                sb.append(chars.charAt(random.nextInt(chars.length())));
            }
            arry[i] = sb.toString();
        }
        
        // 选择中间元素作为查找目标
        String key = arry[n/2];
        System.out.println("\n示例查找目标: " + key);
        
        Arrays.sort(arry);
        int find = performBinarySearch(arry, key);
        System.out.println("目标元素的索引位置: " + find);
    }

    // 泛型二分查找实现
    // 要求类型T必须实现Comparable接口
    public static <T extends Comparable<T>> int performBinarySearch(T[] arry, T key) {
        int low = 0;
        int high = arry.length - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = key.compareTo(arry[mid]);
            
            if (cmp < 0) {
                high = mid - 1;  // 在左半区继续查找
            } else if (cmp > 0) {
                low = mid + 1;   // 在右半区继续查找
            } else {
                return mid;      // 找到目标
            }
        }
        return -1;  // 未找到
    }
}