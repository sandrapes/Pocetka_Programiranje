import java.util.Scanner;

public class Zadatak11_USDtoBGN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double usd = 1.79549;

        double usdAmount = Double.parseDouble(sc.nextLine());

        double bgn = usd * usdAmount;

        System.out.println(bgn);



    }
}
