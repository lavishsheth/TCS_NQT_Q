import java.util.*;
class TCS16{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of input");
        int n =sc.nextInt();
        sc.nextLine();

        int arr[]=new int[n];

        System.out.println("enter the vehicle number");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sc.nextLine();
        }

        System.out.println("enter the day");
        int day=sc.nextInt();

        System.out.println("enter the value of fine you want:- ");
        int charges= sc.nextInt(); 
        int fine=0;
        if(day%2==0){
            for(int i=0;i<n;i++){
                if(arr[i]%2!=0){
                fine+=charges;
                }
            }
        }
        else{
                for(int i=0;i<n;i++){
                    if(arr[i]%2==0){
                    fine+=charges;
            }
        }
    }
        System.out.println(fine);
    }
}