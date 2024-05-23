package ConditionalStatementsLab;

import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grade = Integer.parseInt(scanner.nextLine());
        int excellentGrade = 5;
        boolean goodOrExcellent = grade >= excellentGrade;

        if (goodOrExcellent) {
            System.out.println("Excellent!");
        }
    }
}
