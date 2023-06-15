package basicmaths;

import java.util.Scanner;

public class CountDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int digCount = countDigits(n);
        System.out.printf("Digit count is %d", digCount);
    }

    static int countDigits(int n) {
        if (n == 0) {
            return 1;
        }
        else {
            int temp = n > 0 ? n : -n;
            int count = 0;

            while (temp > 0) {
                temp = temp / 10;
                count++;
            }
            return count;
        }
    }
}
