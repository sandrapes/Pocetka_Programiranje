import java.util.Scanner;

public class Zadatak12_RadiansToDegrees {

    public static void main(String[] args) {

        /// Write a program that reads an angle in radians (decimal number) and converts it to degrees.
        // Use the formula: degree radian * 180 / π. The number π in Java programs is available through Math.PI.

        Scanner sc = new Scanner(System.in);

        double radian = Double.parseDouble(sc.nextLine());

        double degrees = radian * 180 / Math.PI;

        System.out.println(degrees);
    }
}
