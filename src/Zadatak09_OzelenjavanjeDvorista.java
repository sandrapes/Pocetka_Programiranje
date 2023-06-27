import java.util.Scanner;

public class Zadatak09_OzelenjavanjeDvorista {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double sqmPrice = 7.61;
        double DISCOUNT = 0.18;

        double numberOfSqm = Double.parseDouble(sc.nextLine());

        double priceWithNoDiscount = sqmPrice * numberOfSqm;

        double discountIs = DISCOUNT * priceWithNoDiscount;

        double finalPrice = priceWithNoDiscount - discountIs;

       System.out.printf("The final price is: %.2f USD.\n",finalPrice );
       System.out.printf("The discount is: %.2f USD.\n", discountIs);


    }
}
