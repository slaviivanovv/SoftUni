package ExerciseFirstStepsInCoding04;

import java.util.Scanner;

public class BasketballEquipmen08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearlySubscriptionPayment = Integer.parseInt(scanner.nextLine());


        double shoesPrice = yearlySubscriptionPayment - (yearlySubscriptionPayment * 0.40);
        double clothesPRice = shoesPrice - (shoesPrice * 0.20);
        double ballPrice = clothesPRice / 4;
        double basketballAccessories = ballPrice / 5;
        double totalPriceForEquipment = yearlySubscriptionPayment + shoesPrice + clothesPRice + ballPrice + basketballAccessories;
        System.out.println(totalPriceForEquipment);
    }
}
