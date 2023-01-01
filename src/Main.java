import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        isEvenNumber(number);

    }

    public static boolean isEvenNumber(int number) {
        while
        (number % 2 == 0) {
            System.out.println(number + " is an even number");
            return true;
        }
        System.out.println(number + " is not an even number");
        return false;
    }
}
