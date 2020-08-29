import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int howMuch = 0;
	 
		int t = sc.nextInt();
		while(t>0){
		    int n = sc.nextInt();
		    howMuch = countFour(n);
		    System.out.println(howMuch);
		    t--;
		}
	}
	
	public static int countFour(int n){
	    int temp = n;
	    int counterFour = 0;
	    while(temp>0){
	        int lastDigit = temp % 10;
	        if(lastDigit==4){
	            counterFour++;
	        }
	        temp/=10;
	    }
	    
	    return counterFour;
	}
}
