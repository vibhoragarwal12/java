package function;
import java.util.*;
public class sumofodd {
    public static void oddSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println(sum);  
    }
    public static void main(String [] argh){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        oddSum(n);
    }
}
