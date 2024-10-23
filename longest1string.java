import java.util.Scanner;

public class longest1string {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        System.out.println(findMaxCount(s));
    }

    public static int findMaxCount(String s) {
        int maxcount = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            } else {
                if (count > maxcount) {
                    maxcount=count;  // Add the excess over 2
                }
                count = 0;  // Reset count for next sequence
            }
        }
        
        // Check the last sequence if string ends with 'p'
        if (count > maxcount) {
            maxcount=count;  // Add the excess over 2
        }

        return maxcount;
    }
    
}
