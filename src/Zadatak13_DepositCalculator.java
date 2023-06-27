import java.util.Scanner;

public class Zadatak13_DepositCalculator {

    public static void main(String[] args) {

        ///Write a program that calculates how much you will receive at the end of the deposit period at a certain interest rate.
        // Use the following formula:
        //amount = deposited amount + term of the deposit * ((deposited amount * annual interest rate) / 12)

        ///3 lines are read from the console:
        //1.	Deposit amount – a floating-point number in the interval [100.00 … 10000.00]
        //2.	Term of the deposit (in months) – an integer in the interval [1…12]
        //3.	Annual interest rate – a floating-point number in the interval [0.00 …100.00]

        Scanner sc = new Scanner(System.in);

        double depositAmount = Double.parseDouble(sc.nextLine());
        int termOfDepositMonths = Integer.parseInt(sc.nextLine());
        double annualInterestRate = Double.parseDouble(sc.nextLine());

        double amount = depositAmount + termOfDepositMonths * ((depositAmount * annualInterestRate / 100) / 12);
        /// zato sto je annual interest rate kamata u procentima, mora da se deli sa 100 da bi se dobio procenat.
        /// Annual interest rate kad se unosi je zapravo procenat.

        System.out.println(amount);


    }
}
