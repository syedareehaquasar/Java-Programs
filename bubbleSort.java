import java.util.Scanner;

public class bubbleSort {
    void sort(int[] arr, int n) {
        int temp;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

    }

    public static void main(String[] args) {
        bubbleSort sort = new bubbleSort();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array ");
        n = sc.nextInt();
        var arr = new int[n];
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        sort.sort(arr, n);
    }
}
