import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i = n; i > 0; i--) {
        	
        	for(int j = 0; j < i; j++) {
        		
        		if(i - j > 0) {
        			System.out.print("*");
        		}
        	}
        	System.out.println("");
        	
        }

    }
}