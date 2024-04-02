package pattern;
import java.util.*;
public class rhombus {
    public static void main(String[]argh){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=1;i<=n;i++){
            int spaces=(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
