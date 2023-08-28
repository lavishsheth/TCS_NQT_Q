import java.util.Scanner;

class  TCS44{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number 1: ");
        String input1 = sc.next();
        System.out.print("Number 2: ");
        String input2 = sc.next();

        try {
            float num1 = Float.parseFloat(input1);
            float num2 = Float.parseFloat(input2);
            float sum = num1 + num2;
            System.out.println("Sum = " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Kindly enter numeric values.");
        }
    }
}
