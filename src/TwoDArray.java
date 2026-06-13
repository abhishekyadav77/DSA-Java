import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter row and column");

                int row= sc.nextInt();
        int col = sc.nextInt();

        int num[][] = new int[row][col];

        //input
        for(int i=0; i<row ; i++ ){
            //col
            for(int j=0; j<col;j++){
                num[i][j]= sc.nextInt();
            }
        }

        //output
        for(int i=0; i<row;i++){
            for(int j = 0; j<col;j++){
                System.out.println(num[i][j] + " ");

            }
            System.out.println();
        }


    }
}
