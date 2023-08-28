import java.util.Scanner;
class TCS21{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String you want");
        String a =sc.next();
        sc.nextLine();
     
        int len =a.length();

        int count1=0,count2=0;
        for(int i=0;i<len;i++){
        if(a.charAt(i)=='*'){
        count1++;
    }
    else if(a.charAt(i)=='#'){
        count2++;
    }
}
System.out.println("No of *- "+count1+" No of #- "+count2);
int res=count1-count2;
System.out.println("* - #= "+res);
}
}