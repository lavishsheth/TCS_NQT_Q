import java.util.Scanner;
class TCS11{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of product");
        int n=sc.nextInt();
        sc.nextLine();

        int res=1;
        while(n>0){
        res=res*(n%10);
        n=n/10;
        }
        System.out.println("answer is :- "+res);
    }
}