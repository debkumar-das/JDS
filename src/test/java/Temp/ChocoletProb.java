package Temp;

/**
 * If anyone can get 1 choc -> either 1 INR or 3 Wrapper
    The  find how many Chocolets you will get on 15 INR.->15 choc + 5 + 1+1=22 choc
 */
public class ChocoletProb {
    
    public static void main(String[] args) {

        int money = 15 ; // total money
        int price = 1; // cost of each candy
         
        // no of wrappers needs to be
        // exchanged for one chocolate.
        int wrap = 3 ; 
        System.out.println( 
            countMaxChoco(money, price, wrap));
    }
    

    // Returns number of chocolates we can
    // have from given number of chocolates
    // and number of wrappers required to
    // get a chocolate.
    static int countRec(int choc, int wrap)
    {
         
        // If number of chocolates is less than
        // number of wrappers required.
        if (choc < wrap)
            return 0;
     
        // We can immediatly get newChoc using
        // wrappers of choc.
        int newChoc = choc / wrap;
     
        // Now we have "newChoc + choc%wrap" 
        // wrappers.
        return newChoc + countRec(newChoc + 
                          choc % wrap, wrap);
    }
     
    // Returns maximum number of chocolates
    // we can eat with given money, price of
    // chocolate and number of wrappers 
    // required to get a chocolate.
    static int countMaxChoco(int money, 
                          int price, int wrap)
    {
         
        // We can directly buy below number of
        // chocolates
        int choc = money/price;
     
        // countRec returns number of chocolates
        // we can have from given number of 
        // chocolates
        return choc + countRec(choc, wrap);
    }
}
