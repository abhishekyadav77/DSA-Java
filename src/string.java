import java.util.Scanner;

public class string {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your Name");
//        String name = input.next();
//        System.out.println("your name is " + name);
//        // string declaration
//        String name = "Abhhishek";
//        String fName = "Yadav";
//
    //concatenation
        String fName = "Abhi";
        String Lname = "Yadav";
//        String fullName = fName +" "+ Lname;
//        System.out.println(fullName);
//// printing length of a string
//        System.out.println(fullName.length());
//        // char at
//        for (int i = 0 ;i<fullName.length(); i++){
//            System.out.println(fullName.charAt(i));
        if (fName.compareTo(Lname)==0){
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }
    }


}
