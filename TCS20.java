import java.util.*;
class TCS20{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the total no of vehicles");
        int v= sc.nextInt();
        System.out.println("enter the total no of wheels");
        int w= sc.nextInt();
        int x=0,y=0;


        if(w>=2 && w%2==0 && v<w && v*4>=w || v*2>=w){
            y=(w-2*v)/2;
            x=v-y;
            System.out.println("TW "+x+" FW "+y);
        }
        else{
            System.out.println("invalid input");
        }
    }
}