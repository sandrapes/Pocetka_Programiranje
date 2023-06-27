import java.util.Scanner;

public class Zadatak14_VacationBooksList {

    public static void main(String[] args) {

        // There are several books on John’s list of required literature for the summer vacation.
        // Because John prefers to play with friends outside, your task is to help him calculate how many hours a day
        // he has to spend reading the necessary literature.

        /// 3 lines are read from the console:
        //1.	Number of pages in the current book – an integer in the interval [1…1000]
        //2.	Pages read in 1 hour - an integer in the interval [1…1000]
        //3.	The number of days for which you must read the book - an integer in the range [1…1000]

        Scanner sc = new Scanner(System.in);

        int pagesNumber = Integer.parseInt(sc.nextLine());
        int pagesReadInOneHour = Integer.parseInt(sc.nextLine());
        int daysToReadTheBook = Integer.parseInt(sc.nextLine());

        int totalReadingTimeOfTheBook = pagesNumber / pagesReadInOneHour;
        /// prvo racunamo koliko mu sati ukupno treba da procita celu knjigu, znaci delimo stranice knjige sa stranicama
        /// koje on procita za sat vremena

        int hoursPerDay = totalReadingTimeOfTheBook / daysToReadTheBook;

        System.out.println(hoursPerDay);




    }


}
