import java.util.Scanner;
class TCS12{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value");
        String n = sc.next();
        sc.nextLine();

        int l = n.length(); 
        long prod=1;
        
        for(int i=0;i<l;i++){
             int val = n.charAt(i)-'0';
             prod=prod*val;
        }
        System.out.println(prod);
    }
}