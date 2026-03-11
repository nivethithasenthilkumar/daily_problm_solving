public class append{

    public static int append(String s, String t) {
        int j = 0; // pointer for t

        for (int i = 0; i < s.length(); i++) {
            if (j < t.length() && s.charAt(i) == t.charAt(j)) {
                j++; // move pointer in t when characters match
            }
        }

        return t.length() - j; // remaining characters to append
    }

    public static void main(String[] args) {

        String s = "coaching";
        String t = "coding";

        int result = append(s, t);

        System.out.println("Minimum characters to append: " + result);
    }
}