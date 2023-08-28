import java.util.Scanner;

public class TCS41 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the term you want to find");
        int n = sc.nextInt();

        if (n == 1 || n == 2) {
            System.out.println("1");
        } else {
            int count = 1;
            int count1 = 1;

            for (int i = 3; i <= n; i++) {
                if (i % 2 == 0) {
                    count *= 3;
                } else {
                    count1 *= 2;
                }
            }

            if (n % 2 == 0) {
                System.out.println(count);
            } else {
                System.out.println(count1);
            }
        }
    }
}
