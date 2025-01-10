import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = Integer.toString(b);
        
        String[] k = c.split("");
        
        for(int i = k.length-1; i >= 0; i--) {
        	
        	int multiply = a * Integer.parseInt(k[i]);
        	
        	System.out.println(multiply);	
        }
        
        System.out.println(a * b);
    }
}