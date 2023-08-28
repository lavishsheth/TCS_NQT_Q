import java.util.Scanner;
class TCS10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        sc.nextLine();

        int arr[] = new int[n];
        System.out.println("enter the element in array");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        int max=0,count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
            max=arr[i];
            count++;
            }
        }
        System.out.println("your answer is:- ");
        System.out.println(count);
    }
}