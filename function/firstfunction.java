package function;
import java.util.*;
public class firstfunction {
    public static void myname(String name){
        System.out.println(name);
        return;
    }
    public static void main(String []argh){
        Scanner sc= new Scanner(System.in);
        String name= sc.nextLine();
        myname(name);
    }    
}
