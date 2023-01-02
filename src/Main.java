import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        isEvenNumber(number);

        int number2 = 4;
        int finishNumber = 20;
        int evenCount = 0;
        int oddCount = 0;

        while (number2 <= finishNumber) {
            number2++;
            if (!isEven(number2)) {
                oddCount++;
                continue;
            }
            System.out.println("Even number " + number2);
            evenCount++;
            if (evenCount >=  5) {
                break;
            }
        }
        System.out.println("Total odd numbers found = " + oddCount);
        System.out.println("Total even numbers found = " + evenCount);
    }



    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
            return true;
        } else {
            System.out.println(number + " is not an even number");
            return false;
        }
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
