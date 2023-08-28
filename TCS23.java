import java.util.Scanner;

class TCS23 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int r = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter number of columns:");
        int c = sc.nextInt();
        sc.nextLine();

        int prepinsta[][] = new int[r][c];
        int i = 0, j = 0;
        System.out.println("Enter the elements of the matrix (0 or 1):");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                prepinsta[i][j] = sc.nextInt();
            }
        }

        int maxcount = 0, maxrow = 0;
        for (i = 1; i < r; i++) {
            int count = 0;
            for (j = 0; j < c; j++) {
                if (prepinsta[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxcount) {
                maxcount = count;
                maxrow = i;
            }
        }
        System.out.println("Row " + (maxrow+1) + " has the highest number of 1's: " + maxcount);
    }
}
