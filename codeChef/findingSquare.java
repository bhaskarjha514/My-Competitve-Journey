import java.util.Scanner;
import java.lang.Math; 
public class findingSquare {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int rootSquare;
	    
		int t = sc.nextInt();
		while(t>0){
		    int n = sc.nextInt();
		    rootSquare = findSquareRoot(n);
		    System.out.println(rootSquare);
		    t--;
		}
	}
	
	public static int findSquareRoot(int n){
	    int temp = n;
	    double root;
	    root = Math.sqrt(temp);
	    return (int)root;
	}
}