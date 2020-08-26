import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();                      
        boolean isPrime = true;
        if(x<2){
            isPrime = false;
        }else{
            for(int i = 2; i<x; i++){
           if(x%i==0){
               isPrime = false;
               break;
           }
       }
        }
       
       System.out.println(isPrime);
    }
}
