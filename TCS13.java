import java.util.Scanner;
class TCS13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string of your choice");
        String n = sc.next();
        
        System.out.println("enter the size of subset");
        int l= sc.nextInt();
        
        int len=n.length();

        int i,count=0,max =0;

        for(i=0;i<len;i++){
            if(i%l==0){
                if(max<count){
                    max=count;
                }
                count=0;
            }

            if(n.charAt(i)=='a'){
                 count++;
            }
        }

        if(max<count){
            max=count;
        }
        System.out.println(max);
    }
}