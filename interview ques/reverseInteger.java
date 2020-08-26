// reverse of no
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;                     //123
        int reversed = 0;
        while(temp>0){
            int lastDigit = temp%10;
            reversed = reversed*10+lastDigit;
            temp/=10;
            
        }
        System.out.print("done "+reversed);
        
        
    }
}
