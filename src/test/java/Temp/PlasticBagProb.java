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
    a1.add(2.51f);
    a1.add(0.61f);
    System.out.println("List of Bags:"+a1);
    int count=0;
    float sum=0f;
    for(int i=0;i<a1.size();i++)
    {
        sum=sum+a1.get(i);
        //System.out.println(sum);
        if(sum==3f)
        {
            count++;
            sum=0f;
        }
        if(sum>=3f)
        {
            sum=sum-a1.get(i);
            if(sum<3f){
            count++;
            sum=0f;
            i--;
            }
        }
    }
    System.out.println("Minimum Times:"+(count+1));

    }
    
}