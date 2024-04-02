package pattern;
import java.util.*;
public class hollowbutterfly {
    public static void main(String[]argh){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==j||j==1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }  
            }
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(i==j||j==1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }        
            }
            System.out.println();
        }
        for (int i=n;i>=1;i--){
         for(int j=1;j<=i;j++){
                if(i==j||j==1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }      
            }
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(i==j||j==1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }         
            } 
            System.out.println();  
        }  
    } 
}
