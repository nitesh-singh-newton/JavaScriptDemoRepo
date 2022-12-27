import java.io.*;
import java.util.*;
public class practiceQuesOfDsa{
    
    public static int maximumElement(int a []){
        int maximum = 0;
        for(int i = 0 ; i < a.length; i++){
            if( maximum < a[i]){
                maximum = a[i]; 
            }
        }
     return maximum;
    }

    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[]array = new int[n];
       for(int i = 0 ; i <array.length ; i++){
        array[i] = sc.nextInt();
       }
       int max = maximumElement(array);
       System.out.println(max);
    }
}
