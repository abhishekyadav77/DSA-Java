import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        System.out.println("Enter a Fruit");
//        String fruit = in.next();
//
//       if (fruit.equals("mango")) {
//           System.out.println("King of fruit");
//       }
//
//       if (fruit.equals("apple")) {
//           System.out.println("a sweet red fruit");
//       }
//
//
//
//        switch(fruit) {
//            case "Mango" :
//                System.out.println("King of fruits");
//                break;
//            case "Apple":
//                System.out.println("A Sweet red fruit");
//                break;
//            case "Grape":
//                System.out.println("Small fruit");
//                break;
//            default:
//                System.out.println("Enter valid input");
//        }

        System.out.println("Enter a No. for week day");
        Scanner sc= new Scanner(System.in);
        int day = sc.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Enter a valid input ");
                break;
        }
        }
}
