package FirstStepsInCodingAdditionalExercises;

import java.util.Scanner;

public class vegetableMarket04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vegetablesKiloPrice = Double.parseDouble(scanner.nextLine());
        double fruitsKiloPrice = Double.parseDouble(scanner.nextLine());
        int vegetablesKiloQunty = Integer.parseInt(scanner.nextLine());
        int fruitslesKiloQunty = Integer.parseInt(scanner.nextLine());

        double vegetablesTotalsum = vegetablesKiloPrice * vegetablesKiloQunty;
        double fruitsTotalSum = fruitsKiloPrice * fruitslesKiloQunty;
        double totalSum = fruitsTotalSum + vegetablesTotalsum;
        double totalSumInEuros = totalSum / 1.94;
        System.out.printf("%.2f", totalSumInEuros);
    }
}
