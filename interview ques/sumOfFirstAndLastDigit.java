import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
		    int n = sc.nextInt();
		    int sum = sumOffirstandLast(n);
		    System.out.println(sum);
		    t--;
		}
	}
	public static int sumOffirstandLast(int n){
	    int temp = n;
	    int lastDigit = n%10;
	    int fakeLastDigit;
	    int firstDigit = 0;
	    int ans;
	    while(temp>0){
	        fakeLastDigit = temp%10;
	        temp/=10;
	        firstDigit = fakeLastDigit;
	        
	    }
	    
	    ans = firstDigit+lastDigit;
	    return ans;
	}
}
