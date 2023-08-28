import java.util.Scanner;

class TCS36 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String c[][] = {{"Espresso Coffee", "Cappuccino Coffee", "Latte Coffee"}};
        String t[][] = {{"Plain Tea", "Assam Tea", "Ginger Tea", "Cardamom Tea", "Masala Tea", "Lemon Tea", "Green Tea", "Organic Darjeeling Tea"}};
        String s[][] = {{"Hot and Sour Soup", "Veg Corn Soup", "Tomato Soup", "Spicy Tomato Soup"}};
        String b[][] = {{"Hot Chocolate Drink", "Badam Drink", "Badam-Pista Drink"}};

        System.out.println("Enter the character of the item you want: C - Coffee, T - Tea, S - Soup, B - Beverages");
        char enter = sc.next().toLowerCase().charAt(0);

        int count = 0;

        if (enter == 'c') {
            for (int i = 0; i <= 0; i++) {
                for (int j = 0; j <= 2; j++) {
                    count++;
                    System.out.println(count + ")" + c[i][j]);
                }
            }
            int user = sc.nextInt();
            if (user >= 1 && user <= 3) {
                System.out.println("Welcome to CCD!\nEnjoy your " + c[0][user - 1]);
            } else {
                System.out.println("INVALID OPTION!");
            }
        } else if (enter == 't') {
            for (int i = 0; i <= 0; i++) {
                for (int j = 0; j <= 7; j++) {
                    count++;
                    System.out.println(count + ")" + t[i][j]);
                }
            }
            int user = sc.nextInt();
            if (user >= 1 && user <= 8) {
                System.out.println("Welcome to CCD!\nEnjoy your " + t[0][user - 1]);
            } else {
                System.out.println("INVALID OPTION!");
            }
        } else if (enter == 's') {
            for (int i = 0; i <= 0; i++) {
                for (int j = 0; j <= 3; j++) {
                    count++;
                    System.out.println(count + ")" + s[i][j]);
                }
            }
            int user = sc.nextInt();
            if (user >= 1 && user <= 4) {
                System.out.println("Welcome to CCD!\nEnjoy your " + s[0][user - 1]);
            } else {
                System.out.println("INVALID OPTION!");
            }
        } else if (enter == 'b') {
            for (int i = 0; i <= 0; i++) {
                for (int j = 0; j <= 2; j++) {
                    count++;
                    System.out.println(count + ")" + b[i][j]);
                }
            }
            int user = sc.nextInt();
            if (user >= 1 && user <= 3) {
                System.out.println("Welcome to CCD!\nEnjoy your " + b[0][user - 1]);
            } else {
                System.out.println("INVALID OPTION!");
            }
        } else {
            System.out.println("INVALID INPUT!");
        }

        sc.close();
    }
}
