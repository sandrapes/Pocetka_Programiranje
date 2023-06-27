import java.util.Scanner;

public class Zadatak18_BasketballEquipment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Jesse decides he wants to play basketball, but he needs equipment to train.
        // Write a program that calculates what costs Jesse will have if he starts training,
        // knowing how much the basketball training fee is for 1 year. Required equipment:

        //	Basketball sneakers – their price is 40% less than the fee for one year
        //	Basketball outfit – its price is 20% cheaper than the sneakers
        //  Ball – its price is 1 / 4 of the price of the outfit
        //	Basketball Accessories –its price is 1 / 5 of the price of the ball

        // 1 line is read from the console:
        //	The annual fee for basketball training - an integer in the interval [0… 9999]

        int annualFee = Integer.parseInt(sc.nextLine());

        double sneakers = annualFee - (annualFee * 40.0 / 100);
        double outfit = sneakers - (sneakers * 20 / 100);
        double ball = outfit / 4;
        double accessories = ball / 5;

        System.out.println(sneakers + outfit + ball + accessories + annualFee);



    }
}
