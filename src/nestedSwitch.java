import java.util.Scanner;

public class nestedSwitch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a emp ID");
        int empID = sc.nextInt();

        System.out.println("Enter a department");
        String Department = sc.next();

        switch (empID) {
            case 1 -> System.out.println("Abhishek Yadav");
            case 2 -> System.out.println("Abhinav");
            case 3 -> System.out.println("Amod");
            case 4 -> {
                switch (Department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "CS":
                        System.out.println("CSE Department");
                        break;
                    default:
                        System.out.println("Enter a valid input");

                }
            }
            default -> System.out.println("Enter a valid input");
        }

//        switch (empID) {
//            case 1:
//                System.out.println("Abhishek Yadav");
//                break;
//
//            case 2:
//                System.out.println("Abhinav");
//                break;
//            case 3:
//                System.out.println("Amod");
//                break;
//            case 4:
//                switch (Department){
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "CS":
//                        System.out.println("CSE Department");
//                        break;
//                    default :
//                        System.out.println("Enter a valid input");
//
//                }
//                break;
//
//            default:
//                System.out.println("Enter a valid input");
//        }

    }
}
