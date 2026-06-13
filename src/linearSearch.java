public class linearSearch {
    public static void main(String[] args) {

        int[] nums = {1, 354, 67, 23,-3,11,-2,76};
        int target = 67;
        int ans = linearsearch2(nums,target);
        System.out.println(ans);
    }

    // search the target and return the element
    static int linearsearch2 (int[] arr, int target){
        if (arr.length==0){
            return -1;
        }

//    static int linearsearch (int[] arr, int target){
//        if (arr.length==0){
//            return -1;
//        }
// run for a loop
        for (int index =0; index<arr.length; index++){
            // check for element at every index if it is = target
            int element = arr[index];
            if(element== target){
                return element;
            }


        }
        //this line wil execute if none of the return statements

        return -1;

    }

}
