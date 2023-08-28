import java.util.Scanner;
class TCS28{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[3][3];

        System.out.println("enter the values");
        for(int i =0;i<3;i++){
            System.out.println("enter the values of round :- "+(i+1));
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
                sc.nextLine();

                if(a[i][j]<0 || a[i][j]>100){
                    System.out.println("invalid input");
                    a[i][j]=0;
                }
            }
        }

        int avg[]=new int[3];
        int maxval=0;
        for(int i = 0;i<3;i++){
            for(int j=0;j<3;j++){
              avg[i]+= a[i][j];
            }
            avg[i]=Math.round(avg[i]/3);
        }

        for(int i=0;i<3;i++){
            if(maxval<avg[i]){
               maxval=avg[i];
            }
        }

        for(int i=0;i<3;i++){
            if(avg[i]==maxval){
                System.out.println("Trainee Number : " +(i+1));
            }

            if(avg[i]<70){
                System.out.println("Trainee is Unfit");
            }
        }

    }
}