public class richestconsumerwealth1672 {
    public static void main(String[] args) {

    }
    public int maximumwealth(int [][] accounts ){

        // person = row
        //account = col

        int ans = Integer.MAX_VALUE;
        for (int person= 0; person<accounts.length; person++){
            int sum = 0;

            // when start a new column take a new sum for that row
            for (int account = 0; account<accounts[person].length; account++){
                sum = sum + accounts[person][account];

            }
            //now we have sum of acount sof person
            // check wit overall ans
            if (sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}
