/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int length = 0;
            int temp = i;
            int sum = 0;
            while (temp != 0) {
                length++;
                temp /= 10;
            }
            temp = i;
            while (temp != 0) {
                int remainder = temp % 10;
                sum += Math.pow(remainder, length);
                temp /= 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }

    }
}
