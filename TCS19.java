import java.util.*;
import java.math.*;

class demo1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter row");
        int n=sc.nextInt();
        
        System.out.println("enter row");
        int m=sc.nextInt();

        int[][] matrix = new int[n][m];

        int temp=0,temp1=0,i,j;

    System.out.println("enter element in array");
    for(i=0;i<n;i++){
        for(j=0;j<m;j++){
          matrix[i][j]=sc.nextInt();
          sc.nextLine();
        }
    }
   
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            if(i==j){
                   temp+=matrix[i][j];
            }
            if(i+j==2){
             temp1+=matrix[i][j];
            }
        }
    }
    System.out.println(temp);
    System.out.println(temp1);
    int res=temp-temp1;
    System.out.println(Math.abs(res));
    }
}