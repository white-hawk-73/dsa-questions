package basicrecursion;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a string%n");
        String str = sc.nextLine();
        int len = str.length();

        System.out.printf("%s is %sa palindrome%n", str, checkPalindrome(str, 0, len - 1) ? "": "not ");
    }

    static boolean checkPalindrome(String str, int beg, int end) {
        char low;
        char high;
        if (beg >= end) {
            return true;
        } else {
            low = str.charAt(beg);
            high = str.charAt(end);
            if (low != high)
                return false;
            return checkPalindrome(str, beg + 1, end - 1);
        }
    }
}
