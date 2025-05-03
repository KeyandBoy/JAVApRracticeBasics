public class showCurrentTimeOfChina {
    public static void main(String[] args){
        while(true)
        {// 获取当前时间戳（自1970年1月1日UTC以来的毫秒数）
        long totalMilliseconds = System.currentTimeMillis();

        // 转换为秒数并计算当前秒数
        long totalSeconds = totalMilliseconds / 1000;
        long currentSeconds = totalSeconds % 60;  // 当前秒数（0-59）

        // 转换为分钟数并计算当前分钟数
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;  // 当前分钟数（0-59）

        // 转换为小时数并计算UTC时间的小时数
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;  // UTC当前小时数（0-23）

        // 转换为中国标准时间（UTC+8）
        currentHours = currentHours + 8;  // 北京时间比UTC快8小时
        if(currentHours >= 24) {  // 处理跨日情况
            currentHours = currentHours - 24;
        }

        // 格式化输出当前北京时间
         System.out.print("\rThe Time Now Is " + currentHours + ":" + 
                           currentMinutes + ":" + currentSeconds);
    }
    }
}