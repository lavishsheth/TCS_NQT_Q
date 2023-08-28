import java.util.Scanner;
class TCS22{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array");
        int n=sc.nextInt();

        int i=0;
        int arr[]=new int[n];

        System.out.println("enter the value in array");
        for(i=0;i<n;i++){
         arr[i]=sc.nextInt();
         sc.nextLine();
        }

        int temp=1;
        for(i=0;i<n-1;i++){
           if(arr[i]<arr[i+1])
           {
            temp++;
           }
        }
        System.out.println("Answer Is - "+temp);
    }
}