import java.util.Scanner;
class TCS1{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of testcase");
        int testcase = s.nextInt();
        s.nextLine();
        getDistance(testcase);
    }
     public static void getDistance(int a){
     int distance=10;
     int x=0,y=0;
     char ch ='R';
      
     while(a>0){
        switch(ch){
        
        case 'R':
        x=x+distance;
        distance = distance+10;
        ch='U';
        break;

        case 'U':
        y=y+distance;
        distance = distance+10;
        ch='L';
        break;

        case 'L':
        x=x-distance;
        distance = distance+10;
        ch='D';
        break;

        case 'D':
        y=y-distance;
        distance = distance+10;
        ch='A';
        break;

        case 'A':
        x=x+distance;
        distance = distance+10;
        ch='R';
        break;
        }
        a--;
     }System.out.println(x+" "+y);
     }
}