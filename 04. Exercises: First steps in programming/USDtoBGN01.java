package ExerciseFirstStepsInCoding04;

import java.util.Scanner;

public class USDtoBGN01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double usd = Double.parseDouble(scanner.nextLine());
        Double bgn = 1.79549;
        Double result = bgn * usd;
        System.out.println(result);
    }
}

