// 121 yes, 123 no
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;
        int reversedNo = 0;
        while(temp>0){
            int lastDigit = temp%10;
            reversedNo = reversedNo*10+lastDigit;
            temp /= 10;
        }
        if(reversedNo == n){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
}
