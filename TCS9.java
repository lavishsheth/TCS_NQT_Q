import java.util.*;

class TCS9{
    public static void main(String ar[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of array");
    int n= sc.nextInt();

    int arr[]= new int[n];
    int count=0;

    System.out.println("enter the value in array");
    for(int i=0;i<=n-1;i++){
        arr[i]=sc.nextInt();
    }

    for(int i=0;i<n-1;i++){
        if(arr[i]>arr[i+1]){
            count++;
        }
    }
    System.out.println(count);

    }
}