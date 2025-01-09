import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
        	
	        String n = sc.next();
	        
	        if(n.equals("0")) {
	        	System.exit(0);
	        }
	        
	        int sum = 2;
	        
	        for(int i = 0; i < n.length(); i++) {
	        	
	        	if(n.charAt(i) == '1') {
	        		sum += 2;
	        	}
	        	else if(n.charAt(i) == '0') {
	        		sum += 4;
	        	}
	        	else {
	        		sum += 3;
	        	}	
	        }
	        
	        if(n.length() >= 2) {
	        	
	        	sum += n.length()-1;
	        }
	              
	        System.out.println(sum);
        }
        
    }
}