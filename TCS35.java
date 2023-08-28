import java.util.Scanner;

public class TCS35 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


        int commission = 0;
        int commission1 = 0;

        System.out.println("Enter the parent name: ");
        String Pname = sc.next();

        System.out.println("Do you have child members? (Press 'Y' for Yes, 'N' for No): ");
        char choose = sc.next().charAt(0);

        if (choose == 'Y' || choose == 'y') {
            System.out.println("Enter the number of child members you have: ");
            int n = sc.nextInt();
            String[] arr = new String[n];
            int total = 1;

            System.out.println("Enter names:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
                commission += 500;
                total++;
            }

            commission1 = 250;

            System.out.println("Total members: " + total);
            System.out.println(Pname + ": " + commission);
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i] + ": " + commission1);
            }
        }
    }
}
