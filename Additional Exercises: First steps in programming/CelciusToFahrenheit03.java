package FirstStepsInCodingAdditionalExercises;

import java.util.Scanner;

public class CelciusToFahrenheit03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celcius = Double.parseDouble(scanner.nextLine());
        double fahrenheit = celcius * 1.8000 + 32;
        System.out.printf("%.2f", fahrenheit);
    }
}
