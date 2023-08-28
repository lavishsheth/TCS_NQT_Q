import java.util.Scanner;
class TCS31{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

       int inte,exte,i;  //inte = interior , exte == exterior
       
       System.out.println("enter the value of interior:- ");
       inte=sc.nextInt();
       sc.nextLine();

       System.out.println("enter the value of exterior:- ");
       exte=sc.nextInt();
       sc.nextLine();

       float intecost=18,extecost=12,totalcost=0,area;

       if(inte<0 || exte<0){
        System.out.println("INVALID INPUT");
       }

       else if(inte==0 || exte==0){
        System.out.println("Total estimated Cost : 0.0");
       }

       else{
        System.out.println("enter the surface area of interior wall");
        for(i=1;i<=inte;i++){
        area = sc.nextFloat();
        totalcost+=intecost*area;
        }

        System.out.println("enter the surface area of exterior wall");
        for(i=1;i<=exte;i++){
            area=sc.nextFloat();
            totalcost+=extecost*area;
        }
        
        System.out.println("Total estimated Cost : "+totalcost);
       }
    }
}