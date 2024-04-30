package FirstStepsInCodingAdditionalExercises;

import java.util.Scanner;

public class fishMarket06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Паламуд – 60% по-скъп от скумрията
        //•	Сафрид – 80% по-скъп от цацата
        //•	Миди – 7.50 лв. за килограм

        double mackerelsPricePerKilo = Double.parseDouble(scanner.nextLine());
        double spratsPricePerKilo = Double.parseDouble(scanner.nextLine());
        double palamudsKilos = Double.parseDouble(scanner.nextLine());
        double safridsKilos = Double.parseDouble(scanner.nextLine());
        int musselsKilos = Integer.parseInt(scanner.nextLine());

        double palamudsPricePerKilo = mackerelsPricePerKilo + mackerelsPricePerKilo * 0.60;
        double palamudsTotalSum = palamudsKilos * palamudsPricePerKilo;
        double safridsPricePerKilo = spratsPricePerKilo + spratsPricePerKilo * 0.80;
        double safridsTotalSum = safridsKilos * safridsPricePerKilo;
        double musselsTotalSum = musselsKilos * 7.50;
        double totalSum = palamudsTotalSum + safridsTotalSum + musselsTotalSum;
        System.out.printf("%.2f", totalSum);
    }
}
