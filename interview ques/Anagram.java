
// abaa == baaa?"Anagram":"Not An Anagram"
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2= sc.nextLine();
        
        int a1[] = new int[256];
      
        boolean isAnagram = true;
        
        for(char c: s1.toCharArray()){
            int index = (int)c;
            a1[index]++;
        }
        for(char c : s2.toCharArray()){
            int index = (int)c;
            a1[index]--;
        }
        
        for(int i = 0; i<256;i++){
            if(a1[i]!=0){
                isAnagram = false;
                break;
            }
        }
        
        if(isAnagram){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
        
        
        
    }
}
