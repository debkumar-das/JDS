package Temp;

import java.util.Scanner;

/**
 * Print the pattern -
 //*
   * *
   * * * 
   * * * *
   * * * * *
 */
public class Pattern4 {
    
    public static void main(String[] args) {
        System.out.println("Enter number of rows: ");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {

            // for(int j=i;j<=num;j++)
            // {
                
            //     System.out.print(" ");
            // }
            for(int j=0;j<i;j++)
            {
                
                System.out.print("* ");
            }
            System.out.println();
            
        }

        sc.close();
    
    }
}
