public class methodOverloading {
    public static void main(String[] args) {
    fun(67);
    fun("abhishek");
    int ans = sum(4, 8, 34);
        System.out.println(ans);
    }
    static int sum (int a , int b){
        return a+b;

    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }

    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
// the same name functions is used but they hold different data types
    }

}
