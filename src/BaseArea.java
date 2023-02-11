/**
 * @class: BaseArea
 * @author: Nia Jackson
 * @course: ITEC 2140
 * This program will calulate the base area and volume of a cylinder given
 * the radius and length provided by the user
 */

import java.util.Scanner; //Creates a scanner object for users to input their own numbers for the equation

public class BaseArea {
    public static void main(String[] args){
       System.out.println("Please enter the radius: ");//Prompts the user to input their radius.
        Scanner inputradius = new Scanner(System.in);//Creates a scanner object for the radius input.
        double radius = inputradius.nextDouble();//Creates a usable variable for the radius.

        System.out.println("Please enter the length: ");//Prompts the user to input their length.
        Scanner inputlength = new Scanner(System.in);//Creates a scanner objects for the length input.
        double length = inputradius.nextDouble();//Creates a usable variable for the length.

        double basearea = 3.1416 * (radius * radius);//The equation for the area of the bottom circle of a cylinder.
        double volume = 3.1416 * (radius * radius) * length;//The equation for the volume of the entire cylinder.
        System.out.println("The base area is " + basearea + "/n The volume is " + volume);


        }
    }

