// 		4444333322221111
// 		444333222111
// 		44332211
// 		4321

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
		    int n = sc.nextInt();
		    GCG g = new GCG();
		    g.printPat(n);
		    System.out.println();
		    t--;
		}

	}
}

class GCG{
    void printPat(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                int k = n-i+1;
                while(k>0){
                    System.out.print(j);
                    System.out.print(" ");
                    k--;
                }
            }
            System.out.print("$");
        }
        
    }
    
}
