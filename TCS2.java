import java.util.*;
class TCS2{
    static int a,b;
    public static void main(String args[]){
        int i,n;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value of n");
        n=s.nextInt();
        s.nextLine();

    
        for(i=1;i<=n;i++){
            if(i%2!=0){
                if(i==1){
                    a=1; 
                }
                else{
                    a*=2;
                }
            }
                else{
                    if(i==2){
                        b=1;
                    }
                    else{
                    b*=3;
                }
            }
        }
        if(n%2!=0){
            System.out.println(n+" terms of series is "+a); 
        }
        else{
            System.out.println(n+"terms of series is "+b); 
        }
    }
}