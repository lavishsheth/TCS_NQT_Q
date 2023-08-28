import java.util.Scanner;
public class TCS39 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int n = sc.nextInt();


        int count=0;

        if(n>0){
        for(int i=2;i<=n;i++){
            if(n%i==0){
                ++count;
            }
        }
            if(count>1){
               System.out.println("entered number is not prime");
            }
            else{
                System.out.println("number is prime");
            }
        }
        else{
            System.out.println("negative value kindly enter positive one");
        }
    }
}

