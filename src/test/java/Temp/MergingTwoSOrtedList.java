package Temp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * List<Integer> a1=[0,1,1,4,5]
 * List<Integer> a2=[1,2,3,4,5]
 * 
 * Merge a1 & a2 and find sorted list.
 */
public class MergingTwoSOrtedList {
    
    public static void main(String[] args) {
        List<Integer> a1=new ArrayList<Integer>();
        a1.add(0);
        a1.add(1);
        a1.add(1);
        a1.add(4);
        a1.add(5);
        System.out.println("List1:"+a1);
        List<Integer> a2=new ArrayList<Integer>();
        a2.add(1);
        a2.add(2);
        a2.add(3);
        a2.add(4);
        a2.add(6);
        System.out.println("List2:"+a2);
        List<Integer> newList=new ArrayList<Integer>();
        newList.addAll(a1);
        newList.addAll(a2);
        Collections.sort(newList);

        System.out.println("Merged List:"+newList);
    }
}
