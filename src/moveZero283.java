public class moveZero283 {
    public static void main(String[] args) {

    }
    public void moveZeroes (int[] nums) {
        int n = nums.length;

        int left =0;

        for(int right = 0; right<n; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left]= temp;
                left ++;
            }
        }
    }
}
