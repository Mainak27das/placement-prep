
import java.util.Scanner;
public class stringlength {
    public static int lengthOfString(String str) {
        int cnt = 0;
        for (char ch : str.toCharArray()) {
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine(); // shubham
        System.out.println(lengthOfString(string)); // Output: 7
    }
}