import java.util.Scanner;

public class PatternProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char again;

        do {
            System.out.println("\nChoose a pattern to print:");
            System.out.println("1. Square of stars");
            System.out.println("2. Increasing triangle");
            System.out.println("3. Right-aligned triangle");
            System.out.println("4. Pyramid");
            System.out.println("5. Number pattern");

            System.out.print("Enter your choice (1–5): ");
            int choice = sc.nextInt();

            switch (choice) {

                // i) Square of stars
                case 1:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 8; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                // ii) Increasing triangle
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                // iii) Right aligned triangle
                case 3:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                // iv) Pyramid
                case 4:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= (2 * i - 1); k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                // v) Number pattern
                case 5:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= (2 * i - 1); j++) {
                            System.out.print(i);
                        }
                        System.out.println();
                    }
                    break;

                default:
                    System.out.println("Invalid choice! Please enter between 1–5.");
            }

            System.out.print("\nDo you want to print another pattern? (y/n): ");
            again = sc.next().charAt(0);

        } while (again == 'y' || again == 'Y');

        System.out.println("Program ended. Goodbye!");
        sc.close();
    }
}
