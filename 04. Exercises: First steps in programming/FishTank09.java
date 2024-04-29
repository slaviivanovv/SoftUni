package ExerciseFirstStepsInCoding04;

import java.util.Scanner;

public class FishTank09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthInCentimeters = Integer.parseInt(scanner.nextLine());
        int widthInCentimeters = Integer.parseInt(scanner.nextLine());
        int heightInCentimeters = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double aquariumVolume = lengthInCentimeters * widthInCentimeters * heightInCentimeters;
        double aquariumVolumeInLiters = aquariumVolume * 0.001;
        double spaceTaken = percent / 100;
        double litersRequired = aquariumVolumeInLiters * (1 - spaceTaken);
        System.out.println(litersRequired);
    }
}
