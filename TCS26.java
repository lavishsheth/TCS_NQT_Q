import java.util.Scanner;
class TCS26{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Size of array");

        int n = sc.nextInt();
        
        String arr[]= new String[n];
        System.out.println("enter the element in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.next().toLowerCase();
        }


        String oddcolor=null;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i].equals(arr[j])){
                    count++;
                }
    }
        if(count%2==1){
         oddcolor=arr[i];
         break;
        }
    }

    if(oddcolor!=null){
        System.out.println(oddcolor);
    }
    else{
        System.out.println("all are even");
    }
}
}