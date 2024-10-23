import java.util.Scanner;

public class maxvowelFreq {
      public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        
       String s=sc.nextLine();
        sc.close();
       System.out.println(findMaxvowelfreq(s));
    }
     public static String findMaxvowelfreq(String s){
        char maxVowel='0';
        int count=0;
        int maxcount=0;
        String vowels="AEIOU";
        
        for(int j=0;j<vowels.length();j++){
            count=0;
            for(int i=0;i<s.length();i++){
               
             
              if( s.charAt(i)==vowels.charAt(j)){
                      count++;
                 }
                 
      
            }
            if(count>maxcount){
                maxcount=count;
                maxVowel=vowels.charAt(j);
               }

        }
        String snew=maxVowel+":"+maxcount;
        return snew;
     }

    }
