package Temp;

class RemovingCharOtherThanStrApp2{


    public static void main(String[] args) {
         // Given alphanumeric string str 
         String str = "GeeksForGeeks123"; 
  
         // Print the modified string 
         System.out.println(removeAllDigit(str)); 
    }
    public static String removeAllDigit(String str) 
    { 
        String result = ""; 
  
        // Traverse the String from start to end 
        for (int i = 0; i < str.length(); i++) { 
  
            // Check if the specified character is not digit 
            // then add this character into result variable 
            if (!Character.isDigit(str.charAt(i))) { 
                result = result + str.charAt(i); 
            } 
        } 
  
        // Return result 
        return result; 
    } 
}