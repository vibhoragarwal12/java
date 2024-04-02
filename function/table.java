package function;
import java.util.*;
public class table {
    public static void printTable(int n){
        for (int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }
    public static void main(String [] argh){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        printTable(n);
    }    
}
