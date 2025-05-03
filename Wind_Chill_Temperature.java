
import java.util.Scanner;

public class Wind_Chill_Temperature {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            
            double T = input.nextDouble();
            double V = input.nextDouble();
    
            double Cold =  35.74 + 0.6215 * T - 35.75 * Math.pow(V,0.16) + 0.4275 * T * Math.pow(V, 0.16);
            
            System.out.print("The wind chill index is " +Cold);
    
            input.close();
        }
    }
    
