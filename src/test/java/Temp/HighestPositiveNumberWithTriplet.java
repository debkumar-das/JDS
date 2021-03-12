package Temp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * [-7,5,3,1,2,7] == 5*3*7 [Highest Positive Number with 3 dight] [-8,-7,5,3,1,2,7] =
 * -8*-7*7
 */
public class HighestPositiveNumberWithTriplet {

    public static void main(String[] args) {
        int[] arr = {-8,-7,5,3,1,2,7};
        Arrays.sort(arr);
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            // Simple check for +ve/-ve
            if (n >= 0) {
                positive.add(n);
            } else {
                negative.add(n);
            }
        }
    double num1NegativeCheck=negative.get(0)*negative.get(1)*positive.get(positive.size()-1);
    double num1PositiveCheck=positive.get(positive.size()-1)*positive.get(positive.size()-2)*positive.get(positive.size()-3);
    if(num1PositiveCheck>num1NegativeCheck)
    {
        System.out.println("The triplet which is having highest multiplications are: ["+
        positive.get(positive.size()-1)+", "+positive.get(positive.size()-2)+", "+
        positive.get(positive.size()-3)+"]");
        System.out.println("The Multipication value is :"+num1PositiveCheck);
    }
    else{
        System.out.println("The triplet which is having highest multiplications are: ["+
        negative.get(0)+", "+negative.get(1)+", "+
        positive.get(positive.size()-1)+"]");
        System.out.println("The Multipication value is :"+num1NegativeCheck);
    }    
    }
   
}
