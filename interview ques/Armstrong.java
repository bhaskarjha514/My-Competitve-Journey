import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = 0;
        int temp = x;  // 123 = 1+8+27
        while(temp>0){
            int lastDigit = temp % 10;
            ans += (lastDigit*lastDigit*lastDigit);
            temp/=10;
        }
        System.out.println(ans);
    }
}
