package loops;

import java.util.*;

public class countNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            int rem=n%10;
            if(rem==4){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
