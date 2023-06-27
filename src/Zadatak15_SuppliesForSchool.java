import java.util.Scanner;

public class Zadatak15_SuppliesForSchool {

    public static void main(String[] args) {

        // Sophie has to buy a certain number of packets of pens, packets of markers, and detergent for cleaning the board.
        // She is a regular customer of a bookstore, so there is a discount for her, which is a percentage of the total.
        // Write a program that calculates how much money Sophie will have to raise to pay the bill,
        // keeping in mind the following price list:

        //	Package of pens- 5.80 USD.
        //	Package of markers - 7.20 USD.
        //	Detergent- 1.20 USD (for liter)

        //4 numbers are read from the console:
        //•	Package of pens - an integer in the range [0...100]
        //•	Package of markers – an integer in the range [0...100]
        //•	Liters of detergent – an integer in the range [0…50]
        //•	Percentage reduction – an integer in the range [0...100]

        Scanner sc = new Scanner(System.in);

        double PENS = 5.80;
        double MARKERS = 7.20;
        double DETERGENT = 1.20;

        int packageOfPens = Integer.parseInt(sc.nextLine());
        int packageOfMarkers = Integer.parseInt(sc.nextLine());
        int packageOfDetergent = Integer.parseInt(sc.nextLine());
        int percentageReduction = Integer.parseInt(sc.nextLine());

        double pensPrice = packageOfPens * PENS;
        double markersPrice = packageOfMarkers * MARKERS;
        double detergentPrice = packageOfDetergent * DETERGENT;

        double total = pensPrice + markersPrice + detergentPrice;

        double discount = total * percentageReduction / 100.0;
        // ovde se racuna samo koliko je popust. Da bismo dobili konacnu cenu sa popustom, od svega zajedno oduzimamo popust.

        double allTogether = total - discount;

        System.out.println(allTogether);
    }
}
