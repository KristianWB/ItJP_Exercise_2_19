import java.util.Scanner;

public class Geometry_AreaOfATriangle {
    public static void main(String[] args)   {

        /* The task will be performed in three steps
        1) Prompt for user input and declaring/assigning variables
        2) Calculation
        3) Display the results
         */

        // 1) Prompting user and setting up variables
        Scanner input = new Scanner(System.in); // We need a scanner

            // First point values
        System.out.print(
                "Please enter the X value of point A: "
        );
        double x1 = input.nextDouble();
        System.out.print(
                "Please enter the Y value for point A: "
        );
        double y1 = input.nextDouble();

            // Second point values
        System.out.print(
                "Please enter the X value for point B: "
        );
        double x2 = input.nextDouble();
        System.out.print(
                "Please enter the Y value for point B: "
        );
        double y2 = input.nextDouble();

            // Third point values
        System.out.print(
                "Please enter X value for point C: "
        );
        double x3 = input.nextDouble();
        System.out.print(
                "Please enter Y value for point C: "
        );
        double y3 = input.nextDouble();

        // 2) Calculating results
        double sideAB = Math.sqrt((Math.pow((x2 - x1), 2)) + Math.pow((y2 - y1), 2)); // Calculating the distance between point A and point B
        double sideBC = Math.sqrt((Math.pow((x3 - x2), 2)) + Math.pow((y3 - y2), 2)); // Calculating the distance between point B and point C
        double sideCA = Math.sqrt((Math.pow((x1 - x3), 2)) + Math.pow((y1 - y3), 2)); // Calculating the distance between point C and point A

        double s = (sideAB + sideBC + sideCA)/2;
        double area = Math.sqrt(s*(s - sideAB)*(s - sideBC)*(s - sideCA));

        // Display the result
        System.out.print(
                "The area of the triangle is: " + area
        );
    }
}
