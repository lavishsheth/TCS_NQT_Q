import java.util.Scanner;
class TCS34{
    public static void main(String args[]){
        int n,k,j,m,p;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the no. of monkeys");
        n=sc.nextInt();

        System.out.println("enter the no. eatable bananas by each monkeys");
        k=sc.nextInt();

        System.out.println("enter the no. eatable peanuts by each monkeys");
        j=sc.nextInt();

        System.out.println("enter total bananas");
        m=sc.nextInt();

        System.out.println("enter total peanuts");
        p=sc.nextInt();


        int atebananas=0;
        int atepeanuts=0;

        if(n==0&&k==0||j==0||m==0||p==0){
            System.out.println("invalid inputs");
        }

       
        else{
            if(k>0){
                atebananas=m/k;
                m=m%k;
            }

            if(j>0){
               atepeanuts=p/j;
                p=p%j;
            }

            n=n-atebananas-atepeanuts;
            if((m!=0) || (p!=0)){
                n=n-1;
        }
            System.out.println("Number of Monkeys left on the Tree: "+n);
        }
    } 
}