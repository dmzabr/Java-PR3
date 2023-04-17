import java.util.Arrays;
import java.util.Scanner;

public class Task0_2 {
    public static int[] sort(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            int min = count;
            for(int j = count; j < arr.length; j++)
            {
                if (arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            count++;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.print("Введеите размер массива: ");
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Сортированыый массив: " + Arrays.toString(sort(arr)));
    }
}
