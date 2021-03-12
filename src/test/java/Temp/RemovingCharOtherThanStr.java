package Temp;

public class RemovingCharOtherThanStr {
    
    public static void main(String[] args) {
        removingUnwantedChar("DEb87k7_um 1ar");
    }
    static void removingUnwantedChar(String data)
    {
        String name=data.replaceAll("[^a-zA-Z]","");
        System.out.println(name);
    }
}
