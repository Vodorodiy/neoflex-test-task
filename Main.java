import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberConverter converter = new NumberConverter();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose command:");
            System.out.println("1. Convert decimal to binary");
            System.out.println("2. Convert decimal to hex");
            System.out.println("3. Convert binary to decimal");
            System.out.println("0. Exit");
            System.out.println();

            int command = scanner.nextInt();
            scanner.nextLine();

            if (command == 0)
                break;

            System.out.println("Enter number to convert:");
            String number = scanner.nextLine();

            switch (command) {
                case 1 -> converter.run(NumeralBase.BINARY, number);
                case 2 -> converter.run(NumeralBase.HEX, number);
                case 3 -> converter.run(NumeralBase.DECIMAL, number);
                default -> System.out.println("Unknown command");
            }

            System.out.println();
        }
    }
}
