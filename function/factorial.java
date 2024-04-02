package function;
import java.util.*;
public class factorial {
    public static void printfactorial(int n){
        if(n<0){
            System.out.println("invalid input");
            return;
        }
        int factorial=1;
        for(int i=n; i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
    public static void main(String [] argh){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        printfactorial(n);
    }
}
