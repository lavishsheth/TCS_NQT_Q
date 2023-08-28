import java.util.*;
class TCS17{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size you want");
        int n = sc.nextInt();

        System.out.println("enter the element in array");
        int a[]=new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("enter rotation");
        int r  = sc.nextInt();
        r=r%n;

        for(int i=n-r;i<n;i++){
            System.out.print(a[i]+" ");
        }

        r=n-r-1;
        for(int i=0;i<=r;i++){
            System.out.print(a[i]+" ");
        }
    }
}