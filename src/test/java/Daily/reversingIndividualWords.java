/**
 * Given a String S, reverse the string without reversing its individual words. 
 * Words are separated by dots.
*/
package Daily;
public class reversingIndividualWords {
    
    public static void main(String[] args) {
        String op=reverseWords("i.like.this.program.very.much");
        System.out.println(op);
    }
    public static String reverseWords(String S) {
        // code here 
        // System.out.println(S);
        String[] sp=S.split("[.]");
        String a="";
        for(int i=sp.length-1;i>=0;i--)
        {
           if(i!=0)
           {
            a=a+sp[i]+".";
           }
           if(i<=0)
           {
            a=a+sp[i];
           }
        }
        return a;
    }
}
