package ExerciseFirstStepsInCoding04;

import java.util.Scanner;

public class DepositCalculator03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double depositSum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double yearlyInterestRate = Double.parseDouble(scanner.nextLine());

        double perecentYearlyInterestRate = yearlyInterestRate / 100;
        double accruedInterest = depositSum * perecentYearlyInterestRate ;
        double interestPerMonth = accruedInterest / 12;
        double totalSum = depositSum + months * interestPerMonth;
        System.out.println(totalSum);

    }
}
