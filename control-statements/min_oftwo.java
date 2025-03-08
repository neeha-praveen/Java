import java.util.Scanner;

public class min_oftwo {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("enter number 1: ");
            int num1 = scan.nextInt();
            System.out.println("enter number 2: ");
            int num2 = scan.nextInt();
            int min = num1;
            if (num2<min) {
                min = num2;
            }
            System.out.println("minimum: " + min);
        }
    }
}
