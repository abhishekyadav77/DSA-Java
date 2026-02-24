public class scope {

        public static void main(String[] args) {
            int a = 10;
            int b= 20;
        }
        {
            int a = 456;
            // above the block there is no use is allowed outside the block

        }
        static void scope1 (){
            int num = 45;
            System.out.println(num);


        }
        // the outside declared used in inside the other function but inside functions declared is not used in outside
    }


