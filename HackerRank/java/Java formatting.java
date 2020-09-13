// https://www.hackerrank.com/challenges/java-output-formatting/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                
                String s1=sc.next();
                int x=sc.nextInt();
                
                //making it 3 digit
                String number = String.valueOf(x);
                if(number.length()<3){
                    int t = number.length();
                    while(t<3){
                        number = "0"+number;
                        t++;
                    }
                }
                
                int len = s1.length();
                System.out.print(s1);
                for(int k = len;k<15;k++){
                    System.out.print(" ");
                }
                System.out.println(number);
            }
            System.out.println("================================");
        
    }
}

