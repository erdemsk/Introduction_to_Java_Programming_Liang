/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 2. Programming Exercises 2.9, 92*/
import java.util.*;
public class Acceleration {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user the starting and end velocity values and time span
        System.out.print("Enter starting velocity: ");
        double startingVelocity = input.nextDouble();

        System.out.print("Enter end velocity: ");
        double endVelocity = input.nextDouble();

        System.out.print("Enter the time span: ");
        double timeSpan = input.nextDouble();

        //Calculate the acceleration
        double acceleration = (int) ((endVelocity-startingVelocity)/timeSpan*10000)/10000.0;

        //Display the result
        System.out.println("The average acceleration is "+acceleration);
    }
}
