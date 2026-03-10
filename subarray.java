import java.util.*;

public class Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int start = 0;
        int sum = 0;
        boolean found = false;

        for (int end = 0; end < n; end++) {

            sum += arr[end];

            while (sum > k && start <= end) {
                sum -= arr[start];
                start++;
            }

            if (sum == k) {
                System.out.println((start + 1) + " " + (end + 1));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("-1");
        }
    }
}