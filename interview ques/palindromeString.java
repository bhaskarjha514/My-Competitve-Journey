import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String b = "";
        String s = sc.nextLine();
        int n = s.length();
        for(int i = n-1;i>=0;i--){
            b = b + s.charAt(i);
        }
        if(s.equalsIgnoreCase(b)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}