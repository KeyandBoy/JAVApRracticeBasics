/**1.11     美国人口预测 */

public class US_Population_Projections {
    public static void main(String[] args){

        long StartP = 312032486;

        long AllSeconds = 365*24*60*60;

        long Births = AllSeconds/7;
        long Deaths = AllSeconds/13;
        long NewP = AllSeconds/45;
        long Then = Births - Deaths + NewP;

        System.out.println("The population in the Fir. year is: " + (StartP + Then));
        System.out.println("The population in the Sec. year is: " + (StartP + 2*Then));
        System.out.println("The population in the Thi. year is: " + (StartP + 3*Then));
        System.out.println("The population in the Fou. year is: " + (StartP + 4*Then));
        System.out.println("The population in the Fif. year is: " + (StartP + 5*Then));

    }
}
