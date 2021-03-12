package jds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * [1,1,2,3,4,5,6,8]=7 [1,4,5]=2 [1,2,3]=4 [-5,-4,-3,4,5] ->o/p=1
 */

public class FindLowestPositiveNumberNotPresent {
    
    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<Integer>();
		ar.add(-1);
		ar.add(-3);
		ar.add(-4);
		ar.add(5);
        ar.add(1);
        ar.add(6);
		int minVal = 1;
		Collections.sort(ar);
		for (int a = 0; a < ar.size(); a++) {
			if (minVal == ar.get(a)) {
				minVal++;
			}

		}
    	System.out.println("The Lowest Positive Number Not Present is : "+minVal);
    }
}
