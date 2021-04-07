package Temp;

import java.util.Scanner;

/**
 * Print the pattern -
 * A
   B B
   C C C
   D D D D
   E E E E E
   F F F F F F
 */
class Pattern5
{
public static void main(String[] args) {
    System.out.println("Enter number of rows: ");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int k=1;k<=i;k++)
            {
                int j=64+i;
                char b = (char) j;
                System.out.print(b+" ");
            }
            System.out.println();
            
        }

        sc.close();
}
}