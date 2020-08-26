// CAQ1
import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        System.out.println("Enter length of array");
        
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        
        System.out.println("Enter element of arr");
        int[] arr = new int[length];
        for(int i=0; i<length; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Array created is "+Arrays.toString(arr));
        
        for(int i = 0; i<arr.length -1; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    for(int k = j; k<arr.length-1; k++){
                        arr[k] = arr[k+1];
                    }
                }
            }
        }
        
        System.out.println("array after deleted element is ");
        for(int i = 0; i<arr.length-1; i++){
            System.out.println(arr[i]);
        }
    }
}