public class orderAgnosticBinarySearch {
    public static void main(String[] args) {

        int[] arr = { 90,75,18,12,6,4,3,1};
        int target = 18;
        int ans = orderagnostic(arr, target);
        System.out.println(ans);

    }
    static  int orderagnostic (int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        // find whether the array is ascending or in descending order

        boolean isasc= arr[start] <arr[end];


        while (start<=end){
            // find middle element
            int mid = start + (end -start)/2;   //might be possible start and end exceed range in java

            if (arr[mid] == target){
                return mid;
            }

            if (isasc){
                if (target<arr[mid]) {
                    end = mid -1;
                }
                else {
                    start = mid + 1;

                }
            }


            else {
                if (target>arr[mid]) {
                    end = mid -1;
                }
                else{
                    start = mid +1;
                }
            }

            }


        return -1;
    }
}
