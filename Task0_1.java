import java.util.Arrays;
import java.util.Scanner;

public class Task0_1 {
    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[start + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = start;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
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
        mergeSort(arr, 0, n-1);
        System.out.println("Сортированыый массив: " + Arrays.toString(arr));
    }
}
