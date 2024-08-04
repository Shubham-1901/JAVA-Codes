import java.util.*;

public class Third {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int i, j, key;
        int arr[];
        arr = new int[N];
        for (i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        for (i = 1; i < N; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j -= 1;
                arr[j + 1] = key;
            }
        }
        System.out.println("Third largest number: " + arr[N - 3]);
    }
}