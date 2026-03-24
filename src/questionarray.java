import java.util.Scanner;
// take an array as an input from the user. search for a given number x and print the index at which it occurs


public class questionarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter no. of elements on array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter array elements");

        for(int i= 0; i<size; i++) {
             arr[i]= sc.nextInt();
        }
        System.out.println("Enter number to find index of an array");
 int x = sc.nextInt();

        //output
        for(int i=0; i<arr.length; i++){
            if(arr[i] ==x){
                System.out.println("The index of array is " +i);
            }


        }



    }
}
