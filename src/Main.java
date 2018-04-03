import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 5, 4, 3, 2, 1, 1, 0, 0, 0, -7};
        bubbleSort(arr);
        System.out.println(getMaxFromArray(arr));
    }

    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static int getMaxFromArray(int[] array) {
        int indexMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[indexMax]) {
                indexMax = i;
            }
        }

        return array[indexMax];
    }

    public static int getMinFromArray(int[] array) {
        int indexMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[indexMin]) {
                indexMin = i;
            }
        }
        return array[indexMin];
    }

}
