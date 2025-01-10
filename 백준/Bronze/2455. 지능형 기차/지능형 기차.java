import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int max = 0;
        int c = 0;
        
        for(int i = 0; i < 4; i++) {
        	
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	                
	        c = c + b - a;
	        
	        if(c >= max) {
	        	max = c;
	        }
        }
        
        System.out.println(max);
        
        
    }
}