/**
 * @class: Conversions
 * @author: Nia Jackson
 * @course: ITEC 2140
 * This program will convert the number of seconds given to hours, minutes and seconds
 */
import java.util.Scanner;
public class Conversions {
    public static void main(String[] args){
        Scanner secondsinput = new Scanner(System.in); // creates a scanner that will read the number of seconds input
        System.out.println("Please enter the number of seconds: ");
        int seconds = (int) secondsinput.nextDouble();

        int hours = seconds / 3600;//variable for converting hours to seconds
        int minutes = seconds / 60;//converts seconds to minutes

        System.out.println("The total number of seconds is " + seconds + ", it is " + hours
                + " hours, " + minutes + "minutes.");

    }
}
