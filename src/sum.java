import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        sum();

    }

    static void sum() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2");
        int num2 = sc.nextInt();
        int sum = num2+num1;
        System.out.println("The sum of two numbers is " +sum);

    }
}
