package Daily;

import java.util.Arrays;
import java.util.Scanner;

public class PermutationsOfString {
    
    public static void main(String[] args) {
         
        Scanner sc= new Scanner(System.in); 
        int a= sc.nextInt();
        if(a>0){
        for(int i=0;i<=a;i++)
        {
         String str= sc.nextLine();
         int len=str.length();
         PermutationsOfString permutation = new PermutationsOfString(); 
         char tempArray[] = str.toCharArray(); 
         Arrays.sort(tempArray);
         //System.out.println(String.valueOf(tempArray));
         permutation.permute(String.valueOf(tempArray), 0, len-1); 
        }

        }
        sc.close();
    }
    private void permute(String str, int l, int r) 
    { 
        if (l == r) {
            System.out.println(str); 
        }
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                permute(str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
    } 
    public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 


}
