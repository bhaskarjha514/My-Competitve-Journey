import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        System.out.println("Enter length of array");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        
        int[] arr = new int[length];
        
        System.out.println("Enter element of array");
        for(int i = 0; i<length; i++){
            arr[i] = sc.nextInt();
        }
        
        int[] b = new int[length];
        int k = 0;
        for(int i=length-1;i>=0;i--){
            
            b[k] = arr[i];
            k++;
        }
        
        
        for(int i = 0; i<arr.length; i++){
             System.out.print(b[i]+" ");
        }
       
        
    }
}
