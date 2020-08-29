import java.util.Scanner;
import java.lang.Math; 
public class leadGame {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		int round = sc.nextInt();
		int[] p1Lead = new int[round];
		int[] p2Lead = new int[round];
		int p1 = 0, p2 = 0;
		int bigger;
		int lead;
		
		while(round>0){
		    int newp1 = sc.nextInt();
		    int newp2 = sc.nextInt();
		    p1+=newp1;
		    p2+=newp2;
		    
		    bigger = (p1>p2)?p1:p2;
		    
		    if(bigger == p1){
		        lead = p1-p2;
		        p1Lead[round-1] = lead;
		    }else{//p2
		        lead = p2-p1;
		        p2Lead[round-1] = lead;
		    }
		    round--;
		}
		
		int maxl1 = findMaxfromArr(p1Lead);
		int maxl2 = findMaxfromArr(p2Lead);
		
		if(maxl1>maxl2){
		    System.out.println("1 "+maxl1);
		}else{
		    System.out.println("2 "+maxl2);
		}
		
		
	}
	
	public static int findMaxfromArr(int[] arr){
	    int max = 0;
	   for(int i = 0; i<arr.length; i++){
	       if(arr[i]> max){
	           max = arr[i];
	       }
	   }
	   return max;
	}
}