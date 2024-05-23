package ConditionalStatementsLab;

import java.util.Scanner;

public class GreatNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        if (number > number2) {
            System.out.println(number);
        } else {
            System.out.println(number2);
        }
    }
}
