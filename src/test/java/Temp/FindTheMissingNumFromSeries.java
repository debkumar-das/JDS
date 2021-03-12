package Temp;

import java.util.Arrays;

public class FindTheMissingNumFromSeries {
    
    public static void main(String[] args) {
        int[] ar={5,2,4,1};
        Arrays.sort(ar);
        //System.out.println(ar[0]);
        int ininum=ar[0];
        //int missingnum=0;
        for(int i =0;i<ar.length;i++)
        {
            if(ininum==ar[i])
            {
                ininum=ininum+1;
                //System.out.println(ar[i]);
            }
        }
        System.out.println("The Missing Number - "+ininum);
    }
}
