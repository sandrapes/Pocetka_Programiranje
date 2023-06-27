import java.util.Scanner;

public class Zadatak07_brojProjekata {

    public static void main(String[] args) {

        ///"The architect {name of architect} will need {needed time} hours to complete
        // {number of projects} project/s."

       Scanner sc = new Scanner(System.in);

       int VREME_ZA_JEDAN_PROJEKAT = 3;

       String imeArhitekte = sc.nextLine();
       int brojProjekata = Integer.parseInt(sc.nextLine());

       int ukupnoVreme = VREME_ZA_JEDAN_PROJEKAT * brojProjekata;

       System.out.printf("The architect %s will need %d hours to complete %d project/s.", imeArhitekte, ukupnoVreme, brojProjekata);


       ///import java.util.Scanner;
        //
        //public class Zadatak01_prvi_program {
        //
        //    public static void main(String[] args) {
        //
        //        Scanner sc = new Scanner(System.in);
        //
        //        String name = sc.nextLine();
        //        int brojProjekata = Integer.parseInt(sc.nextLine());
        //
        //        System.out.printf("The architect %s will need %d hours to complete %d project/s."
        //        , name, brojProjekata * 3, brojProjekata);
        //
        //    }
        //}



    }
}
