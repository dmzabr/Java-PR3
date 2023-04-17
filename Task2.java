import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;


public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rd = new Random();
        int sum = 0;
        for (int i = 0; i < 100; i++)
        {
            list.add(rd.nextInt(50));
            sum = sum + list.get(i);
        }

        System.out.println("Минимальное - " + Collections.min(list) + "\nМаксимальное - " + Collections.max(list) + "\nСреднее - " + sum / list.size());
    }
}