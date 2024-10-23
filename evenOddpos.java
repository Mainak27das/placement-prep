import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class evenOddpos {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); // size of the array
        int arr[] = new int[size];

        // Input array elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        
            System.out.println(findiff(arr));
        
    }

    // Function to perform right shift on array
    public static int findiff(int arr[]) {
        ArrayList<Integer>evenlist=new ArrayList<>();
        ArrayList<Integer>oddlist=new ArrayList<>();

       for(int i=0;i<arr.length;i++){
        if(i%2==0){
            evenlist.add(arr[i]);

        }
        else{
            oddlist.add(arr[i]);
        }
       }
        Collections.sort(evenlist);
        Collections.sort(oddlist);

        int secondLargest=0;
        int secondSmallest=0;
        if(evenlist.size()==1){
            secondSmallest=evenlist.get(0);
        }
        else{
            secondSmallest=evenlist.get(1);
        }
        if(oddlist.size()==1){
            secondLargest=oddlist.get(0);
        }
        else{
            secondLargest=oddlist.get(oddlist.size()-2);
        }

     return Math.abs(secondLargest-secondSmallest);


    }
    
}
