import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	
    	for(int i = 0; i < n; i++) {
    		
    		int sum = 0;
    		int temp = i;
    		
    		while(temp > 0) {
    			
    			sum += temp % 10;
    			
    			temp /= 10;
    		}
    		
    		if(i + sum == n) {
    			System.out.println(i);
    			System.exit(0);
    		}
    	}
    	System.out.println(0);
    }	 
}