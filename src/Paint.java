/**
 * @class: Paint
 * @author: Nia Jackson
 * @course: ITEC 2140
 * This program will calculate the amount of paint needed to paint a room given that
 * 1 gallon can paint 350 square feet, and given the measurements of the room by the user
 */
import java.util.Scanner;
public class Paint {
    public static void main(String[] args){
        //Creats scanner to read the inputs for length, width, height,
        //and windows and doors.

        Scanner slength = new Scanner(System.in);
        System.out.println("Please enter the length");
        double length = slength.nextDouble();

        Scanner swidth = new Scanner(System.in);
        System.out.println("Please enter the width: ");
        double width = swidth.nextDouble();

        Scanner sheight = new Scanner(System.in);
        System.out.println("Please enter the height: ");
        double height = sheight.nextDouble();

        Scanner swindows = new Scanner(System.in);
        System.out.println("Please enter the number of windows: ");
        double windows = swindows.nextDouble();

        Scanner sdoors = new Scanner(System.in);
        System.out.println("Please enter the number of doors: ");
        double doors = sdoors.nextDouble();

        //creates variable to calculate the measurements of each wall
        double ceiling = width * length;
        double wall1 = height * length;
        double wall2 = height * width;
        double inputWindows = 15 * windows;
        double inputDoors = 21 * doors;

        //calculates the perimeter of the room excluding the windows and doors.
        //Also calculates the gallons converted to quarts
        double perimeter = ceiling + (wall1 * 2) + (wall2 * 2);//Total perimeter including windows and doors
        double totalPainted = perimeter - (inputWindows + inputDoors) ;
        double paintNeeded = totalPainted / 350;
        double quarts = paintNeeded * 4;
        System.out.println("You will need " + paintNeeded + " gallons of paint or\n " + quarts + " quarts");
    }
}
