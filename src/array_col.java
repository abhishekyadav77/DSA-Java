public class array_col {
    public static void main(String[] args) {
        int arr[][]= {
                {1,3,4,8},
                {2,9},
                {1,8,4}
        };
        for (int row = 0; row<arr.length; row++){
            for (int col =0;col<arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
