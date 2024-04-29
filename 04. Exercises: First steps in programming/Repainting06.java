package ExerciseFirstStepsInCoding04;

import java.util.Scanner;

public class Repainting06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylonInSquareMeters = Integer.parseInt(scanner.nextLine());
        int paintInLiters = Integer.parseInt(scanner.nextLine());
        int paintThinnerInLiters = Integer.parseInt(scanner.nextLine());
        int totalHoursRequired = Integer.parseInt(scanner.nextLine());

        double nylonSum = (nylonInSquareMeters + 2) * 1.50;
        double tenPercentOfPaint = paintInLiters * 0.10;
        double paintSum = (paintInLiters + tenPercentOfPaint) * 14.50;
        double paintThinnerSum = paintThinnerInLiters * 5;
        double plasticBag = 0.40;
        double totalSumForEquipment = nylonSum + paintSum + paintThinnerSum + plasticBag;
        double totalSumForWorkers = (totalSumForEquipment * 0.30) * totalHoursRequired;
        double totalSum = totalSumForWorkers + totalSumForEquipment;
        System.out.println(totalSum);
    }
}
