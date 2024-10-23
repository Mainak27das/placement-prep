import java.util.Scanner;

public class rightshift {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of rotations
        int size = sc.nextInt(); // size of the array
        int arr[] = new int[size];

        // Input array elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // Call the right shift function
        int newarr[] = findrightshiftdarray(arr, n);

        // Print the shifted array
        for (int i = 0; i < newarr.length; i++) {
            System.out.println(newarr[i]);
        }
    }

    // Function to perform right shift on array
    public static int[] findrightshiftdarray(int arr[], int n) {
        int size = arr.length;
        int rotate[] = new int[size];

        // Handle case where n is larger than the array size
        n = n % size;

        // Shift the last 'n' elements to the front
        for (int i = 0; i < n; i++) {
            rotate[i] = arr[size - n + i];
        }

        // Shift the remaining elements
        int j = 0;
        for (int i = n; i < size; i++) {
            rotate[i] = arr[j++];
        }

        return rotate;
    }
}
