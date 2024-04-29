package ExerciseFirstStepsInCoding04;

import java.util.Scanner;

public class SuppliesForSchool05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double packetPens = Double.parseDouble(scanner.nextLine());
        double packetMarkers = Double.parseDouble(scanner.nextLine());
        double litersCleaningAgent = Double.parseDouble(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());


        double priceOfPacketPens = packetPens * 5.80;
        double priceOfPacketMarkers = packetMarkers * 7.20;
        double priceOfCleaningAgent = litersCleaningAgent * 1.20;
        double totalSum = priceOfPacketPens + priceOfPacketMarkers + priceOfCleaningAgent;
        double discountTotal = discount / 100;
        double totalPriceWithDiscount = totalSum - (totalSum * discountTotal);
        System.out.println(totalPriceWithDiscount);
    }
}