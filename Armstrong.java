import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upper limit :");
        int n = sc.nextInt();
        System.out.println("The armstrong numbers between the 1 and " + n + " are :");
        armstrong(n);
    }

    private static void armstrong(int n) {
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
