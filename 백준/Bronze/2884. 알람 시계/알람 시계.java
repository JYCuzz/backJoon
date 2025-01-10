import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int hour = a * 60 + b;
        int alarm = hour - 45;
        
        if(alarm < 0) {
        	alarm = 24 * 60 + b - 45;
        }
        
        if(alarm == 0) {
        	System.out.println(0 + " " + 0);
        }
        else
        	System.out.println(alarm/60 + " " + alarm%60);
        
    }
}