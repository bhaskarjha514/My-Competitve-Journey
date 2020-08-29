import java.util.Scanner;
public class secLarger {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		int round = sc.nextInt();
        int ans;
		while(round>0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    ans = findSecLarger(a,b,c);
		    System.out.println(ans);
		    round--;
		}
	}
	
	public static int findSecLarger(int a, int b, int c){
	    if(a>b && a>c){
	        return (b>c)?b:c;
	    }else if (b>c && b>a){
	        return (c>a)?c:a;
	    }else{
	        return (b>a)?b:a;
	    } 
	}
}