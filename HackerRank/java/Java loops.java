import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t = sc.nextInt();
    while(t>0){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
    
        int pow = 1;
        int always = a+b;
        
        for(int i=0;i<n;i++){
            if(i==0){
                pow = 1; 
            }else{
                pow = (pow*2); 
                always = always+(pow*b);
            }
            System.out.print(always+" ");
        }

        System.out.println();
        t--;
    }
    }
}
