import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TCS37{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> ages = new ArrayList<>();

        System.out.println("Enter age value (press Enter without a value to stop):");

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            try {
                int age = Integer.parseInt(input);
                if (ageIsValid(age)) {
                    ages.add(age);
                } else {
                    System.out.println("INVALID INPUT");
                }
            } catch (NumberFormatException e) {
                System.out.println("INVALID INPUT");
            }
        }

        int totalIncome = calculateEarnings(ages);
        System.out.println("Total Income " + totalIncome + " INR");

        scanner.close();
    }

    private static boolean ageIsValid(int age) {
        return age > 0 && age <= 120;
    }

    private static int calculateEarnings(List<Integer> ages) {
        int totalIncome = 0;
        int maxPatients = Math.min(ages.size(), 20);

        for (int i = 0; i < maxPatients; i++) {
            int age = ages.get(i);
            int fee;
            if (age < 17) {
                fee = 200;
            } else if (age >= 17 && age <= 40) {
                fee = 400;
            } else {
                fee = 300;
            }
            totalIncome += fee;
        }

        return totalIncome;
    }
}
