import java.util.Scanner;
class TCS{
    public static void main(String args[]){
        int a[]={800,600,750,900,1400,1200,1100,1500};

        String b[]={"TH", "GA", "IC", "HA", "TE", "LU", "NI","CA"};

    
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the station you want to go:- THANERAILWAYSTN = TH, GAONDEVI = GA, ICEFACTROY = IC, HARINIWASCIRCLE = HA, TEENHATHNAKA = TE, LUISWADI = LU, NITINCOMPANYJUNCTION = NI, CADBURRYJUNCTION = CA");
        String s = sc.next().toUpperCase();

        System.out.println("enter the station you want to reach:- THANERAILWAYSTN = TH, GAONDEVI = GA, ICEFACTROY = IC, HARINIWASCIRCLE = HA, TEENHATHNAKA = TE, LUISWADI = LU, NITINCOMPANYJUNCTION = NI, CADBURRYJUNCTION = CA");
        String s1 = sc.next().toUpperCase();


        int st=0,bt=0;
        double res=0;

        for(int i=0;i<8;i++){
                 if(s.equals(b[i])){
                    st=i;
                 }

                 if(s1.equals(b[i])){
                    bt=i;
                 }

                 if(st!=0&&bt!=0)
                {
                break;
                }
            }

            if(st==0&&bt==0){
                System.out.println("invalid input");
            }

            else if(st==bt){
                System.out.println("Invalid Input");
                return;
            }

            else{
                    if(st<bt){
                        for(int i=st;i<=bt;i++){
                            res+=a[i];
                        }
                    }
                    else{
                        for(int i=st;i<8;i++){
                              res+=a[i];
                        }
                        for(int i=0;i<bt;i++){
                            res+=a[i];
                        }
                    }
                }
                
                double ans = Math.ceil(res/1000.0)*5;
                System.out.println(ans);
                }
}