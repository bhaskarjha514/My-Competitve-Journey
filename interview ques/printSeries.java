// output = 3.7 3.71 3.717 3.7171 3.71717...n
// CAQ2
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        float ten = 10;
        float x = 7, y = 1;
        float a = 3;
        
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        
        for(int i=1;i<=length; i++){
            float decimal;
            if(i%2!=0){
                decimal = x/ten;
                ten*=10;
            }else{
                decimal = y/ten;
                ten*=10;
            }
            a+=decimal;
            System.out.print(a+" ");
        }
    }
}