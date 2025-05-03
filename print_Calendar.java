import java.util.*;

public class print_Calendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // 获取用户输入的起始年月
        System.out.print("Enter the start year(eg.2012):  ");
        int year = input.nextInt();
        System.out.print("Enter the start month between 1 - 12:  ");
        int month = input.nextInt();

        // 获取用户输入的结束年月
        System.out.print("Enter the end year(eg.2012):  ");
        int endyear = input.nextInt();
        System.out.print("Enter the end month between 1 - 12:  ");
        int endmonth = input.nextInt();

        // 打印从起始年到结束年之间的所有月份日历
        for (int i = year; i < endyear; i++) {
            for (; month <=12; month++) {
                printMonth(year, month);
                if (month == 12) {
                    month = 1;
                    year++;
                }
            }
        }
        
        // 打印结束年的指定月份日历
        for (int i =1; i <= endmonth; i++) {
            if (month == 12) {
                month = 1;
                year++;
            }
            month = i;
            printMonth(year, month);
        }
        
        input.close();
    }
    
    // 打印单个月份的日历
    public static void printMonth(int year,int month) {
        printMonthTitle(year, month);  // 打印月份标题
        printMonthBody(year, month);   // 打印月份内容
    }
    
    // 打印月份标题（月份名称和年份）
    public static void printMonthTitle(int year,int month) {
        System.out.println();
        System.out.println("         " + getMonthName(month) + " " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        System.out.println("-----------------------------");
    }
    
    // 获取月份名称
    public static String getMonthName(int month) {
        String monthName = "";
        switch  (month){
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
        }
        return monthName;
    }
    
    // 打印月份内容（日期排列）
    public static void printMonthBody(int year,int month) {
        int startDay = getStartDay(year, month);  // 获取该月第一天是星期几
        int numberOfDaysInMonth = getNumberOfDayInMonth(year, month);  // 获取该月天数
        
        // 打印前面的空格（对齐星期）
        for(int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }
        
        // 打印日期
        for(int i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);  // 每个日期占4个字符宽度
            if((i + startDay) % 7 == 0) {  // 每7天换行
                System.out.println();
            }
        }
    } 
        
    // 计算某年某月第一天是星期几（Zeller公式）
    public static int getStartDay(int year,int month) {
        int h, q, m, k, j;
        q =1;  // 日期（这里固定为1号）
        m= month;
        k= year % 100;  // 年份后两位
        j= year / 100;   // 世纪数
        
        // 1月和2月视为上一年的13月和14月
        if(m == 1 || m == 2) {
            m += 12;
            year--;
        }
        
        // Zeller公式计算星期几（0=星期六，1=星期日，...，6=星期五）
        h = (q + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) - 2 * j) % 7;
        return (h + 6) % 7;  // 转换为0=星期日，1=星期一，...，6=星期六
    }
    
    // 获取某年某月的天数
    public static int getNumberOfDayInMonth(int year,int month) {
        if(month ==1 ||month ==3 || month ==5 || month ==7 || month ==8 || month ==10 || month ==12) {
            return 31;  // 大月31天
        }
        else if(month ==4 || month ==6 || month ==9 || month ==11) {
            return 30;  // 小月30天
        }
        else if(month ==2) {
            if(isLeapYear(year)) 
                return 29;  // 闰年2月29天
            else 
                return 28;  // 平年2月28天
        }
        else {
            return 0;  // 无效月份返回0
        }
    }
    
    // 判断是否为闰年
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}