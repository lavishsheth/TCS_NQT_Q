import java.util.*;
class TCS3{
    static int res=1;
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int n = s.nextInt();

        while(n>0){
          res*=(n%10);
          n=n/10;
        }
        System.out.println(res);
    }
}