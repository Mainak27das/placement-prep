import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class findoccuranceofSecondLargest {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        
        int size=sc.nextInt();
        int arr[]= new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
       System.out.println(findOccurenceOfsecondLargest(arr));
    }
     public static int findOccurenceOfsecondLargest(int arr[]){
        
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int arr1[]= new int[set.size()];
        int idx=0;
        for(int num: set){
            arr1[idx++]=num;
        }
        Arrays.sort(arr1);
       
        if(set.size()==1)
        return -1;
        
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr1[arr1.length-2])
            count++;
        }
        return count;
     }
}
