import java.util.*;

public class mojitaba {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean easy = false;
        boolean hard = false;

        for (int i = 0; i < n; i++) {

            int x = sc.nextInt();

            if (x <= 10)
                easy = true;

            if (x >= 90)
                hard = true;
        }

        if (easy && hard)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}