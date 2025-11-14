import java.util.Scanner;

public class maxSequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sequence of non-negative integers (end the sequence with zero):");

        int num = sc.nextInt();

        // Stop reading numbers when 0 is entered

        if (num == 0) {
            System.out.println("No numbers were entered.");
            return;
        }

        int max = num; // initialize max with the first number, so updating the "num"

        while (true) {
            num = sc.nextInt(); // read next number

            if (num == 0) {
                break; // end the loop when zero entered
            }

            if (num > max) {
                max = num; // update max
            }
        }

        System.out.println("The maximum number out of the sequence is: " + max);
    }
}
