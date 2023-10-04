package Calculator1;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Real real = new Real();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your operation ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulo");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter the first number: ");
                real.setNumber_1(scanner.nextFloat());
                System.out.print("Enter the second number: ");
                real.setNumber_2(scanner.nextFloat());
                System.out.println("Result: " + real.add());
                break;
            case 2:
                System.out.print("Enter the first number: ");
                real.setNumber_1(scanner.nextFloat());
                System.out.print("Enter the second number: ");
                real.setNumber_2(scanner.nextFloat());
                System.out.println("Result: " + real.subtract());
                break;
            case 3:
                System.out.print("Enter the first number: ");
                real.setNumber_1(scanner.nextFloat());
                System.out.print("Enter the second number: ");
                real.setNumber_2(scanner.nextFloat());
                System.out.println("Result: " + real.multiply());
                break;
            case 4:
                System.out.print("Enter the first number: ");
                real.setNumber_1(scanner.nextFloat());
                System.out.print("Enter the second number: ");
                real.setNumber_2(scanner.nextFloat());
                System.out.println("Result: " + real.division());
                break;
            case 5:
                System.out.println("Exiting the calculator.");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
