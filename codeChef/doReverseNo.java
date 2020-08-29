import java.util.Scanner;

public class doReverseNo {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int reverseNo;
	    
		int t = sc.nextInt();
		while(t>0){
		    int n = sc.nextInt();
		    reverseNo = doReverse(n);
		    System.out.println(reverseNo);
		    t--;
		}
	}
	
	public static int doReverse(int n){
	    int temp = n;
	    int reverse = 0;
	    while(temp>0){
	        int lastDigit = temp % 10;
	        reverse = reverse*10+lastDigit;
	        temp/=10;
	    }
	    
	    return reverse;
	}
}