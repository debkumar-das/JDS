package Temp;

import java.util.ArrayList;
import java.util.List;

/**
 *  List<Float> bag=[1.99,2.0,1.01,1.01,2.7]
 *  Weight should not exceed more that 3.00.
 *  Find minmum number requreid to clean those bags?
 */
class PlasticBagProb
{
    public static void main(String[] args) {
    List<Float> a1=new ArrayList<Float>();
    a1.add(1.99f);
    a1.add(1.01f);
    a1.add(1.01f);
    a1.add(1.01f);
    a1.add(1.01f);
    a1.add(2.01f);
    a1.add(1.51f);
    a1.add(0.61f);
    System.out.println("List of Bags:"+a1);
    int sizeOfArray=a1.size();
    float baseweight=3f;
    int bestFit=nextFit(a1, sizeOfArray, baseweight);
    System.out.println("Number of bins required in Next Fit : " +bestFit);
    }

    static int nextFit(List<Float> weight, int n, float c)
    {
 
        // Initialize result (Count of bins) and remaining
        // capacity in current bin.
        int res = 0;
        float bin_rem = c;
 
        // Place items one by one
        for (int i = 0; i < n; i++) {
            // If this item can't fit in current bin
            if (weight.get(i) > bin_rem) {
                res++; // Use a new bin
                bin_rem = c - weight.get(i);
            }
            else
                bin_rem -= weight.get(i);
        }
        return res;
    }
    
}