// 0 1 1 2 3 5 8 13
import java.util.Scanner;
public class fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a = 0;
        int b = 1;
        int c;
        
        if(n>=1){
            if(n>=2){
            System.out.print(a+" "+b+" ");
        }else{
            System.out.print(a);
        }
        
        for(int i=2;i<n;i++){
            c = a+b;
            a = b;
            b = c;
            System.out.print(c+" ");
        }
        }else{
            System.out.print("Enter more then 0");
        }
        
    }
}
