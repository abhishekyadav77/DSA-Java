import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(67);
        list.add(29);
        list.add(65);
        list.add(45);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);

        System.out.println(list);

        list.contains(67);

        list.remove(3);
        System.out.println(list);
        for (int i=0 ;i<5; i++){
            System.out.println(list.get(i));

        }
        System.out.println(list);

    }
}
