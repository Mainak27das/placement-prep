import java.util.Scanner;

public class baseconverter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Input base and number
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        
        sc.close();
        
        // Convert and print the result
        System.out.println("Converted number: " + baseConverter(base, number));
    }

    // Function to perform base conversion
    public static String baseConverter(int base, int number) {
        String str2 = "";
        int rem;
        String words = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        // Loop until number becomes 0
        while (number > 0) {
            rem = number % base; // Get the remainder
            
            if (rem >= 10) {
                // Convert 10-35 to 'A'-'Z'
                str2 = words.charAt(rem - 10) + str2;
            } else {
                // Convert 0-9 to '0'-'9'
                str2 = rem + str2;
            }
            
            number /= base; // Reduce the number
        }
        
        return str2; // Return the final converted string
    }
}
