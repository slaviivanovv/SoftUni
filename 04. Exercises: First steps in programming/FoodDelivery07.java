package ExerciseFirstStepsInCoding04;

import java.util.Scanner;

public class FoodDelivery07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chikenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int veganMenus = Integer.parseInt(scanner.nextLine());

        double chikenMenusPrice = chikenMenus * 10.35;
        double fishMenusPrice = fishMenus * 12.40;
        double veganMenusPrice = veganMenus * 8.15;
        double totalPriceForTheMenus = chikenMenusPrice + fishMenusPrice + veganMenusPrice;
        double totalPriceTwentyPercent = totalPriceForTheMenus * 0.20;
        double desertPrice = totalPriceTwentyPercent;
        double deliveryPrice = 2.50;
        double totalOrderPrice = totalPriceForTheMenus + desertPrice + deliveryPrice;
        System.out.println(totalOrderPrice);
    }
}

