import java.util.Scanner;
import java.math.BigInteger;

class TCS14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of member:- ");
        int n = sc.nextInt();
        sc.nextLine();

        BigInteger res = BigInteger.ONE; // why  we use this as integer or long cant store long value 

        for(int i=1;i<=n-1;i++)/*why we use i = n-1 as our president and prime sit togther we count that 2 seat as 1 
        so number of seats become n-1 */ 
        {
             res = res.multiply(BigInteger.valueOf(i));
        }
        res=res.multiply(BigInteger.valueOf(2)); //why we multiple 2 as president and prime minster both can also set in 2 types 
        System.out.println(res); 
    }
}
