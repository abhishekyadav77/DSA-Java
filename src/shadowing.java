public class shadowing {
    static int x = 90; // this is shadowed if the x is declared again in another block or another method
    public static void main(String[] args) {
        int x = 56;
      //  System.out.println(x);  // scope is begin when value is intialised
        fun();
    }

    static void fun(){
        System.out.println(x);

    }
}
