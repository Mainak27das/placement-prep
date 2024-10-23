import java.util.Scanner;

public class bulbswitch {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); // size of the array
        int arr[] = new int[size];

        // Input array elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        
            System.out.println(findtotalSwitchs(arr));
        
    }

    // Function to perform right shift on array
    public static int findtotalSwitchs(int arr[]) {
        int swtichs=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                if(swtichs%2==0){
                    swtichs++;
                }
               
            }
           else if (arr[i]==1){
                if(swtichs%2!=0){
                    swtichs++;
                }
                
            }
        }
        return  swtichs;
        
    }
    
}
