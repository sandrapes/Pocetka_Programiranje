import java.util.Scanner;

public class Zadatak19_FishTank {

    public static void main(String[] args) {

        // For his birthday, Steven received an aquarium in the shape of a parallelepiped.
        // Initially, we read from the console in separate rows its dimensions - length, width, and height in centimeters.
        // It is necessary to calculate how many liters of water the aquarium will collect if it is known that a
        // certain percentage of its capacity is occupied by sand, plants, heater, and pump.
        //One liter of water is equal to one cubic decimeter / 1l = 1 dm3 /.
        //Write a program that calculates the liters of water needed to fill the aquarium.

        //4 lines are read from the console:
        //1.	Length in cm – an integer in the interval [10 … 500]
        //2.	Width in cm – an integer in the interval [10 … 300]
        //3.	Height in cm – an integer in the interval [10… 200]
        //4.	Percentage – a floating-point number in the interval [0.000 … 100.000]

        Scanner sc = new Scanner(System.in);

        int length = Integer.parseInt(sc.nextLine());
        int width = Integer.parseInt(sc.nextLine());
        int height = Integer.parseInt(sc.nextLine());
        double percentage = Double.parseDouble(sc.nextLine());

        int zapreminaCelog = length * width * height;

        double zapreminaSamoVode = (zapreminaCelog - (zapreminaCelog * percentage / 100)) * 0.001;

        System.out.println(zapreminaSamoVode);






    }
}
