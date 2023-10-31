import java.util.Scanner;

/**
 *
 * @author Mohammed Alfarra 
 */
public class PracticeIfSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("What month were you born in?");
        String month = in.next();
        System.out.println("What day were you born in?");
        int day = in.nextInt();
        //What do you do next?  (Hint:  See ZodiacSign class)
        ZodiacSign mySign = new ZodiacSign(month, day);
        mySign.determineZodiacSign();
    }

}