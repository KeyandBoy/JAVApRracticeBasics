import java.util.*;
public class Two_Point_Distance {
    public static   void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1 and y1:");
        double x1= input.nextDouble();
        double y1= input.nextDouble();
        System.out.printf("\n");
        System.out.print("Enter x2 and y2:");
        double x2= input.nextDouble();
        double y2= input.nextDouble();

        double d = Math.pow(Math.pow(x2-x1,2)+Math.pow(y1-y2,2), 0.5);
        System.out.println("The_distance_between_two_points is"+d);
        input.close();
    }
}
