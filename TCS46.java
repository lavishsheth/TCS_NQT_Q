import java.util.Scanner;

class TCS46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int j = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = n - j;
        int[] arrr = new int[n];

        // Rotate the array to the right
        for (int i = 0; i < j; i++) {
            arrr[i] = arr[sum];
            sum++;
        }

        for (int i = 0; i < n - j; i++) {
            arrr[i + j] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arrr[i] + " ");
        }
    }
}
