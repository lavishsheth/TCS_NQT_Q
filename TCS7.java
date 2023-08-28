import java.util.*;
public class TCS7
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("enter the day you want to search");
	    String s = sc.next();
	    
	    System.out.println("enter the number of days");
	    int n = sc.nextInt();
	    
	    String day[] = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
	    
	    int i=0;
	    for(i=0;i<=6;i++){
	        if(day[i].equals(s)){
	            break;
	        }
	    }
	    int val = 6-i;
	    
	    n=n-val;
	    
	    if(n<0){
	        System.out.println("0");
	    }
	    
	    else{
	     int ans = 1+n/7;   
	    System.out.println("TOTAL TIME THE DAY COMES  IS :- "+ans);
	    }
	}
}