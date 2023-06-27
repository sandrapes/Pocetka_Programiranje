import java.util.Scanner;

public class Zadatak16_Repainting {

    public static void main(String[] args) {

        ///Peter wants to repaint the living room and has hired craftsmen for this purpose.
        // Write a program that calculates the cost of repairs, given the following prices:
        //•	Protective nylon - 1.50 USD per square meter
        //•	Paint - 14.50 USD for liter
        //•	Paint thinner - 5.00 USD for a liter
        //Just in case, to the necessary materials, Peter wants to add another 10% of the amount of paint
        // and 2 square meters of nylon, of course, 0.40 USD for bags.
        // The amount paid to the masters for 1 hour of work is equal to 30% of the sum of all costs for materials.

        ///The input is readable from the console and contains 4 lines:
        //1.	Required amount of nylon (in square meters) – an integer in the range [1... 100]
        //2.	Required amount of paint (in liters) – an integer in the range [1…100]
        //3.	Quantity of detergent (in liters) – an integer in the range [1…30]
        //4.	Hours for which the workers will do the work - an integer in the interval [1…9]

        Scanner sc = new Scanner(System.in);

        double PROTECTIVE_NYLON_PER_SQM = 1.50;
        double PAINT_PER_LITER = 14.50;
        double PAINT_THINNER_PER_LITER = 5.00;
        double BAGS = 0.40;

        int amountOfNylon = Integer.parseInt(sc.nextLine());
        int amountOfPaint = Integer.parseInt(sc.nextLine());
        int amountOfDetergent = Integer.parseInt(sc.nextLine());
        int hoursForWorkersToDoWork = Integer.parseInt(sc.nextLine());

        double paintTotal = (amountOfPaint + (amountOfPaint * 10.0 / 100 )) * PAINT_PER_LITER;
        double nylonTotal = (amountOfNylon + 2) * PROTECTIVE_NYLON_PER_SQM;
        double thinnerTotal = amountOfDetergent * PAINT_THINNER_PER_LITER;

        double materialsTotal = paintTotal + nylonTotal + thinnerTotal + BAGS;

        double workersPay = hoursForWorkersToDoWork * (materialsTotal * 30 / 100);

        double totalSum = materialsTotal + workersPay;

        System.out.println(totalSum);


    }
}
