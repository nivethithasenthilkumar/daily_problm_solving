import java.util.*;

public class AnagramCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        if (s.length() != t.length()) {
            System.out.println("false");
            return;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        boolean flag = true;

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                flag = false;
                break;
            }
        }

        if (flag)
            System.out.println("true");
        else
            System.out.println("false");
    }
}