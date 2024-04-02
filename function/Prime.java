package function;
import java.util.*;

public class Prime {
    public static void checkPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("prime");
    }
    public static void main(String []argh){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        checkPrime(n);
    }
}
