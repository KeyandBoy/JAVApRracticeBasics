
import java.util.*;

public class What_Is_Today {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = input.nextInt();

        System.out.println("Enter the month (1-12): ");
        int month = input.nextInt();

        System.out.println("Enter the day of the month: ");
        int day = input.nextInt();

        if (month < 3) {
            month += 12;
            year -= 1;
        }/**因为一月和二月在这个公式里是用13和14表示的,且年份要改为前一年1 */

        int h = (day + 26 * (month + 1) / 10 + year % 100 + (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7;

        if (h < 0) {
            h += 7;
        }

        switch (h) {
            case 0:
                System.out.println("Saturday");
                break;
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Error");
                break;
        }

        input.close();
    }
}