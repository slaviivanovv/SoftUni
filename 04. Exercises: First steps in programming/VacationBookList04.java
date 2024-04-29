package ExerciseFirstStepsInCoding04;

import java.util.Scanner;

public class VacationBookList04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pageNumber = Integer.parseInt(scanner.nextLine());
        int pages = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int totalReadingTime = pageNumber / pages;
        int totalHoursPerDay = totalReadingTime / days;
        System.out.println(totalHoursPerDay);
    }
}
