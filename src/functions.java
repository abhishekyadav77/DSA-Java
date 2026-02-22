import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        // taken input of two numbers and print the sum

        int num1, num2, sum;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        System.out.println("Enter a first number");
         num1 = sc.nextInt();

        System.out.println("Enter a second Number");
         num2 = sc.nextInt();
         sum = num2+num1;

        System.out.println("The sum of two numbers is " + sum);



    }
}
