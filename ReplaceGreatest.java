import java.util.*;

public class ReplaceGreatest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr2[] = new int[n];

    for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

    for (int i = 0; i < n - 1; i++) {

        int max = arr[i + 1];

            for (int j = i + 1; j < n; j++) {

                if (arr[j] > max) {
                    max = arr[j];
                }
            }

            arr2[i] = max;
        }

        arr2[n - 1] = -1;

        System.out.println(Arrays.toString(arr2));
    }
}