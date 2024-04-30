package FirstStepsInCodingAdditionalExercises;

import java.util.Scanner;

public class HousePainting07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	x – височината на къщата – реално число в интервала [2...100]
        //2.	y – дължината на страничната стена – реално число в интервала [2...100]
        //3.	h – височината на триъгълната стена на прокрива – реално число в интервала [2...100]

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double sideWallArea = x * y;
        double windowArea = 1.5 * 1.5;
        double bothSides = 2 * sideWallArea - 2 * windowArea;
        double backWall = x * x;
        double entrance = 1.2 * 2;
        double frontAndBack = 2 * backWall - entrance;
        double totalArea = bothSides + frontAndBack;
        double greenPaint = totalArea / 3.4;

        //roof

        double twoRectanglesOnTheRoof = 2 * (x * y);
        double theTwoRectangles = 2 * (x * h / 2);
        double allTotalArea = theTwoRectangles + twoRectanglesOnTheRoof;
        double redPaint = allTotalArea / 4.3;
        System.out.printf("%.2f\n", greenPaint);
        System.out.printf("%.2f\n", redPaint);

    }
}
