import java.util.Scanner;
class TCS42{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        
        System.out.println("enter the term you want to enter");
        int n= sc.nextInt();
          
        int a=0, b=0;
    
    for(int i=1;i<=n;i++)
    {
        if(i%2!=0)
        {
            if(i>1)
                a = a + 2;
        }
        else
        {
            b = a/2;
        }
    }

    if(n%2!=0)
    {
        System.out.println(a);
    }
    else
    { 
        System.out.println(b);
    }
}
}