import java.util.Scanner;

public class Zadatak17_FoodDelivery {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /// The restaurant opens its doors and offers several menus at preferential prices:
        //	Chicken menu – 10.35 USD.
        //	Fish menu – 12.40 USD.
        //  Vegetarian menu – 8.15 USD.
        // The group will also order a dessert, the price of which is equal to 20% of the total bill (excluding delivery).
        // The delivery price is 2.50 USD and is finally charged.

        //3 lines are read from the console:
        //•	Number of chicken menus – an integer in the range [0 … 99]
        //•	Number of fish menus – an integer in the range [0 … 99]
        //•	Number of vegetarian menus – an integer in the range [0 … 99]

        double chickenMenu = 10.35;
        double fishMenu = 12.40;
        double vegetarianMenu = 8.15;
        double delivery = 2.50;


        int chicken = Integer.parseInt(sc.nextLine());
        int fish = Integer.parseInt(sc.nextLine());
        int veg = Integer.parseInt(sc.nextLine());

        double chickenPrice = chicken * chickenMenu;
        double fishPrice = fishMenu * fish;
        double vegPrice = veg * vegetarianMenu;
        double totalMenu = chickenPrice + fishPrice + vegPrice;

        double dessert = totalMenu * 20 /100;


        double all = totalMenu + dessert + delivery;

        System.out.println(all);




    }
}
