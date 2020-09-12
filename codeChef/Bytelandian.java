// https://www.codechef.com/problems/COINS
// Bytelandian gold coins

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
		    while(sc.hasNext()){
		        long n = sc.nextInt();
		        System.out.println(Solve(n));
		    }
		}catch(Exception e){
		    System.out.println(e);
		}
	}
	public static long Solve(long n){
	     if(n<12){
	        return n;
	    }
	    long a = Solve(n/2);
	    long b = Solve(n/3);
	    long c = Solve(n/4);
	    return(a+b+c);
	}
}
