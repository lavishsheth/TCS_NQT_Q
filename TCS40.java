import java.util.Scanner;

public class TCS40 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the term you want to find");
        int n = sc.nextInt();
        int[] series = new int[n + 1];
        int count = 0;
        int count1 = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                if (i == 2) {
                    series[i] = 0;
                } else {
                    count += 6;
                    series[i] = count;
                }
            } else {
                if (i == 1) {
                    series[i] = 0;
                } else {
                    count1 += 7;
                    series[i] = count1;
                }
            }
        }

        System.out.println("Output is: " + series[n]);
    }
}
