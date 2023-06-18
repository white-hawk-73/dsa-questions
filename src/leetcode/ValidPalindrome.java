package leetcode;

import java.util.Scanner;

// 125. Valid Palindrome
public class ValidPalindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a string%n");
        String str = sc.nextLine();

        System.out.printf("%s is %sa palindrome%n", str, isValidPalindrome(str) ? "": "not ");
    }

    static boolean isValidPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int len = str.length();

        for(int i = 0, j = len - 1; i <= j; i++, j--) {
            char start = str.charAt(i);
            char end = str.charAt(j);
            if(start != end)
                return false;
        }
        return true;
    }
}
