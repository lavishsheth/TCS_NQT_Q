import java.util.*;
class TCS8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        int arr[]= new int[n];
        int i=0;
        System.out.println("enter the elements of array");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int countzero=0,countone=0,counttwo=0;
        for(i=0;i<n;i++){
            if(arr[i]==0){
                countzero+=1;
            }
            else if(arr[i]==1){
                countone+=1;
            }
            else{
                counttwo+=1;
            }
        }

        System.out.println("output here :- ");
        for(i=0;i<countzero;i++){
            System.out.println(0+" ");
        }

        for(i=0;i<countone;i++){
            System.out.println(1+" ");
        }

        for(i=0;i<counttwo;i++){
            System.out.println(2+" ");
        }
    }
}