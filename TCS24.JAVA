import java.util.Scanner;

class TCS24
{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the time you want to check");
    int t = sc.nextInt();

    int a[]=new int[t];
    int b[]=new int[t];

    System.out.println("enter the array");
    for(int i=0;i<t;i++){
    a[i] = sc.nextInt();
    }

    System.out.println("enter the array");
    for(int i=0;i<t;i++){
    b[i] = sc.nextInt();
    }

    int max=0,sum=0;
    System.out.println("Ans");
    for(int i=0;i<t;i++){
    sum+=a[i]-b[i];
    max=Math.max(max,sum);
    }
System.out.println(max);
}
}