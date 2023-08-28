import java.util.*;
class TCS6{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("enter the value of your choose");
    int n = sc.nextInt();
    int ans=0;

    int index =0;
    while(n>0){
        if((n&1)==0){
            ans=ans+(int)Math.pow(2,index);
        }
        index++;
        n=n/2;
    }
System.out.println("answer- "+ans);
    }
}