import java.util.Scanner;

class TCS27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of candies in the jar:");
        int N = sc.nextInt();

        System.out.println("Enter the minimum number of candies that must be in the jar at any given time:");
        int K = sc.nextInt();

        int M = N; // current number of candies in the jar

        while (true) {
            System.out.println("Number of candies available in the jar: " + M);
            System.out.println("Enter the number of candies you want to buy:");
            int num = sc.nextInt();

            if (num > M || num <= 0) {
                System.out.println("INVALID INPUT!");
                continue;
            }

            M -= num;
            System.out.println("Number of candies sold: " + num);
            System.out.println("Number of candies left in the jar: " + M);

            if (M < K) {
                System.out.println("Refilling the jar...");
                M = N;
            }
        }
    }
}