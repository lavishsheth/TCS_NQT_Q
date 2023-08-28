import java.util.*;
class TCS4{
    static int res=1,i;
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        String n = s.nextLine();

        for(i=1;i<=n.length();i++){
        res*=(i-'0');
        System.out.println(res);
    }
}}