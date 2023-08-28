import java.util.Scanner;
class TCS29{
    public void Calculate(int n){
        if(n==0){
            System.out.println("Time Estimated : 0 Minutes");
        }

        else if(n>=0&&n<=2000){
            System.out.println("Time Estimated : 25 Minutes");
        }

        else if(n>=2001 && n<=4000){
            System.out.println("Time Estimated : 35 Minutes");
        }

        else if(n>=4000 && n<=7000){
            System.out.println("Time Estimated : 45 Minutes");
        }

        else{
                System.out.println("INVALID INPUT");
            }
    }

    public static void main (String args[]){
        TCS29 ob = new TCS29();
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of gram you want to enter");
        int n = sc.nextInt();
        sc.nextLine();

        ob.Calculate(n);

    }
}