package function;
import java.util.*;
public class evenOrNotFunction {
    public static void checkEven(int n){
        if(n%2==0){
            System.out.println("even");
            return;
        }
        System.out.println("odd");
    }
    public static void main(String [] argh){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        checkEven(n);
    }
}
