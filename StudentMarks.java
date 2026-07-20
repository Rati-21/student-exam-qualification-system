import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Exam Qualification Calculator ---");
        System.out.println("Please enter your marks (0-100) for each assessment.");

        System.out.print("Enter mark for Test 1 (30% weight): ");
        double test1 = getValidMark(scanner);

        System.out.print("Enter mark for Test 2 (50% weight): ");
        double test2 = getValidMark(scanner);

        System.out.print("Enter mark for Assignment 1 (10% weight): ");
        double assignment1 = getValidMark(scanner);

        System.out.print("Enter mark for Project (10% weight): ");
        double project = getValidMark(scanner);

        double weightedAverage = (test1 * 0.30) +
                                 (test2 * 0.50) +
                                 (assignment1 * 0.10) +
                                 (project * 0.10);

        System.out.printf("\nCalculated Weighted Average: %.2f%%%n", weightedAverage);

        if (weightedAverage >= 50) {
            System.out.println("Result: Congratulations, you QUALIFY to write the exam!");
        } else {
            System.out.println("Result: Unfortunately, you DO NOT QUALIFY to write the exam");
        }

        scanner.close();
    }

    private static double getValidMark(Scanner scanner) {
        double mark;
        while (true) {
            if (scanner.hasNextDouble()) {
                mark = scanner.nextDouble();
                if (mark >= 0 && mark <= 100) {
                    break;
                } else {
                    System.out.print("Invalid mark. Please enter a number between 0 and 100: ");
                }
            } else {
                System.out.print("Invalid input. Please enter a number: ");
                scanner.next();
            }
        }
        return mark;
    }
}