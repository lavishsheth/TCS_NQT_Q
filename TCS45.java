import java.util.Scanner;

public class TCS45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input strings A and B
        System.out.print("Enter string A: ");
        String A = scanner.nextLine();

        System.out.print("Enter string B: ");
        String B = scanner.nextLine();

        // Deriving string C
        String C = deriveStringC(A, B);

        // Output string C
        System.out.println("Output string C: " + C);
    }

    private static String deriveStringC(String A, String B) {
        StringBuilder builder = new StringBuilder();

        // Iterate through each character in string A
        for (int i = 0; i < A.length(); i++) {
            char currentChar = A.charAt(i);

            // Check if the current character is not present in string B
            if (B.indexOf(currentChar) == -1) {
                builder.append(currentChar);
            }
        }

        return builder.toString();
    }
}
