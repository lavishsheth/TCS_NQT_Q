import java.util.Arrays;
import java.util.Scanner;
class TCS18{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number 1 you want");
        int n1= sc.nextInt();

        System.out.println("enter the number 2 you want");
        int n2= sc.nextInt();

        int count=0;

        int hash[]= new int[10];

        for(int i=n1;i<=n2;i++){
            int temp=i;
            Arrays.fill(hash, 0);
            boolean flag = true;

            while(temp>0){
             int r = temp%10;
             temp/=10;

            if(hash[r]==1){
                flag=false;
                break;
            }

            else{
                hash[r]=1;
            }
            }

            if(flag){
                count+=1;
            }
        }
        System.out.println(count);
    }
}