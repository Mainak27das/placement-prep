import java.util.Scanner;

public class minimumHouse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int unit = sc.nextInt();
        int size = sc.nextInt(); // size of the array
        int arr[] = new int[size];

        // Input array elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(findMinimumHouses(arr, r, unit));

    }

    // Function to perform right shift on array
    public static int findMinimumHouses(int arr[], int r, int unit) {
        int totalfood = r * unit;
        if (arr.length == 0)
            return -1;
        int minhousesfood = 0;
        int minhouses = 0;
        for (int i = 0; i < arr.length; i++) {
            
            if (minhousesfood >= totalfood) {
                break;
            }
            minhousesfood += arr[i];
            minhouses++;
        }

        return minhouses;

    }

}
