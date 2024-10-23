import java.util.*;

public class hyphen {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input base and number
        String s = sc.nextLine();

        sc.close();
        System.out.println(baseConverter(s));
    }

    // Function to perform base conversion
    public static String baseConverter(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-') {
                str = s.charAt(i) + str;

            } else {
                str = str + s.charAt(i);
            }

        }
        return str;

    }

}
