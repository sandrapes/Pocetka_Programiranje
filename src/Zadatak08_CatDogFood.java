import java.util.Scanner;

public class Zadatak08_CatDogFood {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double dogFood = 2.50;
        double catFood = 4;

        int dogFoodPackage = Integer.parseInt(sc.nextLine());
        int catFoodPackage = Integer.parseInt(sc.nextLine());

        double dogFoodTotal = dogFood * dogFoodPackage;
        double catFoodTotal = catFood * catFoodPackage;

        double total = dogFoodTotal + catFoodTotal;

        System.out.printf("%.1f USD\n", total);


    }
}
