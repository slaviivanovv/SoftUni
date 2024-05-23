package ConditionalStatementsLab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        if (figure.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", side * side);

        } else if (figure.equals("rectangle")) {
            double side = Double.parseDouble(scanner.nextLine());
            double side2 = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", side * side2);

        } else if (figure.equals("circle")) {
            double circleRadius = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", Math.PI * (circleRadius * circleRadius));

        } else if (figure.equals("triangle")) {
            double side = Double.parseDouble(scanner.nextLine());
            double side2 = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", side * side2 / 2);
        }
    }
}
