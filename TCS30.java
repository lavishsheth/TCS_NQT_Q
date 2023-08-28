import java.util.Scanner;
public class TCS30 {

    void CustomCaesarCipher(int k, String s){
        int len=s.length();
        int i;
        if(k==0){
            System.out.println("INVALID INPUT");
        }

        else{
        //to convert the char in array 
        char c[]=s.toCharArray();
        for(i=0; i< len; i++){
           if(Character.isDigit(c[i])){
           if((c[i]+k)<=57){
            c[i]=(char)(c[i]+k);
           }

           else{
             int left =(c[i]+k)-57;
             c[i]=(char)(left+47);
           }
        }
           else if(c[i]>=65 && c[i]<=90){
              if((c[i]+k)<=90){
               c[i]=(char)(c[i]+k);
              }
              else{
                int left=(c[i]+k)-90;
                c[i]=(char)(left+64);
              }
           }

           else if(c[i]>=97 && c[i]<=122){
            if((c[i]+k)<=122){
             c[i]=(char)(c[i]+k);
            }
            else{
                int left=(c[i]+k)-122;
                c[i]=(char)(left+96);
            }
           }
           }
           System.out.println("The Encrypted Text is: " + new String(c));
        }
    }
       

    public static void main(String args[]){
        TCS30 ob = new TCS30();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the plain text: ");
        String s = sc.nextLine();

        System.out.println("enter the value");
        int k = sc.nextInt();
        ob.CustomCaesarCipher(k, s);
    }
    
}

