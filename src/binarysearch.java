public class binarysearch {
    public static void main(String[] args) {
        int[] arr = { 12,14,18,22,65,66,70,75,80};
        int target = 22;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }

    static int binarysearch (int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            // find middle element
            int mid = start + (end -start)/2;   //might be possible start and end exceed range in java

            if (target<arr[mid]) {
                end = mid -1;
            } else if (target>arr[mid]) {
                start = mid +1;

            }
            else {

                return mid;
            }

        }
        return -1;
    }
}
