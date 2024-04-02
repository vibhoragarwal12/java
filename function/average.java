package function;
import java.util.*;
public class average {
    public static void averagePrint(int a, int b , int c){
        float x=(a+b+c)/3;
        System.out.println(x);
    }
    public static void main(String []argh){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        averagePrint(a,b,c);
    }
}
