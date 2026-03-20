// find number of days in month from given date

import java.util.Scanner;
import java.time.YearMonth;

public class findNumberOfDays {
    public static int numberOfDaysInMonth(int month, int year) {
        int days = YearMonth.of(year, month).lengthOfMonth(); // Returns number of days in the specified month and year
        return days;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        sc.close();
        int days = numberOfDaysInMonth(month, year);
        System.out.println("Number of days in month " + month + " of year " + year + " is: " + days);
    }
}
