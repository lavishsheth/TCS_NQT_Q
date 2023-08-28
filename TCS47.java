import java.util.Scanner;
public class TCS47 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

    int n=sc.nextInt();
       int arr[]=new int[n];

       int arrr[]=new int[n];

       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }

       int k=sc.nextInt();
       int s=n-k;
       for(int i=0;i<k;i++){
        arrr[i]=arr[s];
        s++;
       }

       for(int i=0;i<k+1;i++){
        arrr[i+k]=arr[i];
       }

       for(int i=0;i<n;i++){
        System.out.println(arrr[i]);
       }
    }
}
