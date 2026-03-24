import java.util.Scanner;

public class array_Input {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter array Size :");

        int size = inp.nextInt();

        int num[]=new int[size];
        //input
        System.out.println("Enter array elements");
        for (int i=0; i<size; i++){
            num[i]= inp.nextInt();
        }
//output
        for(int i =0 ; i<size; i++){
            System.out.println(num[i]);
        }
    }
}
