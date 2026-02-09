import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Find largest among the three numbers

//        int max = a;
//        if(b>max){
//            max=b;
//        }
//        if(c>max){
//            max=c;
//        }
//        else{
//            max = a;
//        }
//
//        System.out.println("The maximun among them are "+max);



        int max = Math.max(c, Math.max(a,b));
        System.out.println(max);


    }
}
