import java.util.Scanner;

public class three_inputs {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter an integer, a character, an integer: ");
        int num1 = scan.nextInt();
        char ch = scan.next().charAt(0);
        int num2 = scan.nextInt();
        if (ch=='+') {
            System.out.println(num1 + num2);
        }
        else if (ch=='-') {
            System.out.println(num1 - num2);
        }
        else if (ch=='*') {
            System.out.println(num1 * num2);
        }
        else if (ch=='/') {
            System.out.println(num1 / num2);
        }
        else if (ch=='%') {
            System.out.println(num1 % num2);
        }
        else {
            System.out.println("invalid character");
        }
    }
}