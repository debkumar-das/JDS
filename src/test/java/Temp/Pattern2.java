package Temp;

import java.util.Scanner;

/**
 * Print the pattern -
 * A
   A B
   A B C
   A B C D
   A B C D E
   A B C D E F
 */
public class Pattern2 {
    
    public static void main(String[] args) {
        System.out.println("Enter number of rows: ");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=65;j<65+i;j++)
            {
                char b = (char) j;
                System.out.print(b+" ");
            }
            System.out.println();
            
        }

        sc.close();
    }
}
