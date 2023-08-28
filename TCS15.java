import java.util.*;
class TCS15{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        String s = sc.next();
 
        System.out.println("enter ");
        int r = sc.nextInt();
        if(r==0){
            System.out.println(0);
            return;
        }

        int res=sumofDigit(s);
        res*=r;

        while(res>9){
            String x=""+res;
            res=sumofDigit(x);
        }
        System.out.println(res);
    }

    public static int sumofDigit(String x){
        int l = x.length();
        int sum=0;
        for(int i=0;i<l;i++){
            sum+=x.charAt(i)-'0';
        }
        return sum;
    }
}