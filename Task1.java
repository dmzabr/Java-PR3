import java.util.ArrayList;
import java.util.Random;


public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rd = new Random();

        for (int i = 0; i < 100; i++)
        {
            list.add(rd.nextInt(50));
        }

        list.removeIf(number -> number % 2 == 0);
        System.out.println(list);
    }
}
