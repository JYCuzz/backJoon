import java.util.*;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
 	
    	int n = sc.nextInt();
    	int count = 0;
    	for(int i = 0; i < n; i++) {
    		
    		String a = sc.next();
    		
        	boolean check[] = new boolean[26];
 	
    		for(int j = 0; j < a.length(); j++) {
    			
    			
    			if(check[a.charAt(j) - 'a'] == true) {
    				count--;
    				break;
    			}
    			
    			if(j < a.length() -1) {
    				
    			
	    			if(a.charAt(j) != a.charAt(j+1)) {
	    				
	    				check[a.charAt(j) - 'a'] = true;
	    			}
    			}
    		}
    		
    		count++;
    		
    	}
    	
    	System.out.println(count);
    }
}
