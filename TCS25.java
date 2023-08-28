import java.util.Scanner;

class TCS25{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of Ballons you want");
        int b=sc.nextInt();

        String a[]=new String[b];
        System.out.println("enter the color");
        for(int i=0;i<b;i++){
            a[i]=sc.next();
        }

        int count1=0,count2=0,count3=0;

        for(int i=0;i<b;i++){
            if(a.charAt(i)=="r" || a.charAt(i)=="R"){
                count1++;
            }

            else if(a[i]=='b' || a[i]=='B'){
                count2++;
            }

            else if(a[i]=='g' || a[i]=='G'){
                count3++;
            }
            }

            
        for(int i=0;i<b;i++){
            if(count1>count2){
                if(count1>count3){
                    System.out.println("red is odd- "+count1);
                }
             else if(count2>count3){
                System.out.println("blue is odd- "+count2);
             }
             else{
                System.out.println("yellow is odd- "+count3);
             }

            }
            }
        }
}