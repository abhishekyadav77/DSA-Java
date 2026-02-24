import java.util.Arrays;

public class changeValue {
    public static void main(String[] args) {

        int[] arr = {1,3,5,7,8};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0]= 99;
    }
}
