import java.util.Scanner;
public class TCS48 {
    public static boolean hasRepeatedDigit(int number){
        boolean[] digitCount = new boolean[10]; // Array to keep track of digit occurrences
        
        while (number > 0) {
            int digit = number % 10;
            
            if (digitCount[digit]) {
                return true; // Digit is repeated
            }
            
            digitCount[digit] = true;
            number /= 10;
        }
        
        return false; // No repeated digit found
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("number 1");
        int n1=sc.nextInt();
        System.out.println("number 2");
        int n2=sc.nextInt(); // Change this number to test different inputs
        
        int count=0;
        if(n1>=0 && n2>=0){
        for(int i=n1;i<=n2;i++){
        if (hasRepeatedDigit(i)==false) {
           count++;
        } 
    }
}
           System.out.println(count);
}
}
