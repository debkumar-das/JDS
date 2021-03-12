package Daily;
import java.util.Scanner;

/**
 * Given a string S, find the longest palindromic substring in S. Substring of
 * string S: S[ i . . . . j ] where 0 ≤ i ≤ j < len(S). Palindrome string: A
 * string which reads the same backwards. More formally, S is palindrome if
 * reverse(S) = S. Incase of conflict, return the substring which occurs first (
 * with the least starting index ).
 */
public class longestPaliondromeString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str=sc.next();
       // int len=str.length();
        String longA=longestPalindromeString(str);
        System.out.println(longA);
        sc.close();
    }
    static public String intermediatePalindrome(String s, int left, int right) {
		if (left > right) return null;
		while (left >= 0 && right < s.length()
				&& s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
        }
        //System.out.println(s.substring(left + 1, right));
		return s.substring(left + 1, right);
	}

	// O(n^2)
	public static String longestPalindromeString(String s) {
		if (s == null) return null;
        String longest = s.substring(0, 1);
        //System.out.println(s.substring(0, 1));
		for (int i = 0; i < s.length() - 1; i++) {
			//odd cases like 121
			String palindrome = intermediatePalindrome(s, i, i);
			if (palindrome.length() > longest.length()) {
				longest = palindrome;
			}
			//even cases like 1221
			palindrome = intermediatePalindrome(s, i, i + 1);
			if (palindrome.length() > longest.length()) {
				longest = palindrome;
            }
            System.out.println(palindrome);
		}
		return longest;
	}

}
