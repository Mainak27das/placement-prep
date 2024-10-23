import java.util.Scanner;

public class findmaxcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        System.out.println(findMaxCount(s));
    }

    public static int findMaxCount(String s) {
        int totalCount = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                count++;
            } else {
                if (count > 2) {
                    totalCount += (count - 2);  // Add the excess over 2
                }
                count = 0;  // Reset count for next sequence
            }
        }
        
        // Check the last sequence if string ends with 'p'
        if (count > 2) {
            totalCount += (count - 2);
        }

        return totalCount;
    }
}
